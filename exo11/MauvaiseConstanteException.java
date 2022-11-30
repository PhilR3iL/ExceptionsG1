package exo11;

import java.lang.Exception;

public class MauvaiseConstanteException extends Exception {

  public final int n;

  public MauvaiseConstanteException(String message, int n){
    super(message);
    this.n = n;    
  }
  
  public MauvaiseConstanteException(int n){
    super("Erreur de constante");
    this.n = n;    
  }
} 
  

   
  