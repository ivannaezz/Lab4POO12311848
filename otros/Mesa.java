/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author ivann
 */
public class Mesa {
    
    private float ancho;
    private float largo;
    private String color;
    private String material;
    private String forma;
    
    //Constructor 

    public Mesa(float ancho, float largo, String color, String material, String forma) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }
    
    //Metodos 

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
     


        
}
