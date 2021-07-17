
package dominio;


public class Dado {
    
    
    public int lanzarDado () {
        
        int resultadoDado=(int) Math.floor(Math.random()*6+1);
        int avanceMetros= resultadoDado*100;
        return avanceMetros;
    }
    
}
