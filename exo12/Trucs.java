package exo12;

public class Trucs {
  public static double inverse(double x) {
    double inv = 1.0 /x;
    return Double.isFinite(inv) ? inv : 0.0;
  }
}