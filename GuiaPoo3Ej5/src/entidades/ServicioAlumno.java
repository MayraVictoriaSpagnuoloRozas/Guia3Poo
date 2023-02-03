package entidades;

import java.util.ArrayList;

public class ServicioAlumno {

    private ArrayList<Alumno> listaAlumno;

    public ServicioAlumno() {
        this.listaAlumno = new ArrayList();
    }

    public ServicioAlumno(ArrayList<Alumno> alumnos) {
        this.listaAlumno = alumnos;
    }

    public void CrearAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3){

        Alumno alumno = new Alumno();

        ArrayList<Integer>notas= new ArrayList<>();
        alumno.setNombre(nombre);// esto no entiendo
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);// y esto

        AñadirAlumno(alumno);

    }
    public void AñadirAlumno(Alumno alumno){
        this.listaAlumno.add(alumno);
    }

    public void VerListado(){
        for (Alumno alumno:listaAlumno) {
            System.out.println(alumno.toString());

        }
    }
}
