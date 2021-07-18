
package dominio;


public class Dado {
    
    
    public double lanzarDado () {
        
        double resultadoDado=Math.floor(Math.random()*6+1);
        double avanceMetros=(resultadoDado*100)/13+Math.random();
        return avanceMetros;
    }
    
}
