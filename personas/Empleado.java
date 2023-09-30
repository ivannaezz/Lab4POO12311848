/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ivann
 */
public class Empleado {
    
    private int id;
    private String name;
    private String apellido;
    private int salary;
    
    //Constructor

    public Empleado(int id, String name, String apellido, int salary) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.salary = salary;
    }
    
    //Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getSalararioAnual (){
        return salary;
    }
            
    
    

}
