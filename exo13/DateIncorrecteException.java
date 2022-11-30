package exo13;

public class DateIncorrecteException extends Exception {
  public DateIncorrecteException(int jour, int mois, int annee){
    super(jour + "/" + mois + "/" + annee + " n'est pas une date valide");
  }
}