package modelo;

public class Cubo extends Figura
{
    //Atributos 
    private double base;

    //Metodos
    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    //Constructor 
    
    public Cubo(double b,String n)
    {
        super(n);
        base=b;
    }
}

