public class Collectable {

    //PROPERITIES
    private String name;
    private int age;
    private String condition;
    private double cost;
    private String rarity;

    //DEFAULT CONSTRUCTOR
    public Collectable() {
        this.name = "";
        this.age = 0;
        this.condition = "";
        this.cost = 0.0;
        this.rarity = "";
    }

    //OVERRIDE CONSTRUCTOR
    public Collectable(String name, int age, String condition, double cost, String rarity) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.cost = cost;
        this.rarity = rarity;
    }

    //ACCESSOR
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age; 
    }
    public String getCondition () {
        return this.condition;
    }
    public double getCost() {
        return this.cost;
    }
    public String getRarity () {
        return this.rarity;
    }

    //MUTATOR
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setRarity (String rarity) {
        this.rarity = rarity;
    }

    //METHODS
    public String report() {
        return name + "," + age + "," + condition + "," + cost + "," + rarity;
    }
    public String toString() {
        return report();
    }
    public void Equal(Collectable a, Collectable b) {
        if (a == b) {
            System.out.println("They are the same");
        }
        else { System.out.println("They are not the same"); }
    }
}
