
package tp2;

import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import Miembros.Estudiante;
import Miembros.Profesor;

public class TP2 {

    public static void main(String[] args) {
       
        Profesor P1 = new Profesor("Mariano");
        Estudiante E1 = new Estudiante(43001,"Juan");
        Estudiante E2 = new Estudiante(43010,"Jose");
        Curso c1 = new Curso("Ingles");
        Curso c2 = new Curso("Matematica");
        Curso c3 = new Curso("Lengua");
        Curso c4 = new Curso("Geografia");
        P1.dicta(c1);
        try{
        E1.inscribir(c1);
        E1.inscribir(c2);
        E1.inscribir(c3);
        E1.inscribir(c4);
        E2.inscribir(c1);
        }catch(ErrorInscripcion E){
            System.out.println(E.getMessage()); 
        }
        //Se muestra que curso dicta el profesor
        P1.Mostrardictado();
        //Se muestra los estudiantes inscriptos en el curso
        c1.inscriptos();
        //Se muestra los cursos que esta inscripto el estudiante
        E1.MostrarInscripciones();
        //Se muestra la cantidad de inscriptos en un curso
        c1.CantInscriptos();
        //Se muestra si el Estudiante esta o no incripto en un curso
        Inscripcion.ConsultarInscripcion(E1, c1);
        Inscripcion.ConsultarInscripcion(E2, c2);
    }
    
}
