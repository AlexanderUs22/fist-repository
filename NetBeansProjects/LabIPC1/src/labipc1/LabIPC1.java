/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labipc1;

import java.util.*;
/**
 *
 * @author usa06
 */
public class LabIPC1 {

 
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el numero deseado: ");
        n = num.nextInt();
        
        
        for (n = 0; n >=0; n= n+1){
            n = n*2;
        System.out.println(n);
        }
         
            } 
    }

 
      /*  Scanner nc = new Scanner(System.in);
        boolean f;
        System.out.println("Ingrese in valor");
        n = nc.nextint();
        f =true;
        System.out.println("Ingrese un valor");
        
        if (n<=0) System.out.println("Error");
        for (
        */
      
      //ejercicio 2
      /*Scanner numero = new Scanner(System.in);
      int i,n,r;
      System.out.println("ingrese un numero:  ");
      n = numero.nextInt();
      r = 1;
      for (i = 1; i <= n;  i = i +1){ 
          r = r*i;
          System.out.println(r);
          
         //ejercicio 3
         int hrs, mins, seg;
         
         for(hrs = 0; hrs <= 23; hrs = hrs +1){
            for (mins = 0; mins <= 60; mins = mins +1 ){
                for (seg = 0 ; seg <= 60; seg = seg + 1){
                    System.out.println(hrs + ":" + mins + ":" + seg);
                        }
                     }
                 } */
        
       import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        ProblemasDeCoseno();
    }

    public static void ProblemasDeCoseno() {
        String respuesta;

        do {
            double A, B, C, angulo, anguloRad;
            System.out.println("Encuentra el valor del lado del triángulo usando ley de cosenos con los siguientes datos: ");
            int caso = random.nextInt(3);

            switch (caso) {
                case 1:
                    A = 15;
                    C = 20;
                    angulo = 25;
                    System.out.println("Lado A " + A);
                    System.out.println("Lado C " + C);
                    System.out.println("Angulo Opuesto " + angulo);

                    anguloRad = Math.toRadians(angulo);
                    B = Math.sqrt(A * A + C * C - 2 * A * C * Math.cos(anguloRad));
                    String respuesta1 = String.format("%.2f", B);
                    System.out.println(respuesta1);
                    System.out.println(" ¿Cuál es la respuesta?");
                    respuesta = scan.next();

                    if (respuesta.equals(respuesta1)) {
                        System.out.println("Bien");
                        penalizaciones();
                        jugando();
                    } else {
                        System.out.println("Perdiste");
                        System.out.println("¿Quieres intentarlo de nuevo?");
                    }
                    break;

                case 2:
                    B = 10;
                    C = 25;
                    angulo = 45;
                    System.out.println("Lado B " + B);
                    System.out.println("Lado C " + C);
                    System.out.println("Angulo Opuesto " + angulo);

                    anguloRad = Math.toRadians(angulo);
                    A = Math.sqrt(C * C + B * B - 2 * C * B * Math.cos(anguloRad));
                    String respuesta2 = String.format("%.2f", A);
                    System.out.println(respuesta2);
                    System.out.println(" ¿Cuál es la respuesta?");
                    respuesta = scan.next();

                    if (respuesta.equals(respuesta2)) {
                        System.out.println("Bien");
                        penalizaciones();
                        jugando();
                    } else {
                        System.out.println("Perdiste");
                        System.out.println("¿Quieres intentarlo de nuevo?");
                    }
                    break;

                case 3:
                    A = 18;
                    B = 25;
                    angulo = 30;
                    System.out.println("Lado A " + A);
                    System.out.println("Lado B " + B);
                    System.out.println("Angulo Opuesto " + angulo);

                    anguloRad = Math.toRadians(angulo);
                    C = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(anguloRad));
                    String respuesta3 = String.format("%.2f", C);
                    System.out.println(respuesta3);
                    System.out.println(" ¿Cuál es la respuesta?");
                    respuesta = scan.next();

                    if (respuesta.equals(respuesta3)) {
                        System.out.println("Bien");
                        penalizaciones();
                        jugando();
                    } else {
                        System.out.println("Perdiste");
                        System.out.println("¿Quieres intentarlo de nuevo?");
                    }
                    break;
            }
        } while (!respuesta.equalsIgnoreCase("no"));
    }

    public static void penalizaciones() {
        // Implementa la lógica de penalizaciones
    }

    public static void jugando() {
        // Implementa la lógica principal del juego
    }
}
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*  Clase 3
        
       VERSIONAMIEMTO 
        se refiere al proceso de controlar y gestionar 
        Modelo local 
        Utiliza una copoa de la base de control, de versiones , 
        Modelo Distribuido
        
        Herramientas de control de versiones 
        
        GIT
        Sistema de control de versiones de sofware, diseñado para ser veloz y trabajar con archivos grandes 
        
        GITHUB 
        Ofrece alijamiento y control de versiones en linea desde GIT
        
        GIT KRAKEN
        Permite a los equipos de trabajo colaborar remotamente 
        
        GITLAB 
        Similar a GITHUB 
        
        
        Termnnios 
        Repositorio 
        Contiene el registro con las diferentes versiones en el tiempo si como las ramas y etiquetas 
        Rama o Branch
        Hilo separado del codigo 
        
        Tag 
        
        Add
        
        Commit
        
        Clone 
        
        Push
       
        Pull 
        
        Revisión
        
        Comandos basicos 
        Para creer un repositorio 
        
        Se usa el comando git init
        
        agregar cambios
         git add
        ver si se deben hacer cambios
         git status 
         Crear ramas 
        git branch "name"
        
        git checkout "name"
        
        clonar 
        git clone "URL del repositorio"
        
        Push y pull 
        
        Push --> se utiliza para enviar enviar cambios al repo
        
        Pull -> sirve para bajar los cambios del repo a nuestra maquina 
        
        git fetch -> 
        
        */ 
    