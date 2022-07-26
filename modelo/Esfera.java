package modelo;

public class Esfera extends Figura
{
    
     //Atributos 
     private double radio;
 
     //Metodos
     public double getRadio()
     {
         return radio;
     }
 
     public void setBase(double radio)
     {
         this.radio = radio;
     }
 
     //Constructor 
     
     public Esfera(double r, String n)
     {
         super(n);
         radio=r;
     }
     
}
