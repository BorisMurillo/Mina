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
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Servicio
{ 
    public ArrayList<Producto> productos= new ArrayList<>();

    public Servicio() {}

    
    public void limpiar(String nombre){
    
        File f=new File(nombre);
        f.delete();
        
    }
    
    public void escribir(String nombre){//me permite crear y escribir en el txt

        File f;
        FileWriter w;
        BufferedWriter br;
        PrintWriter pw;

        try{

            f=new File(nombre);
            w= new FileWriter(f);
            br=new BufferedWriter(w); 
            pw= new PrintWriter(br);

            for (int i = 0; i < this.productos.size(); i++) {//recorre el arrayList
                Producto p = this.productos.get(i);//me paro en una propiedad del arrayList y se lo asigno a una variable temporal

                pw.println(p.getCod()+";"+ p.getNombrePr()+";"+";"+p.getPrecio()+";"+p.getTipo());
                //escribe en el txt lo que obtiene de la propiedad en la que se encuentra parado
            }

            pw.close();
            br.close();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,  "no se puede escrbir");}
   
    }

    public void leer(String NombreArchivo){//me permite leer el archivotxt
        
        FileReader fr;
        BufferedReader br;

        try{
            fr=new FileReader(NombreArchivo);
            br=new BufferedReader(fr);

            String linea;

            while((linea=br.readLine())!=null){
                
                String[] props = linea.split(";");
                
                int cod=Integer.parseInt(props[0]); 
                String n=props[1]; 
                Double precio=Double.parseDouble(props[2]);
                
                //lo que voy a agregar
               
              Tipo t=Tipo.valueOf(props[3]) ;
              Producto p=new Producto(cod, n, precio,t); 
                
                productos.add(p);
            }

            
            br.close();
            fr.close();
        }
        catch(Exception e) {JOptionPane.showMessageDialog(null, e.toString());}
    }

}


