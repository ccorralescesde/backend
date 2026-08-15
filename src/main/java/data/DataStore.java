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

    //Debo crear el crud para enviar y recibir la inforamcion de las liastas Estudiantes

    public List<Student> getListStudents() {//Recupera toda la lista de estudiantes
        return listStudents;
    }

    public void addStudent(Student student){//Agrega un estudiante
        listStudents.add(student);
    }

    public Student getStudent(long idStudent){
        for (Student student: listStudents){
            if (student.getIdStudent() == idStudent){
                return student;
            }
        }
        return null;
    }

    public void removeStudent(long idStudent){
        Student student = getStudent(idStudent);
        if (student != null){
            listStudents.remove(student);
        }
    }

    //Crud para la lista cursos

    public List<Course> getListCourses() {
        return listCourses;
    }

    public void addCourse(Course course){listCourses.add(course);}

    public Course getCourse(long idCourse){
        for (Course course: listCourses){
            if (course.getIdCourse() == idCourse){
                return course;
            }
        }
        return null;
    }

    public void removeCourse(long idCourse){
        Course course = getCourse(idCourse);
        if (course != null){
            listCourses.remove(course);
        }
    }

    //Crud para lista listEnrollments

    public List<Enrrollment> getListEnrollments() {
        return listEnrollments;
    }

    public void addErrollment(Enrrollment enrollment){listEnrollments.add(enrollment);}

    public Enrrollment getEnrollment(long idEnrollment) {
        for (Enrrollment enrollment : listEnrollments) {
            if (enrollment.getIdEnrrollment() == idEnrollment) {
                return enrollment;
            }
        }
        return null;
    }

        public void removeEnrrollment(long idEnrrollment){
            Enrrollment enrollment = getEnrollment(idEnrrollment);
            if (enrollment != null){
                listEnrollments.remove(enrollment);
            }
        }
    }

