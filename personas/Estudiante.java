/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ivann
 */
public class Estudiante {
    
    private String name;
    private String apellido;
    private int edad;
    private int id;
    private String curso;
    private float calificación;
    
    // Constructor

    public Estudiante(String name, String apellido, int edad, int id, String curso, float calificación) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.curso = curso;
        this.calificación = calificación;
    }
    
    // Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getCalificación() {
        return calificación;
    }

    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }
    


}
