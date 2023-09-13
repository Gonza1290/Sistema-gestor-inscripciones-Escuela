
package Miembros;

import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import java.util.ArrayList;
import tp2.ErrorInscripcion;

public class Estudiante extends Persona {
    private int legajo;
    private ArrayList<Inscripcion> inscripciones = new ArrayList();

    public Estudiante(int legajo, String nombre) {
        super(nombre);
        this.legajo = legajo;
    }
    public void inscribir(Curso c)throws ErrorInscripcion{
        if(3<=inscripciones.size()){
            throw new ErrorInscripcion("El estudiante "+super.getNombre()+ " ya esta inscripto en 3 cursos, por lo tanto no se puede Inscribir a: "+c.getTitulo());
        }
        Inscripcion I = new Inscripcion(this,c);
        this.inscripciones.add(I);
        c.getInscriptos().add(I);
        
    }
    public void MostrarInscripciones(){
        System.out.println("El Estudiante "+ super.getNombre()+" cursa:");
        for(Inscripcion I : inscripciones){
        System.out.println(I.getC().getTitulo()+"");
        }
    }

    public String getNombre() {
        return super.getNombre();
    }
    public int getLegajo() {
        return legajo;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
    
    
}
