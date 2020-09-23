package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class Parity {
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    // TODO - you fill in here.
    int acc = 0;
    while (x != 0) {
      acc += (x & 1);
      x >>>= 1;
    }
    if (acc % 2 == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.exit(GenericTest.runFromAnnotations(args, "Parity.java", new Object() {
    }.getClass().getEnclosingClass()).ordinal());
  }
}
