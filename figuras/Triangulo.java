/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ivann
 */
public class Triangulo {
    
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    //Constructor

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    
    //Metodos 

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }
    
    
    
    public double getPerimetro() {
        double lado1 = calcularDistancia (vertice1,vertice2);
        double lado2 = calcularDistancia (vertice2,vertice3);
        double lado3 = calcularDistancia (vertice3,vertice1);
        return lado1+lado2+lado3;
    }
    public String getTipo() {
        double lado1 = calcularDistancia (vertice1, vertice2);
        double lado2 = calcularDistancia (vertice2, vertice3);
        double lado3 = calcularDistancia (vertice3, vertice1);
        
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            return "Isoceles";   
        } else {
            return "Escaleno";
         }
            
        }
    private double calcularDistancia (Punto p1, Punto p2) {
        double dx = p1.getCoordenadaX() - p2.getCoordenadaY();
        double dy = p2.getCoordenadaY() - p1.getCoordenadaX();
        return 0;
    }
  }
    

