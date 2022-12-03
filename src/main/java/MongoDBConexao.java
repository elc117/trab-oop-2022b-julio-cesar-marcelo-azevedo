import java.util.ArrayList;

import com.mongodb.client.*;
import org.bson.Document;

public class MongoDBConexao {
    private final static String DATABASE = "Despensa";
    private final static String COLLECTION = "DespensaEscola";

    public static void main(String[] args) {

        String uri = "mongodb+srv://pccli:<zecarioca>@despensa.z6mawvg.mongodb.net/?retryWrites=true&w=majority\n" +
                "\n";

        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(DATABASE);
        MongoCollection<Document> collection = database.getCollection(COLLECTION);

        FindIterable<Document> iter = collection.find();
        for (Document d : iter) {
            System.out.println(d);

        }
    }
}
