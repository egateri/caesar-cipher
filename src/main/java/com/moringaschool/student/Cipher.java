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

    private String upperAlphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowerAlphabet ="abcdefghijklmnopqrstuvwxyz";


    public Cipher() {
    }
    public String encrypt(String plainText, int shiftKey){
        setMessage(plainText);
        setKey(shiftKey);
       String cipherText="";
        for(int i=0;i<getMessage().length();i++){
            if(Character.isUpperCase(getMessage().charAt(i))){
                int characterPosition =upperAlphabet.indexOf(getMessage().charAt(i));
                int newCharacterPosition =(getKey()+characterPosition)%26;
                char replacementCharacter =upperAlphabet.charAt(newCharacterPosition);
                cipherText +=replacementCharacter;

            }
            else{
                int characterPosition =lowerAlphabet.indexOf(getMessage().charAt(i));
                int newCharacterPosition =(getKey()+characterPosition)%26;
                char replacementCharacter =lowerAlphabet.charAt(newCharacterPosition);
                cipherText +=replacementCharacter;
            }
        }
     return cipherText;

    }
    public String decrypt(String cipherText, int shiftKey){
        setCipher(cipherText);
        setKey(shiftKey);
        String messageText="";
        for(int i=0;i<getCipher().length();i++){
            if(Character.isUpperCase(getCipher().charAt(i))){
                int characterPosition =upperAlphabet.indexOf(getCipher().charAt(i));
                int newCharacterPosition =(characterPosition-getKey())%26;
                if(newCharacterPosition<0){
                    newCharacterPosition=26+newCharacterPosition;
                }
                char replacementCharacter =upperAlphabet.charAt(newCharacterPosition);
                messageText +=replacementCharacter;

            }
            else{
                int characterPosition =lowerAlphabet.indexOf(getCipher().charAt(i));
                int newCharacterPosition =(characterPosition-getKey())%26;
                if(newCharacterPosition<0){
                    newCharacterPosition=26+newCharacterPosition;
                }
                char replacementCharacter =lowerAlphabet.charAt(newCharacterPosition);
                messageText +=replacementCharacter;
            }

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

    public void setCipher(String cipher) {

        this.cipher = cipher;
    }


}
