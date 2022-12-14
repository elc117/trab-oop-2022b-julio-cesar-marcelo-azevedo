package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class NutricionistaCrudRepositorio {

    private final static String DATABASE = "Nutricionista";
    private final static String COLLECTION = "Calorias";
    private final static String URI = "mongodb+srv://pccli:zecarioca@despensa.z6mawvg.mongodb.net/?retryWrites=true&w=majority";

    private MongoCollection<Nutricionista> collection;

    public NutricionistaCrudRepositorio() {
        MongoClient mongoClient = MongoClients.create(URI);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        MongoDatabase database = mongoClient.getDatabase(DATABASE).withCodecRegistry(pojoCodecRegistry);
        collection = database.getCollection(COLLECTION, Nutricionista.class);
    }

    public void create(Nutricionista nutricionista) {
        collection.insertOne(nutricionista);
    }

    public List<Nutricionista> readAll() {
        List<Nutricionista> result = new ArrayList<Nutricionista>();
        collection.find().into(result);
        return result;
    }

    public List<Nutricionista> readByName(String name) {
        List<Nutricionista> result = new ArrayList<Nutricionista>();
        Document filterByName = new Document("nome", name);
        collection.find(filterByName).into(result);
        return result;
    }

    public List<Nutricionista> readByWeight(int weight) {
        List<Nutricionista> result = new ArrayList<Nutricionista>();
        Document filterByWeight = new Document("peso", weight);
        collection.find(filterByWeight).into(result);
        return result;
    }

    public List<Nutricionista> readByCalories(int calories) {
        List<Nutricionista> result = new ArrayList<Nutricionista>();
        Document filterByCalories = new Document("calorias", calories);
        collection.find(filterByCalories).into(result);
        return result;
    }

    public void updateWeight(int weight) {
        Document filterByWeight = new Document("peso", weight);
        collection.updateOne(filterByWeight,
                new Document("$set", new Document("peso", weight)));

    }

    public void updateCalories(int calories) {
        Document filterByCalories= new Document("calorias", calories);
        collection.updateOne(filterByCalories,
                new Document("$set", new Document("calorias", calories)));

    }

    public void updateName(String name) {
        Document filterByName = new Document("nome", name);
        collection.updateOne(filterByName,
                new Document("$set", new Document("nome", name)));

    }
}

