package com.example.kirfood;

import android.util.Patterns;
public class Utilities {

    private static final int MIN_PASSWORD_LENGTH = 6;

    private static boolean EMAIL_VALID;
    private static boolean PASSWORD_VALID;
    private static boolean PHONE_NUMBER_VALID;


    public static boolean validateEmail(String email){
        EMAIL_VALID = Patterns.EMAIL_ADDRESS.matcher(email).matches();
        return EMAIL_VALID;
    }

    public static boolean validatePassword(String password){
        PASSWORD_VALID =  password.length() > MIN_PASSWORD_LENGTH;
        return PASSWORD_VALID;
    }

    public static  boolean validatePhoneNumber(String phoneNumber){
        PHONE_NUMBER_VALID = Patterns.PHONE.matcher(phoneNumber).matches();
        return PHONE_NUMBER_VALID;
    }

    public static boolean canRegister(){
        return EMAIL_VALID && PASSWORD_VALID && PHONE_NUMBER_VALID;
    }



}