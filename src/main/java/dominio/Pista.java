
package dominio;


public class Pista {
    //Atributos
    public String nombrePista;
    public String pais;
    public double kilometros;
    public int numeroCarriles;
    public int IDpista;

    public Pista(String nombrePista, String pais, double kilometros, int numeroCarriles, int IDpista) {
        this.nombrePista = nombrePista;
        this.pais = pais;
        this.kilometros = kilometros;
        this.numeroCarriles = numeroCarriles;
        this.IDpista = IDpista;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumeroCarriles() {
        return numeroCarriles;
    }

    public void setNumeroCarriles(int numeroCarriles) {
        this.numeroCarriles = numeroCarriles;
    }

    public int getIDpista() {
        return IDpista;
    }

    public void setIDpista(int IDpista) {
        this.IDpista = IDpista;
    }
    
}
