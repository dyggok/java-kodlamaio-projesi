package com.company;

public class InstructorManager extends UserManager{
    @Override
    public void create(User user) {
        System.out.println(user.getFirstName()+" adlı eğitmenin profili oluşturuldu");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName()+" adlı eğitmen profilini sildi.");
    }

    @Override
    public void logout(User user) {
        System.out.println(user.getFirstName()+" adlı eğitmen çıkış yaptı.");
    }

    public void addPosition(Instructor instructor, String position){
        instructor.setPosition(position);
        System.out.println(instructor.getFirstName()+" adlı eğitmen alanını "+position+" olarak ekledi.");
    }
}
