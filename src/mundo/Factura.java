/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;

/**
 *
 * @author Boris M
 */
public class Factura {
   
    private  ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Integer> cantidad=new ArrayList<>();
    private Double total=0.0;
    
    public Factura(){}

    public void agregarProducto(Producto p,Integer c){
    productos.add(p);
    cantidad.add(c);
    }
    
    public void limpiar(){
    productos.clear();
    cantidad.clear();
    total=0.0;
    }
    
    public Double calcularTotal(){
    
        for(int i=0;i<productos.size();i++){
            Producto p=productos.get(i);
            Integer c=cantidad.get(i);
            total+=p.getPrecio()*c;
        }
        
        return total;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Integer> getCantidad() {
        return cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
