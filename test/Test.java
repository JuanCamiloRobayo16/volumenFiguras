package test;

import controlador.Controlador;
import modelo.Figura;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana= new VentanaPrincipal();
        Figura miModelo = new Figura("");
        Controlador miControlador = new Controlador(miVentana,miModelo);
        
    }
}
