/*Copyright (c) 2020 Boyzo Ramirez Carlos,Ortiz Cruz Daniel,Quintana Martinez Alejandra |©-Archivo Historico Digitalizado Charlie Ramirez Animation Studios de Mexico.
UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO-FACULTAD DE ESTUDIOS SUPERIORES ARAGON-INGENIERIA ELECTRICA ELECTRONICA.
        Programa que Calcula Areas y perimetros, Compara y selecciona el triangulo con mayor area, Version 17 de mayo 2020 7.40P. 
CODIGO BAJO "LICENCIA MIT". PARA CODIGO ABIERTO (OPEN SOURCE  https://opensource.org/licenses/MIT).*/
package Triangulos;
public class TrianguloIsoceles {
     private double base;
     private double lado;
     private String area;

    public TrianguloIsoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
     
    public double obtPerimetro(){
        double Perimetro=2*lado+base;
        return Perimetro;
      
    }
    public double ObtenerArea(){
    double H=Math.sqrt(((lado*lado)-((base*base)/4)));
    double area= (base*H)/2;
    return area;
}
     
    public String MostrarDatos(){
        return "base: "+base+"\nlado: "+lado+"\nPerimetro: "+obtPerimetro()+"\n";
    
               }
}