package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.Figura;
//import modelo.Cilindro;
//import modelo.Cono;
//import modelo.Cubo;
//import modelo.Esfera;


public class Controlador implements ActionListener
{
    //------------
    // Atributos
    //------------

    private VentanaPrincipal vista;
    private Figura modelo;

    //------------
    // Metodos
    //------------

    //metodo constructor
    public Controlador(VentanaPrincipal pVista, Figura pModelo)
    {
        this.vista = pVista;
        this.modelo= pModelo;
        this.vista.miPanelOperaciones.btHallar.addActionListener(this);
        this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
        this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        // Identificar el comando generado [hallar,borrar, salir]
        String comando = ae.getActionCommand();
        
        if(comando.equals("Salir"))
        {
            System.exit(0);
        }
        
        if(comando.equals("Borrar"))
        {
            this.vista.miPanelEntradaDatos.borrar();
            this.vista.miPanelResultados.borrar();
        }

        if(comando.equals("Hallar"))
        {
            
            modelo.setBase(Double.parseDouble(vista.miPanelEntradaDatos.getTfb()));
            modelo.setRadio(Double.parseDouble(vista.miPanelEntradaDatos.getTfr()));
            modelo.setAltura(Double.parseDouble(vista.miPanelEntradaDatos.getTfh()));
            modelo.setNombre((vista.miPanelEntradaDatos.getNombre()));
            vista.miPanelResultados.mostrarResultado(modelo.getNombre(),modelo.getAltura(),modelo.getBase(),modelo.getRadio(),modelo.calcularVolumen());
        

        }
    }
    
}
