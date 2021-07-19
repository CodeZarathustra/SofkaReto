
package dominio;

public class Carro {

    //Atributos 
    public Conductor conductorCarro;
    public int idCarro;
    public String marca;

    public Carro(Conductor conductorCarro, int idCarro, String marca) {
        this.conductorCarro = conductorCarro;
        this.idCarro = idCarro;
        this.marca = marca;

    }

    public Conductor getConductorCarro() {
        return conductorCarro;
    }

    public void setConductorCarro(Conductor conductorCarro) {
        this.conductorCarro = conductorCarro;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setId(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
