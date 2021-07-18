package dominio;

import java.util.ArrayList;


public class ConductorMaquina extends Conductor{
    //Creacion conductores-Maquina
    //Conductor n01, n02, n03,n04,n05;
    

    public ArrayList creacionConductores() {
        //Primer Conductor
        Conductor n01= new Conductor("Lewis Hamilton","Reino Unido",1,"Mercedes GP", 0);
        n01.avance=new Dado().lanzarDado();
        //Segundo Conductor
        Conductor n02= new Conductor("Sabastian Vettel","Alemania",2,"Ferrari",0);
        n02.avance=new Dado().lanzarDado();
        //Tercer Conductor
        Conductor n03= new Conductor("Valttri Bottas","Finlandia",3,"Red Bull",0);
        n03.avance=new Dado().lanzarDado();
        //Cuarto Conductor
        Conductor n04= new Conductor("Fernando Alonso","España",4,"Mclaren Renault",0);
        n04.avance=new Dado().lanzarDado();
        //Quinto conductor
        Conductor n05= new Conductor("Lance Stroll","Canada",5,"Williams",0);
        n05.avance= new Dado().lanzarDado();
        
        ArrayList<Conductor> listaConductores= new ArrayList<Conductor>();
        listaConductores.add(0,n01);
        listaConductores.add(1,n02);
        listaConductores.add(2,n03);
        listaConductores.add(3,n04);
        listaConductores.add(4,n05);
        
        return listaConductores;
    }
}