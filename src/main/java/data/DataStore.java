package data;

import models.Course;
import models.Enrrollment;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Student> listStudents;
    private final List<Course> listCourses;
    private final List<Enrrollment> listEnrollments;

    public DataStore(){//Constructor vacio, permite inicializar las listas
        listStudents = new ArrayList<>();
        listCourses = new ArrayList<>();
        listEnrollments = new ArrayList<>();
    }

    //Debo crear el crud para enviar y recibir la inforamcion de las liastas

    public List<Student> getListStudents() {//Recupera toda la lista de estudiantes
        return listStudents;
    }

    public void addStudent(Student student){//Agrega un estudiante
        listStudents.add(student);
    }

    public Student getStudent(long id){
        for (Student student: listStudents){
            if (student.getStudentId() == id){
                return student;
            }
        }
        return null;
    }

    public void removeStudent(long id){
        Student student = getStudent(id);
        if (student != null){
            listStudents.remove(student);
        }
    }




}
