package app;

import models.Course;
import models.Enrrollment;
import models.Student;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println("ID " + student.getIdStudent() + " Nombre " + student.getFirstnemae() + " Apellido " + student.getLastname() + " Email " + student.getEmail() + " Telefono " + student.getPhone() );
        }

        courses = new ArrayList<>();
        courses.add(new Course(1L, "INT01PROM", "Introduccion a la programacion", "Curso Semetre 1 programacion", 20));
        courses.add(new Course(2L, "LO01PROM", "Logica de programacion", "Curso Semetre 1 programacion", 20));
        courses.add(new Course(3L, "BD01PROM", "Bases de datos", "Curso Semetre 1 programacion",20));
        courses.add(new Course(4L,"FON02PROM", "Frontend I", "Curso Semetre 2 programacion", 20));
        courses.add(new Course(5L, "BAC02PROM", "Backend I", "Curso Semetre 2 programacion", 20));
        System.out.println("List of Curso");
        for (Course course : courses){
            System.out.println("ID " + course.getIdCourse() +"Codigo" + course.getCodeCurse() + " Nombre curso " + course.getNameCurse() + " Descripcion " + course.getDesCurse() + "Capacidad Max" +  course.getMaxCapacity());
        }


        enrrollments = new ArrayList<>();
        enrrollments.add(new Enrrollment(1L, 1, "1", "09/08/26");
        enrrollments.add(new Enrrollment(2L, 2, "1","09/08/26"));
        enrrollments.add(new Enrrollment(3L, 3, "1","09/08/26"));
        enrrollments.add(new Enrrollment(4L, 4, "1","09/08/26"));
        enrrollments.add(new Enrrollment(5L, 5, "0","09/08/26"));
        enrrollments.add(new Enrrollment(6L, 6, "1","09/08/26"));
        System.out.println("List of Matricula");
        for (Enrrollment enrrollment : enrrollments){
            System.out.println("ID " +  enrrollment.getIdEnrrollment() + "ID Estudiante" + enrrollment.getIdStudent() + "Estatus" + enrrollment.getStatus() + "Fecha Mat" + enrrollment.getEnrrollmentDate());
        }













    }
}
