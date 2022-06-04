
package PeticionDatos;

import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

//Método que se encarga de correr el MIDlet
public class PeticionDatos extends MIDlet {
    //Creando los componentes del MIDlet
    public Display pantalla;
    public Form    fmrDatos;
    public TextField    txtNombre ,  txtApe , txtTel, txtEmail;
    
    public void startApp() {
        
        pantalla = Display.getDisplay(this);
        fmrDatos = new Form ("Peticion de datos");
        txtNombre = new TextField("Nombre", "", 20, TextField.ANY);
        txtApe = new TextField("Apellidos", "", 20, TextField.ANY);
        txtTel = new TextField("Telefono", "", 12, TextField.PHONENUMBER);
        txtEmail = new TextField("Email", "", 12, TextField.ANY);
        
        //Agregando los componentes
        
        fmrDatos.append(txtNombre);
        fmrDatos.append(txtApe);
        fmrDatos.append(txtTel);
        fmrDatos.append(txtEmail);

        pantalla.setCurrent(fmrDatos);
          
    }
    //Método para pausar el MIDlet
    public void pauseApp() {
    }
    //Método encargado de finalizar o destruir el MIDlet
    public void destroyApp(boolean unconditional) {
    }
}
