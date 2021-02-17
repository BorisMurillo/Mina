/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Boris M
 */
public class Producto {
    
    private int cod;
    private String nombrePr;
    private Double precio= 0.0 ;
    private Tipo tipo;
    
    public Producto(){}
    
    public Producto(int cod,String nombre,Double precio,Tipo tipo){
        this.cod=cod;
        this.nombrePr=nombre;
        this.precio=precio;
        this.tipo=tipo;
    }

    public int getCod() {
        return cod;
    }

    public String getNombrePr() {
        return nombrePr;
    }

    public Double getPrecio() {
        return precio;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    
    
}
