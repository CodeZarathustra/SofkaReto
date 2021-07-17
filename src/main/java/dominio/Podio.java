
package dominio;


public class Podio {
    
    //Atributos
    public Conductor primerPuesto;
    public Conductor segundoPuesto;
    public Conductor tercerPuesto;
    
    
    public void definirPodio (Conductor primerPuesto, Conductor segundoPuesto,Conductor tercerPuesto){
        this.primerPuesto=primerPuesto;
        this.segundoPuesto=segundoPuesto;
        this.tercerPuesto=tercerPuesto;
}

    public Conductor getPrimerPuesto() {
        return primerPuesto;
    }

    public void setPrimerPuesto(Conductor primerPuesto) {
        this.primerPuesto = primerPuesto;
    }

    public Conductor getSegundoPuesto() {
        return segundoPuesto;
    }

    public void setSegundoPuesto(Conductor segundoPuesto) {
        this.segundoPuesto = segundoPuesto;
    }

    public Conductor getTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(Conductor tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }
    
}