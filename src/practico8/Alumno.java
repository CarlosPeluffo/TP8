package practico8;

import java.util.*;

public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    
    Set<Materia> Materias= new HashSet<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Set<Materia> getMaterias() {
        return Materias;
    }
    
    public void agregarMateria(Materia mat){
        Materias.add(mat);
    }
    public void cantidadMaterias(){
        System.out.println(Materias.size());
    }
    public void agregarMateriare(Materia mat){
        
    }
}
