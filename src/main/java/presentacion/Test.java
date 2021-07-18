
package presentacion;

import dominio.Carrera;
import dominio.Carril;
import dominio.Carro;
import dominio.Conductor;
import dominio.ConductorMaquina;
import dominio.Pista;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Test {
    
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //Mensaje de entrada
        //JOptionPane newPane= new JOptionPane ();
        //newPane.createDialog("Sofka Racing");
        //Instanciar Objetos para carrera;
        Conductor ConductorUsuario= new Conductor("Jorge Armando Blandon","Colombia", 1047,"Mercedes", 0);
        Carro CarroUsuario= new Carro(ConductorUsuario, 06, "Mercedes");
        Carril carrilUsuario= new Carril(07, CarroUsuario);
        Pista pistaCarreraActual= new Pista ("Indianapolis","EE.UU", 4000, 7, 00123);
        ConductorMaquina cpu= new ConductorMaquina();
        cpu.creacionConductores();
        //newPane.createDialog("La carrera ha Comenzado ");
        Carrera nuevaCarrera= new Carrera("200 millas de Indianapolis","30-Julio-2021", pistaCarreraActual);
        nuevaCarrera.sacarConductores();
        nuevaCarrera.avanceCarrera(ConductorUsuario);
        nuevaCarrera.definirTablaPosiciones();
        nuevaCarrera.definirPodioConductor01();
        nuevaCarrera.definirPodioConductor02();
        nuevaCarrera.definirPodioConductor03();
        nuevaCarrera.definirPodioConductor04();
        nuevaCarrera.definirPodioConductor05();
        nuevaCarrera.definirPodioConductorCarrera();
        nuevaCarrera.tablaCarrera();
        
        
        
        
        
        
        
        
    }
}
