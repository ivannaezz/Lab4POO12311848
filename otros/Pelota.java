/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author ivann
 */
public class Pelota {
    
    private float tamaño;
    private String color;
    
    //Constructor 

    public Pelota(float tamaño, String color) {
        this.tamaño = tamaño;
        this.color = color;
    }
     
    //Metodos

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

}
