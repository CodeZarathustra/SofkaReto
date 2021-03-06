
package dominio;


public class Conductor {
   
    //Atributos
    public String nombre;
    public String nacionalidad;
    public int IdConductor;
    public String equipo;
    public double avance;
    public int puesto; 

    public Conductor() {
    }

    public Conductor(String nombre, String nacionalidad, int IdConductor, String equipo, double avance) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.IdConductor = IdConductor;
        this.equipo = equipo;
        this.avance=this.avance+avance;
    }
//Constructor para registro Persona en base de datos
    public Conductor(String nombre, String nacionalidad, int IdConductor, String equipo, double avance, int puesto) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.IdConductor = IdConductor;
        this.equipo = equipo;
        this.avance = avance;
        this.puesto = puesto;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getIdConductor() {
        return IdConductor;
    }

    public void setIdConductor(int IdConductor) {
        this.IdConductor = IdConductor;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
    
    
    
    
    
    
   
}
