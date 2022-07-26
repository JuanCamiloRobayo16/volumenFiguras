package modelo;

public class Cilindro extends Figura
{
    //Atributos 
    private double radio;
    private double altura;

    //Metodos
    public double getRadio()
    {
        return radio;
    }

    public void setBase(double radio)
    {
        this.radio = radio;
    }
    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    //Constructor 
    
    public Cilindro(double r,double a, String n)
    {
        super(n);
        radio=r;
        altura=a;
    }
    
}
