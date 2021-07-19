package dominio;

public class Carril {

    //atributos
    public int numeroCarril;
    Carro carroAsignado;

    public Carril(int numeroCarril, Carro carroAsignado) {
        this.numeroCarril = numeroCarril;
        this.carroAsignado = carroAsignado;
    }

    public int getNumeroCarril() {
        return numeroCarril;
    }

    public void setNumeroCarril(int numeroCarril) {
        this.numeroCarril = numeroCarril;
    }

    public Carro getCarroAsignado() {
        return carroAsignado;
    }

    public void setCarroAsignado(Carro carroAsignado) {
        this.carroAsignado = carroAsignado;
    }

}
