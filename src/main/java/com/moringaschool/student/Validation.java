package com.moringaschool.student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Eliud Gateri
 * Student: Moringa School
 *
 **/

public class Validation {

    public Validation(){

    }
    public String validate (String message, String ShiftKey){
        if(message==null||message.trim().isEmpty()){
            return "The Message or Cipher text must not be blank";
        }
        if(ShiftKey==null||ShiftKey.trim().isEmpty()){
            return "The Shift key provided must not be blank";
        }
        try{
            int key = Integer.parseInt(ShiftKey);
//            if(key==0){
//                return "The key must be non-zero";
//            }
        }
        catch (Exception exception){
            return "The Shift Key must be a number (integer)";
        }
        Pattern pattern = Pattern.compile("[^a-z]",Pattern.CASE_INSENSITIVE);
        Matcher matcher =pattern.matcher(message);
        boolean specialCharacterPresent = matcher.find();
        if(specialCharacterPresent){

            return "There are special Characters in the message/cipher text!";
        }
        else {
            return null;
        }

    }
}
