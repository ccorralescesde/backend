package app;

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





        List<String> name = new ArrayList<>();

        name.add("Juana");
        name.add("Paula");
        name.add("Andrea");
        name.add("Laura");
        name.add("Juan");

        System.out.println(name);








    }
}
