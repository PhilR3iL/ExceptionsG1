package exo22;

public class Methodes{
  public static int somme(String[] tab){
    int somme = 0;
    for (int index = 0; index < tab.length; index++) {
      try{
        somme += Integer.parseInt(tab[index]);
      }catch(NumberFormatException e){
        System.err.println(tab[index] + " n'est pas un entier.");
      }
    }
    return somme;
  }
}