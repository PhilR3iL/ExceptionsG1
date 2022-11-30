package exo11;

public class Test11 {
  public static void main(){
    try{
      System.out.println(new EntierNaturel(4));
      System.out.println(new EntierNaturel(0));
      System.out.println(new EntierNaturel(-621));
    }catch(MauvaiseConstanteException e){
      System.err.println("OSKOUR");
      System.err.println(e);
      System.err.println(e.n + " n'est pas un entier naturel... :(");
    }
  }
}