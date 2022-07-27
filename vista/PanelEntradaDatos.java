package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lb;
    private JLabel lr;
    private JLabel ln;
    private JTextField tfb;
    private JTextField tfr;
    private JTextField tfn;
    private JLabel lh;
    private JTextField tfh;
    private JComboBox cbNombre;
    private String[] nombre = {"Cubo","Cilindro", "Cono","Esfera"};
    private JLabel lImagen;
    private ImageIcon iImagen;


    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {   
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("imagen.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,20,220,160);
        this.add(lImagen);

        // crear y agregar etiqueta Base
        lb = new JLabel("Base: ");
        lb.setBounds(250, 20, 140, 20);
        this.add(lb);

        //crear caja de texto Base
        tfb = new JTextField();
        tfb.setBounds(350,20,120,20);
        this.add(tfb);

        // crear y agregar etiqueta Figura
        ln = new JLabel("Figura : ");
        ln.setBounds(250, 70, 140, 20);
        this.add(ln);

        // crear y agregar ComboBox
        cbNombre = new JComboBox();
        for(int i=0; i<nombre.length;i++)
        {
            cbNombre.addItem(nombre[i]);
        }
        cbNombre.setBounds(350,70,140,20);
        this.add(cbNombre);

       
        // crear y agregar etiqueta Radio
        lr = new JLabel("Radio : ");
        lr.setBounds(250, 120, 120, 20);
        this.add(lr);

        //crear caja de texto Razon
        tfr = new JTextField();
        tfr.setBounds(350,120,80,20);
        this.add(tfr);

        // crear y agregar etiqueta Altura
        lh = new JLabel("Altura : ");
        lh.setBounds(250, 170, 140, 20);
        this.add(lh);

        //crear caja de texto Altura
        tfh = new JTextField();
        tfh.setBounds(350,170,80,20);
        this.add(tfh);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getTfb()
    {
        return tfb.getText();
    }

    public String getTfr()
    {
        return tfr.getText();
    }
    public String getTfn()
    {
        return tfn.getText();
    }
    public String getTfh()
    {
        return tfh.getText();
    }
    public String getNombre()
    {
        return (String) cbNombre.getSelectedItem();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfb.setText("");
        tfr.setText("");
        tfh.setText("");
        
    }
    
}
