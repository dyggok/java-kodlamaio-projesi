package com.company;

public class StudentManager extends UserManager{
    @Override
    public void create(User user) {
        System.out.println(user.getFirstName()+" adlı öğrenci profili oluşturuldu.");
    }
    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName()+" adlı öğrenci profilini sildi.");
    }

    public void comment(Student student, String comment){
        System.out.println(student.getFirstName()+" adlı kullanıcı "+"\""+comment+"\""+" yorumunu ekledi.");
    }

    @Override
    public void logout(User user) {
        System.out.println(user.getFirstName()+" adlı öğrenci çıkış yaptı.");
    }
}
