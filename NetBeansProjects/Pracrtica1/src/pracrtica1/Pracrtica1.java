
package pracrtica1;
import java.util.*;

import static pracrtica1.Pracrtica1.jugador;
import static pracrtica1.Pracrtica1.matriz;
import static pracrtica1.Pracrtica1.penalizacion;
import static pracrtica1.Pracrtica1.posicion;
public class Pracrtica1 {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int[][] matriz = new int[8][8];
    static String[][] penalizacion = new String [8][8];
    static boolean[][] boolPenalizacion = new boolean[8][8];
    static String nombre = "Alexander Samuel Us Upún" ;
    static String carnet = "202300824" ;
    static String seccion = "G" ;
    static String jugador = "@";
    static int posicion = 1;
    static int dado;
    static boolean irAlMenu = false;
    static int repProv = 2;
public static void main (String[]arg){
        SumasMatrices();
        //opciones();
    }
public static void opciones(){ 
    do{
        menuDeOpciones();
        int opcion = scan.nextInt(); 
        switch (opcion) {
            case 1:
                penalizaciones();
                jugando();
                break;
            case 2: 
                if (posicion < 64 || irAlMenu == false){
                 
                jugando();}
                else {
                    
                System.out.println("Sin estado Guardado");
                }
                break;
            case 3:
                System.out.println("Nombre:" + nombre);
                System.out.println("Carné: " + carnet);
                System.out.println("Sección: " + seccion);
                break;
            case 4:
                cerrarPrograma(0);
                break;
            default: System.out.println("Opcion Invalida ");
                     
                break;
        }
        }while(true);
            
    }
public static void opciones2(){ 
    do{
        menuDeOpciones();
        int opcion = scan.nextInt(); 
        switch (opcion) {
            case 1:
                penalizaciones();
                jugando();
                break;
            case 2:    
                System.out.println("Sin estado Guardado");
                
                break;
            case 3:
                System.out.println("Nombre:" + nombre);
                System.out.println("Carné: " + carnet);
                System.out.println("Sección: " + seccion);
                break;
            case 4:
                cerrarPrograma(0);
                break;
            default: System.out.println("Opcion Invalida ");
                     
                break;
        }
        }while(true);
}   
public static void menuDeOpciones(){
    System.out.println("Menú de opciones");
    System.out.println("1) Iniciar Juego ");
    System.out.println("2) Retomar Juego ");
    System.out.println("3) Informacion ");
    System.out.println("4) Salir ");
    System.out.println("selecciona una opcion: ");
}
public static void cerrarPrograma(int status) {
        System.out.println("Cerrando el programa...");
        System.exit(status);
    }
public static void penalizaciones(){    
int contador = 64;
for (int i = 0; i < matriz.length; i++) {
    int cantidadDePenalizaciones = 0 ;
        if (i % 2 == 0 ){
            for (int j = 7; j >= 0; j--){
                if (random.nextBoolean() && cantidadDePenalizaciones < 4) {
                    penalizacion[i][j] = "#";
                    boolPenalizacion[i][j] = true;
                    cantidadDePenalizaciones++;
                }else {
                    penalizacion[i][j] = " ";
                    boolPenalizacion[i][j] = false;
                    
                    }
                    matriz[i][j] = contador--;}
        }else{
                for (int j = 0; j < 8; j++){
                if(random.nextBoolean() && cantidadDePenalizaciones <4){
                    penalizacion[i][j] = "#";
                    boolPenalizacion[i][j] = true;
                    cantidadDePenalizaciones++;
                }else {
                    penalizacion[i][j] = " ";
                    boolPenalizacion[i][j] = false;
                }    
                matriz[i][j] = contador--;             
            }
        }
} posicion = 1 ;
}
public static void tablero(){
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == posicion) {
                    System.out.print("|" + matriz[i][j] + " - " + jugador + "\t");
                } else {
                    System.out.print("|" + matriz[i][j] + " - "  +penalizacion[i][j]+ "\t");
                }
            }
            System.out.println("|");
        }
    }
public static void jugando(){
    tablero();
boolean seguirJugando = true;
System.out.println("Para comenzar a jugar debes tirar el dado");
//movimiento en el tablero 
while (seguirJugando && posicion  <= 64){

System.out.println("Tirar el dado = si");
System.out.println("regresar al menú = p");
String tirarDado = scan.next();

switch (tirarDado){
    
    case ("si"):
        //dado
    //int rand = random.nextInt(4);
    //dado = rand +2;
    dado = scan.nextInt();
    System.out.println("El valor del dado es " + dado); 
    posicion = posicion + dado; 
    moverJugador();
    break;
        
    case ("p"):
      seguirJugando = false; 
        System.out.println("regresando al menú...");
        
        
    break ;
    
    default:
        System.out.println("Opción invalida. .");
    break;
        
    }
}
if (posicion >= 64 || !seguirJugando )
         {
         if (!seguirJugando){
         opciones();
         }
         else if(posicion >= 64){
         System.out.println("Felicidades has ganado el juego");
         System.out.println("¿Queres jugar de nuevo?");
         opciones();
        }
         
         
    }
    
}
public static void moverJugador(){
   
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == posicion ) {
                
                    if (boolPenalizacion[i][j] = true && posicion < 17 ){
                        problemasDeCoseno(); 
                    }
                    System.out.println(repProv + "\t");
                    System.out.print("|" + matriz[i][j] + "-" +penalizacion[i][j]+ jugador  +"\t");
                } else {
                    System.out.print("|" + matriz[i][j] + " - "  + penalizacion[i][j] +"\t");
                }
            }
            System.out.println("|");
        }
     }
public static void problemasDeCoseno(){
    String respuesta;
    double A ,B ,angulo, anguloRad, C;
    
    int caso = random.nextInt(3);
    switch(caso){
        case 1:
        System.out.println("Caiste en una penalización");
        for (int f=0; f<=5; f++){
        System.out.println("_^_^_^_^_^_^_^_^_^_^_^_^_^");
        }
        System.out.println("Encuentra el valor del lado del triangulo, usando ley de cosenos con los siguentes datos: ");    
        A = 15;
        C = 20;
        angulo = 25;
        System.out.println("Lado A " + A);
        System.out.println("Lado C " + C);
        System.out.println("Angulo Opuesto " + angulo);
        anguloRad = Math.toRadians(angulo);
        B = Math.sqrt(A * A + C * C - 2 * A * C * Math.cos(anguloRad));
        String respuesta1 = String.format("%.2f",B );
        System.out.println(respuesta1);
        System.out.println(" ¿Cual es la respuesta?");
        respuesta = scan.next();
        
        if (respuesta.equals(respuesta1)){
            System.out.println(" bien");
            irAlMenu = false;
            jugando();
        }else{
            System.out.println("perdiste");
            System.out.println("¿Quieres jugar de nuevo?");
            irAlMenu = true;
        }
        break;
    
        case 2:
         System.out.println("Caiste en una penalización");
        for (int f=0; f<=5; f++){
        System.out.println("_^_^_^_^_^_^_^_^_^_^_^_^_^");
        }
        System.out.println("Encuentra el valor del lado del triangulo, usando ley de cosenos con los siguentes datos: ");
        B = 10;
        C = 25;
        angulo = 45; 
        System.out.println("Lado B " + B);
        System.out.println("Lado C " + C);
        System.out.println("Angulo Opuesto " + angulo);
         anguloRad = Math.toRadians(angulo);
        A = Math.sqrt(C * C + B * B - 2 * C * B * Math.cos(anguloRad));
        String respuesta2 = String.format("%.2f",A );
        System.out.println(respuesta2);
        System.out.println(" ¿Cual es la respuesta?");
        respuesta = scan.next();
        
        if (respuesta.equals(respuesta2)){
            irAlMenu = false;
            System.out.println("bien");
            jugando();
        }else{
            System.out.println("perdiste");
            System.out.println("¿Quieres jugar de nuevo?");
            irAlMenu = true;   
        }
        break;
        case 3:
        System.out.println("Caiste en una penalización");
        for (int f=0; f<=5; f++){
        System.out.println("_^_^_^_^_^_^_^_^_^_^_^_^_^");
        }
        System.out.println("Encuentra el valor del lado del triangulo, usando ley de cosenos con los siguentes datos: ");   
        A = 18;
        B = 25;
        angulo = 30;
        System.out.println("Lado A " + A);
        System.out.println("Lado B " + B);
        System.out.println("Angulo Opuesto " + angulo);
        anguloRad = Math.toRadians(angulo);
        C = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(anguloRad));
        String respuesta3 = String.format("%.2f",C);
        System.out.println(respuesta3);
        System.out.println(" ¿Cual es la respuesta?");
        respuesta = scan.next();
        
        if (respuesta.equals(respuesta3)){
            irAlMenu = false;
            System.out.println("bien");
            jugando();
        }else{
            System.out.println("perdiste");
            System.out.println("¿Quieres jugar de nuevo?");
            irAlMenu = true;    
        }
        break;
    }
if (irAlMenu == true){
    opciones2();
        }
    }
public static void SumasMatrices(){
     int caso1 = random.nextInt(3);
    switch(caso1){
        case 1: 
            sumaDeMatriz1();
            break;
        case 2:
            sumaDeMatriz2();
             break;
        case 3:
            sumaDeMatriz3();
             break;
    }
}
public static void sumaDeMatriz1(){
   
        int[][] matriz1 = {
            { 7, 48, 5,  0, 1},
            {57, 8 , 4, 6, 16},
            { 0, 5,  6,78, 15},
            {21, 14, 8,19, 54},
            {32,20, 26, 47,12}};

        for(int i = 0; i< matriz1.length; i++){
            for(int j = 0; j <matriz1[i].length; j++){
                System.out.print("| " + matriz1[i][j] + " |" +"\t"); 
            }
      System.out.println(); 
}  
        System.out.println(); 
             int[][] matriz2 = {
             { 9, 5, 2,  1, 8},
             {4, 2 , 3, 47, 8},
             { 48, 55,  32,19, 6},
             {7, 56, 32, 14, 8},
             {32,87, 0, 1,7}};
      
             for(int i = 0; i< matriz2.length; i++){
            for(int j = 0; j <matriz2[i].length; j++){
                System.out.print("| " + matriz2[i][j] + " |" +"\t"); 
        }
      System.out.println();   
 }  
    System.out.println();
        int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
            sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            System.out.print("|" + sumaMatriz[i][j] + "|\t");
    }
    System.out.println(); 
              
    }
}
  
public static void sumaDeMatriz2(){
    
    
        int[][] matriz1 = {
           { 4, 9, 7,  45, 18},
             {7, 51 , 26, 8, 38},
             { 48, 26,37,21,  19},
             {1, 0, 6, 8, 1},
             {2,1, 55, 25,15}};

        for(int i = 0; i< matriz1.length; i++){
            for(int j = 0; j <matriz1[i].length; j++){
                System.out.print("| " + matriz1[i][j] + " |" +"\t"); 
            }
      System.out.println(); 
}  
        System.out.println(); 
             int[][] matriz2 = {
             { 0, 2, 15, 1, 66},
             {21, 48 ,62, 7, 33},
             {4, 88, 0, 68, 4},
             {25, 18, 24, 7, 55},
             {24, 15, 36, 5, 98}};
      
             for(int i = 0; i< matriz2.length; i++){
            for(int j = 0; j <matriz2[i].length; j++){
                System.out.print("| " + matriz2[i][j] + " |" +"\t"); 
        }
      System.out.println();   
 }  
    System.out.println();
        int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
            sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            System.out.print("|" + sumaMatriz[i][j] + "|\t");
    }
    System.out.println(); 
        }

}
public static void sumaDeMatriz3(){
    
    
        int[][] matriz1 = {
            { 0, 1, 15,  5, 36},
            {1, 78 , 65, 32, 4},
            { 1, 78,68,32, 4},
            {14, 98, 63,20, 15},
            {11,39, 84, 7,1}};

        for(int i = 0; i< matriz1.length; i++){
            for(int j = 0; j <matriz1[i].length; j++){
                System.out.print("| " + matriz1[i][j] + " |" +"\t"); 
            }
      System.out.println(); 
}  
        System.out.println(); 
             int[][] matriz2 = {
             { 78, 25, 66, 48, 98},
             {0, 45 , 2, 3, 1},
             { 2, 9, 14,10,20},
             {35, 87, 65, 2,32},
             {25,8, 4, 9,39}};
      
             for(int i = 0; i< matriz2.length; i++){
            for(int j = 0; j <matriz2[i].length; j++){
                System.out.print("| " + matriz2[i][j] + " |" +"\t"); 
        }
      System.out.println();   
 }  
    System.out.println();
        int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
            sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            System.out.print("|" + sumaMatriz[i][j] + "|\t");
    }
    System.out.println(); 
        }

}

}
    



                



