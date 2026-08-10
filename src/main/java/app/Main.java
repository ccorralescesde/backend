package app;

import models.Curso;
import models.Matricula;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Students student = new Students();
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student.setId(1L);
        student.setFirstnemae("John");
        System.out.println(student.getFirstnemae());

        student.setId(2L);
        student.setFirstnemae("Jane");
        System.out.println(student.getFirstnemae());*/

        List<Students> students;

        students = new ArrayList<>();
        students.add(new Students(3L, "Jhon", "Doe", "joh@example.com", "3123321321"));
        students.add(new Students(4L, "Jana", "Simit", "smit@example.com", "354352345"));
        students.add(new Students(5L, "Mario", "Cardenas", "marioh@example.com", "32543534543"));
        students.add(new Students(6L, "Maria", "Gonzales", "maria@example.com", "3113234231432"));
        students.add(new Students(7L, "Pedro", "Lopez", "pedro@example.com", "313432541234"));

        System.out.println("List of Students");
        for (Students student : students){
            System.out.println("ID " + student.getId() + " Nombre " + student.getFirstnemae() + " Apellido " + student.getLastname() + " Email " + student.getEmail() + " Telefono " + student.getPhone() );
        }

        List<Curso> cursos;
        cursos = new ArrayList<>();
        cursos.add(new Curso(1L, "Introduccion a la programacion", "Curso Semetre 1 programacion"));
        cursos.add(new Curso(2L, "Logica de programacion", "Curso Semetre 1 programacion"));
        cursos.add(new Curso(3L, "Bases de datos", "Curso Semetre 1 programacion"));
        cursos.add(new Curso(4L, "Frontend I", "Curso Semetre 2 programacion"));
        cursos.add(new Curso(5L, "Backend I", "Curso Semetre 2 programacion"));
        cursos.add(new Curso(6L, "Metodologias agiles", "Curso Semetre 2 programacion"));
        System.out.println("List of Curso");
        for (Curso curso : cursos){
            System.out.println("ID " + curso.getId() + " Nombre curso " + curso.getNombreCurso() + " Descripcion " + curso.getDesCurso());
        }

        List<Matricula> matriculas;
        matriculas = new ArrayList<>();
        matriculas.add(new Matricula(1L, "001", "001","09/08/26", "semestre 2 2026"));
        matriculas.add(new Matricula(2L, "001", "002","09/08/26", "semestre 2 2026"));
        matriculas.add(new Matricula(3L, "001", "003","09/08/26", "semestre 2 2026"));
        matriculas.add(new Matricula(4L, "001", "004","09/08/26", "semestre 2 2026"));
        matriculas.add(new Matricula(5L, "002", "001","09/08/26", "semestre 2 2026"));
        matriculas.add(new Matricula(6L, "002", "002","09/08/26", "semestre 2 2026"));
        System.out.println("List of Matricula");
        for (Matricula matricula : matriculas){
            System.out.println("ID " +  matricula.getId() + " ID Curso "+ matricula.getCursoId() + " ID Estudiante " + matricula.getStudentId() + " Fecha Matricula " + matricula.getFechaMatricula() + " Periodo academico " +  matricula.getPeriodoAcademico());
        }










        List<String> name = new ArrayList<>();

        name.add("Juana");
        name.add("Paula");
        name.add("Andrea");
        name.add("Laura");
        name.add("Juan");

        System.out.println(name);








    }
}
