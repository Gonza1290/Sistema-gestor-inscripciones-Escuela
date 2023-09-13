
package Asignaturas;

import Miembros.Estudiante;

public class Inscripcion {
    private Estudiante e;
    private Curso c;

    public Inscripcion(Estudiante e, Curso c) {
        this.e = e;
        this.c = c;
    }

    public Estudiante getE() {
        return e;
    }
    public Curso getC() {
        return c;
    }
    public static void ConsultarInscripcion(Estudiante E,Curso C){
        boolean Bandera = false;
        for(Inscripcion I : E.getInscripciones()){
            if (I.getC().getTitulo() == C.getTitulo()){
                Bandera = true;
            }
        }
        if (Bandera) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
    
