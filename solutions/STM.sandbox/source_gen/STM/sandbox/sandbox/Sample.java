package STM.sandbox.sandbox;

/*Generated by MPS */


public class Sample {
  private String title;

  public Sample(final String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

  public static void main(final String[] args) {
    String string = "Demo";
    Sample demo = new Sample(string);
    System.out.println("Title: " + demo.title);
  }
}
