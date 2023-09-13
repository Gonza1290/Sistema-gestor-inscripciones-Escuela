
package Miembros;

import Asignaturas.Curso;

public class Profesor extends Persona {
    private Curso dicta;
    
    public Profesor(String nombre) {
        super(nombre);
    }
    public void dicta(Curso c){
        this.dicta = c;
    }
    public void Mostrardictado(){
        System.out.println("El Profesor "+super.getNombre()+" dicta "+ dicta.getTitulo());
    }
    
}
