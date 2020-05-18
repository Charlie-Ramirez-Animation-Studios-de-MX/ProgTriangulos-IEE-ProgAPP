/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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