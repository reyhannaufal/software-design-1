package ingredients;

public class Mushroom implements Toppingable {

    @Override
    public String sliceIntoPieces() {
        return "I am mushroom topping";
    }
}