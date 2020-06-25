/*
 NOMBRE PROYECTO: Libro_Física
 */
package libro_fisicaapp;

/**
 *
 * @author Quishpe Urrutia Job Nicolas
 */

class Libro_Fisica {
    
    // Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
        
    //Constructores/
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_edicion){
      
       codigo=pCodigo;  
       titulo=pTitulo;
       autor=pAutor;
       anio_edicion=pAnio_edicion;
    }
    
    //Metodos
    
    public int getCodigo(){
        return codigo;
    }  
    public void setCodigo(int codigo){    
        this. codigo = codigo; /* this puntero que invoca al atributo private codigo*/
    }    
    
    
    public String getTitulo(){    
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){    
     return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    
    public int getAnio_edicion(){
        return anio_edicion;
    }
    public void setAnio_edicion(int anio_edicion){
        this.anio_edicion = anio_edicion;     
    }
    

    
     @Override
    public String toString(){
        return "El libro de Físca " +titulo+ " del año: "+anio_edicion+ " del autor "
                +autor+ " con código -"
                +codigo+ "- para facilitar su ubicación en la biblioteca";
    }
}
 
    public class Libro_FisicaApp {
    
 
    public static void main(String[] args) {
        
        // Creamos los objetos
        Libro_Fisica libro1=new Libro_Fisica(3, "Dinamica", " Bedford", 2015);
        Libro_Fisica libro2=new Libro_Fisica(2, "Cinética", " Beer Jhonston", 2012);
        Libro_Fisica libro3=new Libro_Fisica(1, "Fundamental", " Hibbeler ", 2011);
    
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
   
    }
}
