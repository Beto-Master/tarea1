/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Fausto
 */
public class Persona {
      
    private String nombre,apellidos,direccion,telefono,fecha_nacimiento;
     // constructor
    public Persona (){}
    public Persona(String nombre, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    
    
    
    
    
    protected String[] void crear (){return null};
    protected void leer (){}
    protected void actualizar (){}
    protected void borrar (){}

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    } 
}
