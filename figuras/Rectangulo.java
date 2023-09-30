/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ivann
 */
public class Rectangulo {
    
    private float largo; 
    private float ancho; 

    // Constructor
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    
    
    //Metodos 

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public double getArea () {
        return largo * ancho;
    }
    
    
}
