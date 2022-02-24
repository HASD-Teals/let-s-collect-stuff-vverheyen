import java.util.*;

public class CollectionClient {
    public static Scanner sc = new Scanner(System.in).useDelimiter(System.lineSeparator());

    public static void main(String[] args) throws Exception {

        // ROCK COLLECTION
        List<Collectable> collection = new ArrayList<Collectable>();

        Collectable rock = new Collectable("rock", "red brown", 5, "scratched", 1.0);
        Collectable calcite = new Collectable("calcite", "orange", 2, "shiny", 4.0);
        Collectable obsidian = new Collectable("obsidian", "black", 4, "glassy", 5.0);
        Collectable emerald = new Collectable("emerald", "green", 1, "brilliant", 200.0);
        Collectable carnelian = new Collectable("carnelian", "red", 3, "chunky", 4.0);

        collection.add(rock);
        collection.add(calcite);
        collection.add(obsidian);
        collection.add(emerald);
        collection.add(carnelian);
        add(collection, "lapiz lazuli", "blue", 3, "pristine", 7.00);
        displayCollection(collection);

    }

    public static void add(List<Collectable> a, String name, String color, int size, String condition,
            double cost) {
                Collectable bob = new Collectable(name, color, size, condition, cost);
                a.add(bob);
        
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
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();
    }

    public static void collectionSearch(List<Collectable> a) {
        System.out.println("Are you searching by 1. int or 2. String? ");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println("Enter your search term: ");
            int c = sc.nextInt();
            for (int i = 0; i < a.size(); i++) {
                int index = 0;
                if (c == a.get(i).getSize()) {
                    index = i;
                }
                if (c == a.get(i).getCost()) {
                    index = i;
                }
                if (index > 0) {
                    System.out.println(a.get(index));
                }
            }
        }

        if (b == 2) {
            System.out.println("Enter your search term: ");
            String c = sc.next();
            for (int i = 0; i < a.size(); i++) {
                int index = 0;

                if (a.get(i).getName().equals(c)) {
                    index = i;
                }
                if (a.get(i).getCondition().equals(c)) {
                    index = i;
                }
                if (a.get(i).getColor().equals(c)) {
                    index = i;
                }
                if (index > 0) {
                    System.out.println(a.get(index));
                }

            }
        }
    }

    public static void collectionSort(List<Collectable> a) {
        System.out.println("What property would you like to sort by?");
        System.out.println("1. name, 2. color, 3. size, 4. condition, 5. cost");
        int num = sc.nextInt();
        if (num == 1) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    int b = a.get(i).getName().compareTo(a.get(j).getName());
                    if (b < 0) {
                        Collectable temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }
            displayCollection(a);
        }

        if (num == 2) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    int b = a.get(i).getColor().compareTo(a.get(j).getColor());
                    if (b < 0) {
                        Collectable temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }
            displayCollection(a);
        }

        if (num == 3) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(i).getSize() < a.get(j).getSize()) {
                        Collectable temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }
            displayCollection(a);
        }

        if (num == 4) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    int b = a.get(i).getCondition().compareTo(a.get(j).getCondition());
                    if (b < 0) {
                        Collectable temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }
            displayCollection(a);
        }

        if (num == 5) {
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(i).getCost() < a.get(j).getCost()) {
                        Collectable temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }
            displayCollection(a);
        }
        sc.close();
    }

}

