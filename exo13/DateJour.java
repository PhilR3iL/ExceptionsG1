package exo13;

public class DateJour {
  private int jour, mois, annee;

  public DateJour(int jour, int mois, int an) throws DateIncorrecteException{
    if(!estValide(jour, mois, an))
      throw new DateIncorrecteException(jour, mois, an);
    this.jour = jour;
    this.mois = mois;
    this.annee = an;
  }

  private static boolean estBissextile(int an){
    return (an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);
  }

  private static final int[] JOURS_PAR_MOIS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  private static boolean estValide(int jour, int mois, int an){
    boolean ret = true;
    if(jour < 1 || mois < 1 || mois > 12){
      ret = false;
    }else{
      int bonus = (mois == 2 && estBissextile(an)) ? 1 : 0;
      int jourMax = DateJour.JOURS_PAR_MOIS[mois] + bonus;
      if(jour > jourMax)
        ret =false;
    }
    return ret;
  }
  
}