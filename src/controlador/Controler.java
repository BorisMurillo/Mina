/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import mundo.Principal;
import mundo.Servicio;
import vista.VistaPrincipal;

/**
 *
 * @author Boris M
 */
public class Controler {
    
    VistaPrincipal vista=new VistaPrincipal();
    Principal prin=new Principal();
    Servicio servicio=new Servicio();
    
    public Controler(){}
    
    
    
    public static void main(String[] args) {
        Controler c=new Controler();
    }
    
}
