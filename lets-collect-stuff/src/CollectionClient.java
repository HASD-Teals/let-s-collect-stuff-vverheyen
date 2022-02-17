import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionClient {
    public static Scanner sc = new Scanner(System.in).useDelimiter(System.lineSeparator());

    public static void main(String[] args) throws Exception {

        // ROCK COLLECTION
        List<Collectable> collection = new ArrayList<Collectable>();

        Collectable rock = new Collectable("rock", "red brown", 5, "scratched", 1.0);
        Collectable calcite = new Collectable("calcite", "orange", 2, "shiny", 4.0);
        Collectable obsidian = new Collectable("obsidian", "black", 4, "glassy", 5.0);
        Collectable emerald = new Collectable("emerald","green", 1, "brilliant", 200.0);
        Collectable carnelian = new Collectable("carnelian", "red", 3, "chunky", 4.0);

        collection.add(rock);
        collection.add(calcite);
        collection.add(obsidian);
        collection.add(emerald);
        collection.add(carnelian);
        
        collectionSearch(collection);

        // Add collection methods here to manage and manipulate the collection
    }
    //UNDER CONSTRUCTION
    public static void add(List<Collectable> a, Collectable name, String color, int size, String condition, double cost) {
        //name = new Collectable(name, color, size, condition, cost);
        //a.add(Collectable);
    }
    public static void sell(List<Collectable> a, int index) {
        a.remove(index);
    }

    public static void collectionSize(List<Collectable> a) {
        System.out.println("This collection has " + a.size() + " items");
    }

    public static void colletionValue(List<Collectable> a) {
        int num = 0;
        for (int i = 0; i < a.size(); i++) {
            num += a.get(i).getCost();
        }
        System.out.println("This collection's value is " + num);
    }
    public static void displayItem(List<Collectable> a, int index) {
        System.out.println(a.get(index));
        System.out.println();
    }
    public static void displayCollection(List<Collectable> a) {
        for (int i=0; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();
    }

    //UNDER CONSTRUCTION
    public static void collectionSearch(List<Collectable> a) {
        System.out.println("Are you searching by int or String? ");
        String b = sc.next();
        if (b == "int") {
            System.out.println("Enter your search term: ");
            int c = sc.nextInt();
            for (int i = 0; i < a.size(); i++) {
                int index = 0;
                if (c == a.get(i).getSize()) { index = i; }
                if (c == a.get(i).getCost()) { index = i; }
                if (index > 0 ) {
                    System.out.println(a.get(index));
                }
            }
        }

        if (b == "String") {
            System.out.println("Enter your search term: ");
            String c = sc.next();
            for (int i = 0; i < a.size(); i++) {
                int index = 0;
                if (b == a.get(i).getName()) {
                    index = i;
                }
                if (b == a.get(i).getCondition()) {
                    index = i;
                }
                if (b == a.get(i).getColor()) {
                    index = i;
                }
                if (index > 0) {
                    System.out.println(a.get(index));
                }

            }
        }
        sc.close();
    }

    //ALSO UNDER CONSTRUCTION
    public static void collectionSort(List<Collectable> a, String property) {
        System.out.println("What property would you like to sort by?");
        System.out.println("1. name, 2. color, 3. size, 4. condition, 5. cost");
        int num = sc.nextInt();
            if (num == 1) {
            
            }
            if (num == 2) {

            }
            if (num == 3) {

            }
            if (num == 4) {

            }
            if (num == 5) {

            }
    }
}
