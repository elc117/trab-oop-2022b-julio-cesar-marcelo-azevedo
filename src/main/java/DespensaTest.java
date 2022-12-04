import java.util.Arrays;
public class DespensaTest {
    public static void main(String[] args) {
        DespensaCrudRepository repo = new DespensaCrudRepository();

        Despensa d = new Despensa("frango", "proteína");

        repo.create(d);

        for (Despensa item : repo.readAll()) {
            System.out.println(item.getNome());
        }

        for (Despensa item : repo.readAll()) {
            System.out.println(item.getTipo());
        }

    }
}
