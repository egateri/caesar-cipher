package com.moringaschool.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationTests {
    Validation validationTest = new Validation();

    @Test
    public void validation_should_pass_with_valid_inputs(){
        String value = validationTest.validate("abcd","7");
        Assertions.assertEquals(null,value);
    }

    @Test
    public void validation_should_fail_with_non_integer_shift_key(){
        String value = validationTest.validate("abcd","7.0");
        Assertions.assertEquals("The Shift Key must be a number (integer)",value);
    }

    @Test
    public void validation_should_fail_with_special_characters(){
        String value = validationTest.validate("abcd@#$!","1");
        Assertions.assertEquals("There are special Characters in the message/cipher text!",value);
    }

    @Test
    public void validation_should_fail_with_blank_cipher_or_text_message(){
        String value = validationTest.validate("","1");
        Assertions.assertEquals("The Message or Cipher text must not be blank",value);
    }
    @Test
    public void validation_should_fail_with_blank_shift_key(){
        String value = validationTest.validate("r","");
        Assertions.assertEquals("The Shift key provided must not be blank",value);
    }
}

