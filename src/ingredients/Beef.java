package ingredients;

/**
 * Beef
 */
public class Beef implements Toppingable {
  @Override
  public String sliceIntoPieces() {
      return "This beef topping is ready";
  }
}