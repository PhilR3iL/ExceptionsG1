package exo11;

public class EntierNaturel {
  private int nombre;

  public EntierNaturel(int n) throws MauvaiseConstanteException {
    if (n < 0)
      throw new MauvaiseConstanteException(n);
    this.nombre = n;
  }

  @Override
  public String toString() {
    return Integer.toString(nombre);
  }
}