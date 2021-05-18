package com.company;

public class Main {

    public static void main(String[] args) {
        //öğrenci oluşturma
        Student student = new Student();
        student.setFirstName("Duygu");
        student.setLastName("Gök");
        student.setEmail("xxx@gmail.com");
        //eğitmen oluşturma
        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("xxxe@gmail.com");
        //öğrenci ve eğitmen tek işlemle create edildi
        User[] users = {student,instructor};
        UserManager userManager = new UserManager();
        userManager.multiCreate(users);
        //öğrenci ile ilgili işlemler
        StudentManager studentManager = new StudentManager();
        studentManager.comment(student,"Dersler çok güzel");
        studentManager.updateName(student,"Deniz","Gök");
        //eğitmenle ilgili işlemler
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addPosition(instructor,"Yazılım");
        instructorManager.logout(instructor);


    }
}
