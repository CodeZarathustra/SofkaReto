
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
       
        
        Scanner sc= new Scanner(System.in);
        //Mensaje de Entrada
        System.out.println("----------------------------------------------------");
        System.out.println("SOFKA GAME RACE");
        System.out.println("----------------------------------------------------");
        //OJO-Estar atento a la conversion de datos
        System.out.println("1. Ingrese nombre del Jugador: ");
        nombreJugador=sc.nextLine();
        System.out.println("....................................................");
        System.out.println("2. Ingrese Nacionalidad del Jugador: ");
        nacionalidadJugador=sc.nextLine();
        System.out.println("....................................................");
        System.out.println("3. Ingrese Marca de Automovil: ");
        marcaAutoJugador=sc.nextLine();
        Conductor ConductorUsuario= new Conductor(nombreJugador,nacionalidadJugador, 77,marcaAutoJugador, 0);
        Carro CarroUsuario= new Carro(ConductorUsuario, 06, marcaAutoJugador);
        Carril carrilUsuario= new Carril(06, CarroUsuario);
        Pista pistaCarreraActual= new Pista (nombrePista,paisPista,longitudPista, numeroCarriles, codigoPista);
        //Datos de Pista
        System.out.println("----------------------------------------------------");
        System.out.println("DATOS DE PISTA");
        System.out.println("Pista: |"+ nombrePista);
        System.out.println("Pais: |"+paisPista);
        System.out.println("Kilometros: |"+longitudPista);
        System.out.println("Codigo de Pista: |"+ codigoPista);
        System.out.println("----------------------------------------------------");
        //Incripción y creación de conductores
        ConductorMaquina cpu= new ConductorMaquina();
        cpu.creacionConductores();
        //newPane.createDialog("La carrera ha Comenzado ");
        Carrera nuevaCarrera= new Carrera(nombreCarrera,fechaCarrera, pistaCarreraActual);
        //Datos de Carrera
        System.out.println("DATOS DE CIRCUITO");
        System.out.println("Carrera |"+ nombreCarrera);
        System.out.println("Fecha:  |"+ fechaCarrera);
        System.out.println("Pista Asignada:  |"+ pistaCarreraActual.nombrePista);
        System.out.println("----------------------------------------------------");
        //Datos conductor
        System.out.println("[DATOS DEL JUGADOR]");
        System.out.println("Nombre: |"+ nombreJugador);
        System.out.println("Nacionalidad: |"+ nacionalidadJugador);
        System.out.println("Auto: |"+marcaAutoJugador);
        System.out.println("Carril Asignado: |"+ carrilUsuario.numeroCarril);
        System.out.println("----------------------------------------------------");
        //Mensaje Instruccion
        System.out.println("*****************************************************");
        System.out.println("A continuación tiene 3 intentos para lanzar dado");
        System.out.println("*****************************************************");
        
        for (int i=0;i<3;i++) {
            int imput;
            imput = JOptionPane.showConfirmDialog(null,"Lanzar dado","Buena Suerte!",JOptionPane.DEFAULT_OPTION);
            
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
        nuevaCarrera.guardarDatos();
    }
}
