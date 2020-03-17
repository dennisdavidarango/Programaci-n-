/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.apache.jasper.tagplugins.jstl.If;

/**
 *
 * @author JULIMEL
 */
@Named(value = "sesionLista")
@SessionScoped
public class SesionLista implements Serializable {

   public class Submit{
       private String Name;
       private int Years;
       private boolean submit; 
   
     
    
   }
    
    public SesionLista() {
    }
    
}
