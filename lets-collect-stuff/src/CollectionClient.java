import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {

        //ROCK COLLECTION
        List<Collectable> collection = new ArrayList<Collectable>();

        Collectable rock = new Collectable("rock",2,"scratched",1.00,"common");
        collection.add(rock);
        // Add collection methods here to manage and manipulate the collection
    }
}
