
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Views;
import models.Models;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Controllers {
       Views viewbloc;
    Models modelbloc;
    ActionListener ac;
    public Controllers(Views viewbloc, Models modelbloc) {
        this.ac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == viewbloc.jm_abrir)
                    abrir();
                else if(e.getSource() == viewbloc.jm_guardar)
                    guardar();
            }
        };
        this.viewbloc = viewbloc;
        this.modelbloc = modelbloc;
        this.viewbloc.jm_guardar.addActionListener(ac);
        this.viewbloc.jm_abrir.addActionListener(ac);
        initComponents();
    }
    public void abrir(){
        modelbloc.openFile();
        leer();
    }
    public void leer(){
        modelbloc.readFile();
        viewbloc.jta_texto.setText(modelbloc.getMensaje());
    }
    public void guardar(){
        modelbloc.setMensaje(viewbloc.jta_texto.getText());
        modelbloc.writeFile();
    }
    private void initComponents(){
        viewbloc.setVisible(true);
    }
 
}
