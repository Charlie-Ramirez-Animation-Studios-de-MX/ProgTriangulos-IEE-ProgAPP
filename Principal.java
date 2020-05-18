/*Copyright (c) 2020 Boyzo Ramirez Carlos,Ortiz Cruz Daniel,Quintana Martinez Alejandra |©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
        Programa que Calcula Areas y perimetros, Compara y selecciona el triangulo con mayor area, Version 17 de mayo 2020 7.40P. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).*/
package Triangulos;
import java.util.Scanner;
public class Principal {
    public static double mayorP(TrianguloIsoceles Triang[]){
        double superficie;
        superficie = Triang[0].ObtenerArea();
        for (int i = 1; i < Triang.length; i++) {
            if(Triang[i].ObtenerArea()>superficie){
                superficie= Triang[i].ObtenerArea();
                
            }
        }
        return superficie;
    }
   public static void main(String[] args){
       Scanner Dat = new Scanner (System.in);
       double base, lado;
       int NoTriangulos;
       System.out.println("Programa que compara el triangulo con mayor perimetro y sus areas\n by Ale,Charlie y Dan,");
       System.out.println("Facilitamos tus Calculos, solo necesitamos la Base y uno de los lados");
       System.out.println("Ingresa el numero de triangulos a analizar: ");
       NoTriangulos = Dat.nextInt();
       TrianguloIsoceles Triang[]= new TrianguloIsoceles[NoTriangulos];       
       for (int i = 0; i < Triang.length; i++) {
       System.out.println("---------------------------------------------------\n");    
       System.out.println("Ingrese valores del triangulo: "+(i+1)+".");    
       System.out.println("Base: ");
       base = Dat.nextDouble();
       System.out.println("Uno de los Lados: ");
       lado = Dat.nextDouble();     
       Triang[i] = new TrianguloIsoceles(base, lado);
   //Sys Print method
           System.out.println("Vale Los resultados son");
       System.out.println("Perimetro: "+Triang[i].obtPerimetro());
       System.out.println("Area: " +Triang[i].ObtenerArea());
       }
       System.out.println("---------------------------------------------------\nEl triangulo con area mas grande es el de : "+mayorP(Triang));
   }
    
    
}