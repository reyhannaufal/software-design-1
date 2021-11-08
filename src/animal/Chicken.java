package animal;

/**
 * Chicken
 */
public class Chicken {
    private int age;
    private double weight;

    public Chicken(int age, double weight) {
        this.setAge(age);
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eat() {
        return "I am eating chicken";
    }
}