package models;

public class Student {

    private Long idStudent;
    private String firstnemae;
    private String lastname;
    private String email;
    private String phone;

    public Student(){

    }

    public Student(Long idStudent, String firstnemae, String lastmane, String email, String phone){
        this.idStudent = idStudent;
        this.firstnemae = firstnemae;
        this.lastname = lastmane;
        this.email = email;
        this.phone = phone;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstnemae() {
        return firstnemae;
    }

    public void setFirstnemae(String firstnemae) {
        this.firstnemae = firstnemae;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
