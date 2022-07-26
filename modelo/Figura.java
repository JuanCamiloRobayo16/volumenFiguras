package modelo;

public  class Figura
{
    protected String nombre;
    protected double base;
    protected double radio;
    protected double altura;
    
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    protected double volumen;
    protected String resultado;
    
    public Figura(String n) 
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getAltura() 
    {
        return altura;
    }

    public String mostrarResultado()
    {
        return this.resultado;
    }

    public double calcularVolumen()
    {
        if(nombre.equals("Cubo"))
        {
            volumen = Math.pow(base,3);
        }
        if(nombre.equals("Esfera"))
        {
            volumen = (Math.PI*Math.pow(radio,3)*4)/3;
        }
        if(nombre.equals("Cilindro"))
        {
            volumen = Math.PI*Math.pow(radio,2)*altura;
        }
        if(nombre.equals("Cono"))
        {
            volumen = (Math.PI*Math.pow(radio,2)*altura)/3;
        }
        
        return volumen;
    }
    

}