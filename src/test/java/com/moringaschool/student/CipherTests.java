package com.moringaschool.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CipherTests {


    Cipher cipherTest= new Cipher();

    @Test
    public void encryption_with_lower_case_should_pass(){
        String value = cipherTest.encrypt("abcd",1);
        Assertions.assertEquals("bcde",value);
       
    }
    @Test
    public void encryption_with_upper_case_should_pass(){
        String value = cipherTest.encrypt("BCDEF",2);
        Assertions.assertEquals("DEFGH",value);
    }
    @Test
    public void encryption_with_both_upper_and_case_should_pass(){
        String value = cipherTest.encrypt("ABcd",1);
        Assertions.assertEquals("BCde",value);
    }

    @Test
    public void decryption_with_lower_case_should_pass(){
        String value = cipherTest.decrypt("abcd",1);
        Assertions.assertEquals("zabc",value);
    }
    @Test
    public void decryption_with_upper_case_should_pass(){
        String value = cipherTest.decrypt("BCDEF",2);
        Assertions.assertEquals("ZABCD",value);
    }
    @Test
    public void decryption_with_both_upper_and_case_should_pass(){
        String value = cipherTest.decrypt("BcdE",1);
        Assertions.assertEquals("AbcD",value);
    }
}
