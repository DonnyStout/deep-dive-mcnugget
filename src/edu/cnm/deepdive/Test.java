package edu.cnm.deepdive;

public class Test {

  public static void main(String[] args) {
    //int upperLimit = (args.length > 0) ? Integer.parseInt (args[0]) : 100;
    int[] sizes = {6, 9, 20};
    Composable tester = new McNugget();
    for (int x = 1; x <= 100; x++) {
      //boolean result = McNugget.test(x, sizes);
      System.out.printf("%d %b %n", x, tester.test(x, sizes));
      //System.out.printf("%d %b %n", x, result);
      //String judgyResult = result ? "Mcnugget" : "Eat";
      //System.out.printf("%d %s %n", x, judgyResult);
    }
  }
}
