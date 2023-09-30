/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author ivann
 */
public class Celular {
    
    private int número;
    private String marca;
    private String color;
    private String modelo;
    private String plan;     
    
    // Constructor 

    public Celular(int número, String marca, String color, String modelo, String plan) {
        this.número = número;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.plan = plan;
    }
    
    //Metodos

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
    
            
}
