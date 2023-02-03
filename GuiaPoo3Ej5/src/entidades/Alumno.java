package entidades;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;
    private ArrayList<String> listaAlumno;

    public Alumno(){

    }

    public Alumno(ArrayList<String> listaAlumno) {
        this.listaAlumno = new ArrayList<>();
    }

    public Alumno(String nombre, ArrayList<Integer> notas, ArrayList<String> listaAlumno) {
        this.nombre = nombre;
        this.notas = notas;
        this.listaAlumno = listaAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<String> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<String> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                ", listaAlumno=" + listaAlumno +
                '}';
    }
}
