public class PseudoRandom {
  private int seed;
  private int multiplier;
  private int increment;
  private int modulus;

  public PseudoRandom(int inSeed, int InMultiplier, int inIncrement, int inModulus) {
    seed = inSeed;
    multiplier = InMultiplier;
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
}
