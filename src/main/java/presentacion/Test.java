
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
        //Atributos
        String nombreJugador,nacionalidadJugador,marcaAutoJugador;
        //ValoresPista
        String nombrePista= "Indianpolis";
        String paisPista="EE.UU";
        int longitudPista= 4000;
        int numeroCarriles= 7;
        int codigoPista=0000750;
        //ValoresCarrera
        String nombreCarrera= "200 millas de Indianapolis";
        String fechaCarrera= "30-Julio-2021";
       
        
        //Scanner sc= new Scanner(System.in);
        //Mensaje de entrada
        //JOptionPane newPane= new JOptionPane ();
        //newPane.createDialog("Sofka Racing");
        //Instanciar Objetos para carrera;
        JOptionPane.showMessageDialog(null,"SOFKA RACING GAME\n ARE YOU READY? <>_<>");
//        JOptionPane.showMessageDialog(null,"Bienvenido!");
        nombreJugador=JOptionPane.showInputDialog("Ingrese Nombre de Jugador");
        nacionalidadJugador=JOptionPane.showInputDialog("Ingrese Nacionalidad");
        marcaAutoJugador=JOptionPane.showInputDialog("Ingrese Marca de Auto");
        Conductor ConductorUsuario= new Conductor(nombreJugador,nacionalidadJugador, 77,marcaAutoJugador, 0);
        Carro CarroUsuario= new Carro(ConductorUsuario, 06, marcaAutoJugador);
        Carril carrilUsuario= new Carril(06, CarroUsuario);
        Pista pistaCarreraActual= new Pista (nombrePista,paisPista,longitudPista, numeroCarriles, codigoPista);
        //Datos de Pista
        JOptionPane.showMessageDialog(null,"Pista: \n"+ nombrePista);
        JOptionPane.showMessageDialog(null,"Pais: \n"+paisPista);
        JOptionPane.showMessageDialog(null,"Kilometros: \n"+longitudPista);
        JOptionPane.showMessageDialog(null,"Codigo de Pista: \n"+ codigoPista);
      
        ConductorMaquina cpu= new ConductorMaquina();
        cpu.creacionConductores();
        //newPane.createDialog("La carrera ha Comenzado ");
        Carrera nuevaCarrera= new Carrera(nombreCarrera,fechaCarrera, pistaCarreraActual);
        //Datos de Carrera
        JOptionPane.showMessageDialog(null,"Carrera|\n"+ nombreCarrera);
        JOptionPane.showMessageDialog(null,"Fecha: \n"+ fechaCarrera);
        JOptionPane.showMessageDialog(null,"Pista: \n"+ pistaCarreraActual.nombrePista);
        //Datos conductor
        JOptionPane.showMessageDialog(null,"Datos Jugador \n");
        JOptionPane.showMessageDialog(null,"Nombre: \n"+ nombreJugador);
        JOptionPane.showMessageDialog(null,"Nacionalidad: \n"+ nacionalidadJugador);
        JOptionPane.showMessageDialog(null,"Auto: \n"+marcaAutoJugador);
        JOptionPane.showMessageDialog(null,"Carril Asignado: \n"+ carrilUsuario.numeroCarril);
        //Mensaje Instruccion
        JOptionPane.showMessageDialog(null,"A continuación tiene 3 intentos para lanzar dado");
        
        for (int i=0;i<3;i++) {
            int imput =JOptionPane.showConfirmDialog(null,"Lanzar dado","Buena Suerte!",JOptionPane.DEFAULT_OPTION);
            
            if(imput==0) {
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
        nuevaCarrera.imprimirPodio();
       
    }
}
