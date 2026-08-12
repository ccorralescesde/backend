package app;

import models.Course;
import models.Enrrollment;
import models.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        students = new ArrayList<>();
        students.add(new Student(3L, "Jhon", "Doe", "joh@example.com", "3123321321"));
        students.add(new Student(4L, "Jana", "Simit", "smit@example.com", "354352345"));
        students.add(new Student(5L, "Mario", "Cardenas", "marioh@example.com", "32543534543"));
        students.add(new Student(6L, "Maria", "Gonzales", "maria@example.com", "3113234231432"));
        students.add(new Student(7L, "Pedro", "Lopez", "pedro@example.com", "313432541234"));

        System.out.println("List of Students");
        for (Student student : students){
            System.out.println("ID " + student.getStudentId() + " Nombre " + student.getFirstnemae() + " Apellido " + student.getLastname() + " Email " + student.getEmail() + " Telefono " + student.getPhone() );
        }

        courses = new ArrayList<>();
        courses.add(new Course(1L, "Introduccion a la programacion", "Curso Semetre 1 programacion"));
        courses.add(new Course(2L, "Logica de programacion", "Curso Semetre 1 programacion"));
        courses.add(new Course(3L, "Bases de datos", "Curso Semetre 1 programacion"));
        courses.add(new Course(4L, "Frontend I", "Curso Semetre 2 programacion"));
        courses.add(new Course(5L, "Backend I", "Curso Semetre 2 programacion"));
        courses.add(new Course(6L, "Metodologias agiles", "Curso Semetre 2 programacion"));
        System.out.println("List of Curso");
        for (Course course : courses){
            System.out.println("ID " + course.getId() + " Nombre curso " + course.getNombreCurso() + " Descripcion " + course.getDesCurso());
        }

        enrrollments = new ArrayList<>();
        enrrollments.add(new Enrrollment(1L, "1", "1","09/08/26", "semestre 2 2026"));
        enrrollments.add(new Enrrollment(2L, "1", "1","09/08/26", "semestre 2 2026"));
        enrrollments.add(new Enrrollment(3L, "1", "3","09/08/26", "semestre 2 2026"));
        enrrollments.add(new Enrrollment(4L, "1", "4","09/08/26", "semestre 2 2026"));
        enrrollments.add(new Enrrollment(5L, "2", "1","09/08/26", "semestre 2 2026"));
        enrrollments.add(new Enrrollment(6L, "2", "2","09/08/26", "semestre 2 2026"));
        System.out.println("List of Matricula");
        for (Enrrollment enrrollment : enrrollments){
            System.out.println("ID " +  enrrollment.getId() + " ID Curso "+ enrrollment.getCursoId() + " ID Estudiante " + enrrollment.getStudentId() + " Fecha Matricula " + enrrollment.getFechaMatricula() + " Periodo academico " +  enrrollment.getPeriodoAcademico());
        }













    }
}
