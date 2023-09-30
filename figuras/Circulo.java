/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ivann
 */
public class Circulo {
    
    

    
    private double radio;
    private String colour;
    private Punto centro; 

    //Constructor
    public Circulo(double radio, String colour, Punto centro) {
        this.radio = radio;
        this.colour = colour;
        this.centro = centro;
    }
    
    
    


    
    public Punto getCentro() {
        return centro;
    }

    //Métodos
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        
    
    }
    
    public double getArea () {
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double getPerimetro () {
        return 2*Math.PI*radio;
    }
    
}
