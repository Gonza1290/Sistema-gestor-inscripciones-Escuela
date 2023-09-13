
package Asignaturas;

import Miembros.Estudiante;
import java.util.ArrayList;
import java.util.Hashtable;

public class Curso extends Hashtable<Integer ,Estudiante> {
    private String titulo;
    private ArrayList<Inscripcion> inscriptos = new ArrayList();

    public Curso(String titulo) {
        this.titulo = titulo;
    }
    
    public void inscriptos(){
        System.out.println("Alumnos Incriptos en " + titulo+":");
        for(Inscripcion I : inscriptos){
            System.out.println("Nombre: "+I.getE().getNombre()+" , Legajo :"+I.getE().getLegajo()+"\n");
        }
    }
    public ArrayList<Inscripcion> getInscriptos() {
        return inscriptos;
    }
    public String getTitulo() {
        return titulo;
    }
    public void CantInscriptos(){
        System.out.println(inscriptos.size());
    }
}
