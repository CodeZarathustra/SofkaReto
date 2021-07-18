
package dominio;

import java.util.ArrayList;


public class Carrera {
    //Atributos de clase
    public String nombreCarrera;
    public String horario;
    public Pista pistaCarrera;
    public Podio podioCarrera;

    //-------------------------------------------------------------------------
    //Atributos para para guardar valores de Participantes e imprimir
    //por consola.
    //Primer Puesto
    public int primerPuestoID;
    public String primerPuestoNombre;
    public String primerPuestoNacionalidad;
    public double primerPuestoKilometraje;
    //SegundoPuesto
    public int segundoPuestoID;
    public String segundoPuestoNombre;
    public String segundoPuestoNacionalidad;
    public double segundoPuestoKilometraje;
    //TercerPuesto
    public int tercerPuestoID;
    public String tercerPuestoNombre;
    public String tercerPuestoNacionalidad;
    public double tercerPuestoKilometraje;
    //Cuarto puerto
    public int cuartoPuestoID;
    public String cuartoPuestoNombre;
    public String cuartoPuestoNacionalidad;
    public double cuartoPuestoKilometraje;
    //Quinto puesto 
    public int quintoPuestoID;
    public String quintoPuestoNombre;
    public String quintoPuestoNacionalidad;
    public double quintoPuestoKilometraje;
    //SextoPuesto
    public int sextoPuestoID;
    public String sextoPuestoNombre;
    public String sextoPuestoNacionalidad;
    public double sextoPuestoKilometraje;
    //-------------------------------------------------------------------------
    //Objetos conductor Maquina y Jugador Usuario
    public Conductor conductorPosicion01;
    public Conductor conductorPosicion02;
    public Conductor conductorPosicion03;
    public Conductor conductorPosicion04;
    public Conductor conductorPosicion05;
    public Conductor conductorCarrera;
    //Tabla arreglo
    double tablaPosiciones[];
    double aux;
    int nElementos = 6;

 //-----------------------------------------------------------------------------

    public Carrera(String nombreCarrera, String horario, Pista pistaCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.horario = horario;
        this.pistaCarrera = pistaCarrera;
    }
  //----------------------------------------------------------------------------
    //Metodo para avanzar jugador
    public void avanceCarrera(Conductor conductorCarrera) {
        this.conductorCarrera = conductorCarrera;
        Dado nuevoDado = new Dado();
        conductorCarrera.avance = nuevoDado.lanzarDado();
    }
  //---------------------------------------------------------------------------
    public void sacarConductores() {
        //Instanciar conductor Maquina
        ConductorMaquina nuevoConductorMaquina = new ConductorMaquina();
        ArrayList posiciones = nuevoConductorMaquina.creacionConductores();
        conductorPosicion01 = (Conductor) posiciones.get(0);
        conductorPosicion02 = (Conductor) posiciones.get(1);
        conductorPosicion03 = (Conductor) posiciones.get(2);
        conductorPosicion04 = (Conductor) posiciones.get(3);
        conductorPosicion05 = (Conductor) posiciones.get(4);
        //Estructura While Carrera
        //while(conductorCarrera.avance<pistaCarrera.kilometros){
        //For para ala iteraciones  
    }
    //--------------------------------------------------------------------------
  //Metodo para definir podium
    public void definirTablaPosiciones() {
    
    //Acumular Kilometraje en una variables para cada conductor. Hasta que se cumpla el condicional de que 
    //todos los valores del array hayan sobre pasado el valor en Kilometros de la pista de Carrera
        //do {
            tablaPosiciones = new double[nElementos];
            tablaPosiciones[0] = conductorPosicion01.avance;
            tablaPosiciones[1] = conductorPosicion02.avance;
            tablaPosiciones[2] = conductorPosicion03.avance;
            tablaPosiciones[3] = conductorPosicion04.avance;
            tablaPosiciones[4] = conductorPosicion05.avance;
            tablaPosiciones[5] = conductorCarrera.avance;

            //Metodo Burbuja para organizar Podio
            for (int i = 0; i < (nElementos-1); i++) {
                for (int j = 0; j < (nElementos-1); j++) {
                    if (tablaPosiciones[j] > tablaPosiciones[j + 1]) {
                        aux = tablaPosiciones[j];
                        tablaPosiciones[j] = tablaPosiciones[j + 1];
                        tablaPosiciones[j + 1] = aux;

                    }
                }
            }
        } 
/*while (pistaCarrera.kilometros == tablaPosiciones[0] || pistaCarrera.kilometros == tablaPosiciones[1]
                || pistaCarrera.kilometros == tablaPosiciones[2] || pistaCarrera.kilometros == tablaPosiciones[3]
                || pistaCarrera.kilometros ==tablaPosiciones[4] || pistaCarrera.kilometros == tablaPosiciones[5]);*/
 
    
   //--------------------------------------------------------------------------
     
    
  //---------------------------------------------------------------------------
    public void definirPodioConductor01() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorPosicion01.avance) {
            primerPuestoID = conductorPosicion01.IdConductor;
            primerPuestoNombre = conductorPosicion01.nombre;
            primerPuestoNacionalidad = conductorPosicion01.nacionalidad;
            primerPuestoKilometraje = conductorPosicion01.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorPosicion01.avance) {
                segundoPuestoID = conductorPosicion01.IdConductor;
                segundoPuestoNombre = conductorPosicion01.nombre;
                segundoPuestoNacionalidad = conductorPosicion01.nacionalidad;
                segundoPuestoKilometraje = conductorPosicion01.avance;
            } else {
                //Condicional Tercer Puesto
                if (tablaPosiciones[3] == conductorPosicion01.avance) {
                    tercerPuestoID = conductorPosicion01.IdConductor;
                    tercerPuestoNombre = conductorPosicion01.nombre;
                    tercerPuestoNacionalidad = conductorPosicion01.nacionalidad;
                    tercerPuestoKilometraje = conductorPosicion01.avance;
                } else {
                    //  Cuarto puesto
                    if (tablaPosiciones[2] == conductorPosicion01.avance) {
                        cuartoPuestoID = conductorPosicion01.IdConductor;
                        cuartoPuestoNombre = conductorPosicion01.nombre;
                        cuartoPuestoNacionalidad = conductorPosicion01.nacionalidad;
                        cuartoPuestoKilometraje = conductorPosicion01.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorPosicion01.avance) {
                            quintoPuestoID = conductorPosicion01.IdConductor;
                            quintoPuestoNombre = conductorPosicion01.nombre;
                            quintoPuestoNacionalidad = conductorPosicion01.nacionalidad;
                            quintoPuestoKilometraje = conductorPosicion01.avance;
                        } else {
                            //Sexto puesto
                            if (tablaPosiciones[0] == conductorPosicion01.avance) {
                                sextoPuestoID = conductorPosicion01.IdConductor;
                                sextoPuestoNombre = conductorPosicion01.nombre;
                                sextoPuestoNacionalidad = conductorPosicion01.nacionalidad;
                                sextoPuestoKilometraje = conductorPosicion01.avance;
                            }
                        }

                    }

                }

            }
        }

    }

    ;
  
  //----------------------------------------------------------------------------
     
    public void definirPodioConductor02() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorPosicion02.avance) {
            primerPuestoID = conductorPosicion02.IdConductor;
            primerPuestoNombre = conductorPosicion02.nombre;
            primerPuestoNacionalidad = conductorPosicion02.nacionalidad;
            primerPuestoKilometraje = conductorPosicion02.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorPosicion02.avance) {
                segundoPuestoID = conductorPosicion02.IdConductor;
                segundoPuestoNombre = conductorPosicion02.nombre;
                segundoPuestoNacionalidad = conductorPosicion02.nacionalidad;
                segundoPuestoKilometraje = conductorPosicion02.avance;
            } else {
                // Tercer Puesto
                if (tablaPosiciones[3] == conductorPosicion02.avance) {
                    tercerPuestoID = conductorPosicion02.IdConductor;
                    tercerPuestoNombre = conductorPosicion02.nombre;
                    tercerPuestoNacionalidad = conductorPosicion02.nacionalidad;
                    tercerPuestoKilometraje = conductorPosicion02.avance;
                } else {
                    //Cuarto puesto
                    if (tablaPosiciones[2] == conductorPosicion02.avance) {
                        cuartoPuestoID = conductorPosicion02.IdConductor;
                        cuartoPuestoNombre = conductorPosicion02.nombre;
                        cuartoPuestoNacionalidad = conductorPosicion02.nacionalidad;
                        cuartoPuestoKilometraje = conductorPosicion02.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorPosicion02.avance) {
                            quintoPuestoID = conductorPosicion02.IdConductor;
                            quintoPuestoNombre = conductorPosicion02.nombre;
                            quintoPuestoNacionalidad = conductorPosicion02.nacionalidad;
                            quintoPuestoKilometraje = conductorPosicion02.avance;
                        } else {
                            //Sexto puesto
                            if (tablaPosiciones[0] == conductorPosicion02.avance) {
                                sextoPuestoID = conductorPosicion02.IdConductor;
                                sextoPuestoNombre = conductorPosicion02.nombre;
                                sextoPuestoNacionalidad = conductorPosicion02.nacionalidad;
                                sextoPuestoKilometraje = conductorPosicion02.avance;
                            }
                        }

                    }

                }

            }

        }

    }
    //-------------------------------------------------------------------------
    public void definirPodioConductor03() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorPosicion03.avance) {
            primerPuestoID = conductorPosicion03.IdConductor;
            primerPuestoNombre = conductorPosicion03.nombre;
            primerPuestoNacionalidad = conductorPosicion03.nacionalidad;
            primerPuestoKilometraje = conductorPosicion03.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorPosicion03.avance) {
                segundoPuestoID = conductorPosicion03.IdConductor;
                segundoPuestoNombre = conductorPosicion03.nombre;
                segundoPuestoNacionalidad = conductorPosicion03.nacionalidad;
                segundoPuestoKilometraje = conductorPosicion03.avance;
            } else {
                //Tercer Puesto
                if (tablaPosiciones[3] == conductorPosicion03.avance) {
                    tercerPuestoID = conductorPosicion03.IdConductor;
                    tercerPuestoNombre = conductorPosicion03.nombre;
                    tercerPuestoNacionalidad = conductorPosicion03.nacionalidad;
                    tercerPuestoKilometraje = conductorPosicion03.avance;
                } else {
                    //  Cuarto puesto
                    if (tablaPosiciones[2] == conductorPosicion03.avance) {
                        cuartoPuestoID = conductorPosicion03.IdConductor;
                        cuartoPuestoNombre = conductorPosicion03.nombre;
                        cuartoPuestoNacionalidad = conductorPosicion03.nacionalidad;
                        cuartoPuestoKilometraje = conductorPosicion03.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorPosicion03.avance) {
                            quintoPuestoID = conductorPosicion03.IdConductor;
                            quintoPuestoNombre = conductorPosicion03.nombre;
                            quintoPuestoNacionalidad = conductorPosicion03.nacionalidad;
                            quintoPuestoKilometraje = conductorPosicion03.avance;
                        } else {
                            //Sexto puesto
                            if (tablaPosiciones[0] == conductorPosicion03.avance) {
                                sextoPuestoID = conductorPosicion03.IdConductor;
                                sextoPuestoNombre = conductorPosicion03.nombre;
                                sextoPuestoNacionalidad = conductorPosicion03.nacionalidad;
                                sextoPuestoKilometraje = conductorPosicion03.avance;
                            }
                        }

                    }

                }

            }
        }

    }
    //--------------------------------------------------------------------------
    public void definirPodioConductor04() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorPosicion04.avance) {
            primerPuestoID = conductorPosicion04.IdConductor;
            primerPuestoNombre = conductorPosicion04.nombre;
            primerPuestoNacionalidad = conductorPosicion04.nacionalidad;
            primerPuestoKilometraje = conductorPosicion04.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorPosicion04.avance) {
                segundoPuestoID = conductorPosicion04.IdConductor;
                segundoPuestoNombre = conductorPosicion04.nombre;
                segundoPuestoNacionalidad = conductorPosicion04.nacionalidad;
                segundoPuestoKilometraje = conductorPosicion04.avance;
            } else {
                //Condicional Tercer Puesto
                if (tablaPosiciones[3] == conductorPosicion04.avance) {
                    tercerPuestoID = conductorPosicion04.IdConductor;
                    tercerPuestoNombre = conductorPosicion04.nombre;
                    tercerPuestoNacionalidad = conductorPosicion04.nacionalidad;
                    tercerPuestoKilometraje = conductorPosicion04.avance;
                } else {
                    //  Cuarto puesto
                    if (tablaPosiciones[2] == conductorPosicion04.avance) {
                        cuartoPuestoID = conductorPosicion04.IdConductor;
                        cuartoPuestoNombre = conductorPosicion04.nombre;
                        cuartoPuestoNacionalidad = conductorPosicion04.nacionalidad;
                        cuartoPuestoKilometraje = conductorPosicion04.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorPosicion04.avance) {
                            quintoPuestoID = conductorPosicion04.IdConductor;
                            quintoPuestoNombre = conductorPosicion04.nombre;
                            quintoPuestoNacionalidad = conductorPosicion04.nacionalidad;
                            quintoPuestoKilometraje = conductorPosicion04.avance;
                        } else {
                              //Sexto puesto
                            if (tablaPosiciones[0] == conductorPosicion04.avance) {
                                sextoPuestoID = conductorPosicion04.IdConductor;
                                sextoPuestoNombre = conductorPosicion04.nombre;
                                sextoPuestoNacionalidad = conductorPosicion04.nacionalidad;
                                sextoPuestoKilometraje = conductorPosicion04.avance;
                            }
                        }
                      
                    }

                }

            }

        }

    }
 //----------------------------------------------------------------------------
      public void definirPodioConductor05() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorPosicion05.avance) {
            primerPuestoID = conductorPosicion05.IdConductor;
            primerPuestoNombre = conductorPosicion05.nombre;
            primerPuestoNacionalidad = conductorPosicion05.nacionalidad;
            primerPuestoKilometraje = conductorPosicion05.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorPosicion05.avance) {
                segundoPuestoID = conductorPosicion05.IdConductor;
                segundoPuestoNombre = conductorPosicion05.nombre;
                segundoPuestoNacionalidad = conductorPosicion05.nacionalidad;
                segundoPuestoKilometraje = conductorPosicion05.avance;
            } else {
                // Tercer Puesto
                if (tablaPosiciones[3] == conductorPosicion05.avance) {
                    tercerPuestoID = conductorPosicion05.IdConductor;
                    tercerPuestoNombre = conductorPosicion05.nombre;
                    tercerPuestoNacionalidad = conductorPosicion05.nacionalidad;
                    tercerPuestoKilometraje = conductorPosicion05.avance;
                } else {
                    //  Cuarto puesto
                    if (tablaPosiciones[2] == conductorPosicion05.avance) {
                        cuartoPuestoID = conductorPosicion05.IdConductor;
                        cuartoPuestoNombre = conductorPosicion05.nombre;
                        cuartoPuestoNacionalidad = conductorPosicion05.nacionalidad;
                        cuartoPuestoKilometraje = conductorPosicion05.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorPosicion05.avance) {
                            quintoPuestoID = conductorPosicion05.IdConductor;
                            quintoPuestoNombre = conductorPosicion05.nombre;
                            quintoPuestoNacionalidad = conductorPosicion05.nacionalidad;
                            quintoPuestoKilometraje = conductorPosicion05.avance;
                        } else {
                            //Sexto puesto
                            if (tablaPosiciones[0] == conductorPosicion05.avance) {
                                sextoPuestoID = conductorPosicion05.IdConductor;
                                sextoPuestoNombre = conductorPosicion05.nombre;
                                sextoPuestoNacionalidad = conductorPosicion05.nacionalidad;
                                sextoPuestoKilometraje = conductorPosicion05.avance;
                            }
                        }

                    }

                }

            }

        }

    }
 //----------------------------------------------------------------------------
     public void definirPodioConductorCarrera() {
        //Primer Puesto
        if (tablaPosiciones[5] == conductorCarrera.avance) {
            primerPuestoID = conductorCarrera.IdConductor;
            primerPuestoNombre = conductorCarrera.nombre;
            primerPuestoNacionalidad = conductorCarrera.nacionalidad;
            primerPuestoKilometraje = conductorCarrera.avance;
        } else {
            //Segundo Puesto
            if (tablaPosiciones[4] == conductorCarrera.avance) {
                segundoPuestoID = conductorCarrera.IdConductor;
                segundoPuestoNombre = conductorCarrera.nombre;
                segundoPuestoNacionalidad = conductorCarrera.nacionalidad;
                segundoPuestoKilometraje = conductorCarrera.avance;
            } else {
                // Tercer Puesto
                if (tablaPosiciones[3] == conductorCarrera.avance) {
                    tercerPuestoID = conductorCarrera.IdConductor;
                    tercerPuestoNombre = conductorCarrera.nombre;
                    tercerPuestoNacionalidad = conductorCarrera.nacionalidad;
                    tercerPuestoKilometraje = conductorCarrera.avance;
                } else {
                    //  Cuarto puesto
                    if (tablaPosiciones[2] == conductorCarrera.avance) {
                        cuartoPuestoID = conductorCarrera.IdConductor;
                        cuartoPuestoNombre = conductorCarrera.nombre;
                        cuartoPuestoNacionalidad = conductorCarrera.nacionalidad;
                        cuartoPuestoKilometraje = conductorCarrera.avance;
                    } else {
                        //Quinto puesto
                        if (tablaPosiciones[1] == conductorCarrera.avance) {
                            quintoPuestoID = conductorCarrera.IdConductor;
                            quintoPuestoNombre = conductorCarrera.nombre;
                            quintoPuestoNacionalidad = conductorCarrera.nacionalidad;
                            quintoPuestoKilometraje = conductorCarrera.avance;
                        } else {
                            //Sexto puesto
                            if (tablaPosiciones[0] == conductorCarrera.avance) {
                                sextoPuestoID = conductorCarrera.IdConductor;
                                sextoPuestoNombre = conductorCarrera.nombre;
                                sextoPuestoNacionalidad = conductorCarrera.nacionalidad;
                                sextoPuestoKilometraje = conductorCarrera.avance;
                            }
                        }

                    }

                }

            }

        }

    }
//------------------------------------------------------------------------------
  
  /*public void  definirPrimerPuesto (){  for(int i=0;i < pistaCarrera.kilometros;i++) {
      if (conductorPosicion01.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorPosicion01.IdConductor;
              primerPuestoNombre=conductorPosicion01.nombre;
              primerPuestoNacionalidad=conductorPosicion01.nombre;
              primerPuestoKilometraje=conductorPosicion01.avance;
      }
      if (conductorPosicion02.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorPosicion02.IdConductor;
              primerPuestoNombre=conductorPosicion02.nombre;
              primerPuestoNacionalidad=conductorPosicion02.nombre;
              primerPuestoKilometraje=conductorPosicion02.avance;
      }
      if (conductorPosicion03.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorPosicion02.IdConductor;
              primerPuestoNombre=conductorPosicion02.nombre;
              primerPuestoNacionalidad=conductorPosicion02.nombre;
              primerPuestoKilometraje=conductorPosicion02.avance;
      }
      if (conductorPosicion04.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorPosicion03.IdConductor;
              primerPuestoNombre=conductorPosicion03.nombre;
              primerPuestoNacionalidad=conductorPosicion03.nombre;
              primerPuestoKilometraje=conductorPosicion03.avance; 
      }
      if (conductorPosicion05.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorPosicion04.IdConductor;
              primerPuestoNombre=conductorPosicion04.nombre;
              primerPuestoNacionalidad=conductorPosicion04.nombre;
              primerPuestoKilometraje=conductorPosicion04.avance;
      }
      //Conductor Usuario
      if (conductorCarrera.avance==pistaCarrera.kilometros){
              primerPuestoID=conductorCarrera.IdConductor;
              primerPuestoNombre=conductorCarrera.nombre;
              primerPuestoNacionalidad=conductorCarrera.nombre;
              primerPuestoKilometraje=conductorCarrera.avance;
      }


  }
  }*/


  
    public void tablaCarrera() {
        System.out.println("TABLA DE CARRERA");
        System.out.println("----------------------------------------------------");
        System.out.print("ID  |");
        System.out.print("CONDUCTOR       |");
        System.out.print("PAIS      |");
        System.out.print("KM        |");
        System.out.print("POSICIÓN         |");
        System.out.println(" ");
        //primer puesto tabla
        System.out.println("----------------------------------------------------");
        System.out.print(primerPuestoID + " |");
        System.out.print(primerPuestoNombre + "|");
        System.out.print(primerPuestoNacionalidad + " |");
        System.out.print(primerPuestoKilometraje + " |");
        System.out.print("1* |");
        //Segundo Puesto tabla
        System.out.println("  ");
        System.out.println("----------------------------------------------------");
        System.out.print(segundoPuestoID + " |");
        System.out.print(segundoPuestoNombre + "|");
        System.out.print(segundoPuestoNacionalidad + " |");
        System.out.print(segundoPuestoKilometraje + " |");
        System.out.print("2* |");
        System.out.println("   ");
        System.out.println("----------------------------------------------------");
        System.out.print(tercerPuestoID + " |");
        System.out.print(tercerPuestoNombre + "|");
        System.out.print(tercerPuestoNacionalidad + " |");
        System.out.print(tercerPuestoKilometraje + " |");
        System.out.print("3* |");
        System.out.println("  ");
        System.out.println("----------------------------------------------------");
        System.out.print(cuartoPuestoID + " |");
        System.out.print(cuartoPuestoNombre + "|");
        System.out.print(cuartoPuestoNacionalidad + " |");
        System.out.print(cuartoPuestoKilometraje + " |");
        System.out.print("4 |");
        System.out.println("  ");
        System.out.println("----------------------------------------------------");
        System.out.print(quintoPuestoID + " |");
        System.out.print(quintoPuestoNombre + "|");
        System.out.print(quintoPuestoNacionalidad + " |");
        System.out.print(quintoPuestoKilometraje + " |");
        System.out.print("5 |");
        System.out.println("  ");
        System.out.println("----------------------------------------------------");
        System.out.print(sextoPuestoID +" |");
        System.out.print(sextoPuestoNombre + "|");
        System.out.print(sextoPuestoNacionalidad + " |");
        System.out.print(sextoPuestoKilometraje + " |");
        System.out.print ("6 |");
        System.out.println("   ");
        System.out.println("----------------------------------------------------");
    }
}