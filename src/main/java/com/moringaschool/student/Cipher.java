package com.moringaschool.student;


/**
 * Author: Eliud Gateri
 * Student: Moringa School
 *
 **/
public class Cipher {
    private int key;
    private String message;

    private String cipher;

    private String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Cipher() {
    }
    public String encrypt(String plainText, int shiftKey){
        setMessage(plainText);
        setKey(shiftKey);
       String cipherText="";
        for(int i=0;i<getMessage().length();i++){
            int characterPosition =alphabet.indexOf(getMessage().charAt(i));
            int newCharacterPosition =(getKey()+characterPosition)%26;
            char replacementCharacter =alphabet.charAt(newCharacterPosition);
           cipherText +=replacementCharacter;
        }
     return cipherText;

    }
    public String decrypt(String cipherText, int shiftKey){
        setCipher(cipherText);
        setKey(shiftKey);
        String messageText="";
        for(int i=0;i<getCipher().length();i++){
            int characterPosition =alphabet.indexOf(getMessage().charAt(i));
            int newCharacterPosition =(getKey()+characterPosition)%26;
            char replacementCharacter =alphabet.charAt(newCharacterPosition);
            messageText +=replacementCharacter;
        }
        return messageText;
    }

    public int getKey() {

        return key;
    }

    public void setKey(int key) {

        this.key = key;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

    public String getCipher() {

        return cipher;
    }

    public void setCipher(String cipherText) {

        this.cipher = cipher;
    }


}
