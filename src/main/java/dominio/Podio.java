package dominio;

public class Podio {

    //Atributos
    public String primerPuesto;
    public String segundoPuesto;
    public String tercerPuesto;

    public void definirPodio(String primerPuesto, String segundoPuesto, String tercerPuesto) {
        this.primerPuesto = primerPuesto;
        this.segundoPuesto = segundoPuesto;
        this.tercerPuesto = tercerPuesto;
    }

    public String getPrimerPuesto() {
        return primerPuesto;
    }

    public void setPrimerPuesto(String primerPuesto) {
        this.primerPuesto = primerPuesto;
    }

    public String getSegundoPuesto() {
        return segundoPuesto;
    }

    public void setSegundoPuesto(String segundoPuesto) {
        this.segundoPuesto = segundoPuesto;
    }

    public String getTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(String tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }

}
