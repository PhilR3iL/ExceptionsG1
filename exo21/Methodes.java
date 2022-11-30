package exo21;

public class Methodes {
  public static int[] push(int[] tableau, int valeur, int indice) throws ArrayIndexOutOfBoundsException {
    try {
      int[] nouveau = new int[tableau.length + 1];
      for (int index = 0; index < indice; index++) {
        nouveau[index] = tableau[index];
      }
      nouveau[indice] = valeur;
      for (int index = indice; index < tableau.length; index++) {
        nouveau[index + 1] = tableau[index];
      }
      return nouveau;
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      throw e;
    }
  }

  public static int[] erase(int[] tableau, int indice) throws ArrayIndexOutOfBoundsException {
    try {
      int[] nouveau = new int[tableau.length - 1];
      for (int index = 0; index < indice; index++) {
        nouveau[index] = tableau[index];
      }
      for (int index = indice; index < tableau.length; index++) {
        nouveau[index - 1] = tableau[index];
      }
      return nouveau;
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      throw e;
    }
  }
}