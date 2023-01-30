public class PseudoRandom {
  private int seed;
  private int multiplier;
  private int increment;
  private int modulus;

  public PseudoRandom(int inMultiplier, int inSeed, int inIncrement, int inModulus) {
    seed = inSeed;
    multiplier = inMultiplier;
    increment = inIncrement;
    modulus = inModulus;
  }

  public void setSeed(int newSeed) {
    seed = newSeed;
  }

  public void setMultiplier(int newMultiplier) {
    multiplier = newMultiplier;
  }

  public void setIncrement(int newIncrement) {
    increment = newIncrement;
  }

  public void setModulus(int newModulus) {
    modulus = newModulus;
  }

  public int generateNextNum() {
    int result = (multiplier * seed + increment) % modulus;
    this.seed = result;
    return result;
  }

  public static void main(String[] args) {
    PseudoRandom test1 = new PseudoRandom(40, 1, 3641, 729);
    System.out.println(test1.generateNextNum());
    System.out.println(test1.generateNextNum());
    System.out.println(test1.generateNextNum());
  }
}
