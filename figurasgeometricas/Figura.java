/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author ivann
 */
public class Figura {
    private String nombre; 
    
    //Constructor

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getArea () {
        return 0;
        
    }
    
    public boolean getRegular () {
        return false;
    }
            
}
