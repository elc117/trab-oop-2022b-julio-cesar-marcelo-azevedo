package org.example;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class DespensaCrudRepositorio {

    private final static String DATABASE = "Despensa";
    private final static String COLLECTION = "DespensaEscola";
    private final static String URI =  "mongodb+srv://pccli:zecarioca@despensa.z6mawvg.mongodb.net/?retryWrites=true&w=majority";

    private MongoCollection<Despensa> collection;

    public DespensaCrudRepositorio() {
        MongoClient mongoClient = MongoClients.create(URI);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        MongoDatabase database = mongoClient.getDatabase(DATABASE).withCodecRegistry(pojoCodecRegistry);
        collection = database.getCollection(COLLECTION, Despensa.class);
    }

    public void create(Despensa despensa) {
        collection.insertOne(despensa);
    }

    public List<Despensa> readAll() {
        List<Despensa> result = new ArrayList<Despensa>();
        collection.find().into(result);
        return result;
    }

    public List<Despensa> readByType(String type) {
        List<Despensa> result = new ArrayList<Despensa>();
        Document filterByType = new Document("tipo", type);
        collection.find(filterByType).into(result);
        return result;
    }

    public List<Despensa> readByName(String name) {
        List<Despensa> result = new ArrayList<Despensa>();
        Document filterByName = new Document("nome", name);
        collection.find(filterByName).into(result);
        return result;
    }

    public void updateTagsByType(String type) {
        Document filterByType = new Document("tipo", type);
        collection.updateOne(filterByType,
                new Document("$set", new Document("tipo", type)));

    }

    public void updateTagsByName(String name) {
        Document filterByName = new Document("nome", name);
        collection.updateOne(filterByName,
                new Document("$set", new Document("nome", name)));

    }

    public void deleteByName(String name) {
        Document filterByName= new Document("nome", name);
        collection.deleteOne(filterByName);

    }

    public void deleteByType(String type) {
        Document filterByType= new Document("tipo", type);
        collection.deleteOne(filterByType);

    }

    public void deleteAll() {
        collection.drop();
    }
}

