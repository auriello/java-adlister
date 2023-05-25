//package com.codeup.adlister.models;
//
//import com.codeup.adlister.dao.DaoFactory;
//import com.codeup.adlister.models.Users;
//import org.mindrot.jbcrypt.BCrypt;
//
//public class PasswordsDemo {
//    public static void main(String[] args){
//        DaoFactory.getUsersDao().findByUsername("arlo");
//        String plainTextPassword = user.getPassword();
//
//        String hashedPw = BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
//
//        System.out.println(hashedPw);
//
//        user.setPassword(hashedPw);
//
//        System.out.println(user.getPassword());
//    }
//}
