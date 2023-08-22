package com.moringaschool.student;


/**
 * Author: Eliud Gateri
 * Student: Moringa School
 *
 **/
public class Cipher {
    private int key;
    private String message;

    private String cipherText;


    public Cipher() {
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

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
}
