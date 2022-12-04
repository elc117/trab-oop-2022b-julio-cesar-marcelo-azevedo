import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.Document;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class DespensaCrudRepository{
    private final static String DATABASE = "Despensa";
    private final static String COLLECTION = "DespensaEscola";
    private final static String URI = "mongodb+srv://pccli:<zecarioca>@despensa.z6mawvg.mongodb.net/?retryWrites=true&w=majority";

    private MongoCollection<Despensa> collection;


    public DespensaCrudRepository() {
        MongoClient mongoClient = MongoClients.create(URI);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        MongoDatabase database = mongoClient.getDatabase(DATABASE).withCodecRegistry(pojoCodecRegistry);
        collection = database.getCollection(COLLECTION, Despensa.class);
    }
        public void create (Despensa despensa){
            collection.insertOne(despensa);
        }

        public List<Despensa> readAll () {
            List<Despensa> result = new ArrayList<Despensa>();
            collection.find().into(result);
            return result;
        }

        public List<Despensa> readByUrl (String url){
            List<Despensa> result = new ArrayList<Despensa>();
            Document filterByUrl = new Document("url", url);
            collection.find(filterByUrl).into(result);
            return result;
        }

        public void updateTagsByUrl (String url, List < String > tags){
            Document filterByUrl = new Document("url", url);
            collection.updateOne(filterByUrl,
                    new Document("$set", new Document("tags", tags)));

        }

        public void deleteByUrl (String url){
            Document filterByUrl = new Document("url", url);
            collection.deleteOne(filterByUrl);

        }

        public void deleteAll () {
            collection.drop();
        }
    }

