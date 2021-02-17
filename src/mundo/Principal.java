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
public class Principal {
    private ArrayList<Producto> productosFacturados=new ArrayList<>();
    private ArrayList<Integer> cant=new ArrayList<>();
    private Double totalMama=0.0;
    private Double totalMecato=0.0;
    private Factura factura;
    private Double total=0.0;
    
    public Principal() {factura=new Factura();}

    public void agregarProducto(Producto p, Integer c){
        factura.agregarProducto(p, c);
    }
    
    public void calcularTotal(){
        total+=factura.calcularTotal();
        llevarConteo();
        factura.limpiar();
    }
    
    public void resumen(){
        for (int i = 0;productosFacturados.size() > i; i++) {
            Producto pf=productosFacturados.get(i);
            Double precio=pf.getPrecio();
            Integer c=cant.get(i);
            
            if(pf.getTipo().toString().equals("mama")){
                totalMama+=c*precio;
             }
            else{
                totalMecato+=c*precio;
                }
            }
        }
    
    
    private void llevarConteo(){
        
        for(int i=0;i<factura.getProductos().size();i++){
            Producto p=factura.getProductos().get(i);
            Integer c=factura.getCantidad().get(i);
                if(buscar(p,c)==null){
                    productosFacturados.add(p);
                    cant.add(c);
                }
        }
        
    }
    
    private Producto buscar(Producto p,Integer c){
    
        for (int i = 0;productosFacturados.size() > i; i++) {
            Producto pf=productosFacturados.get(i);
            Integer can=cant.get(i);
            if(p.getCod()==pf.getCod()){
                    can+=c;
                    return p;
            }
        }
        return null;
    }
    
    public ArrayList<Producto> getProductosFacturados() {
        return productosFacturados;
    }
    
    public Double getTotal(){
    
        return total;
            
    }

    public ArrayList<Integer> getCant() {
        return cant;
    }

    public Double getTotalMama() {
        return totalMama;
    }

    public Double getTotalMecato() {
        return totalMecato;
    }
    
}
