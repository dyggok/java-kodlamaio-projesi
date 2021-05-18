package com.company;

public class UserManager {
    public void multiCreate(User[] users){
        for(User user: users){
            create(user);
        }
    }
    public void create(User user){
        System.out.println("İşlem başarılı");
    }
    public void delete(User user){
        System.out.println("İşlem başarılı");
    }

    public void updateName(User user, String firstname, String lastname){
        System.out.println(user.getFirstName()+" "+user.getLastName()+
                " adlı kullanıcı adını "+firstname+" ve soyadını "+lastname+" olarak güncelledi.");
        user.setFirstName(firstname);
        user.setLastName(lastname);
    }

    public void addAddress(User user, String address){
        user.setAdress(address);
        System.out.println(user.getFirstName()+" adlı kullanıcı adres ekledi.");
    }

    public void logout(User user){
        System.out.println("İşlem başarılı");
    }

}
