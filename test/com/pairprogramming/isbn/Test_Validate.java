package com.pairprogramming.isbn;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test_Validate {
   @Test
    public void testIsbn()
    {
        ValidateISBN obj=new ValidateISBN();
        boolean res=obj.test1("0140449116");
        assertTrue("Hello",res);

    }
    @Test
    public void testInvalidIsbn()
    {
        ValidateISBN obj1=new ValidateISBN();
        boolean res=obj1.test1("0140449117");
        assertFalse("hello1",res);

    }
 @Test(expected = NumberFormatException.class)
    public void nineDigitIsbnNotAllowed()
 {
     ValidateISBN obj3=new ValidateISBN();
     boolean res=obj3.test1("12345");
//    fail();
 }
    @Test(expected = NumberFormatException.class)
    public void DigitAllowed()
    {
        ValidateISBN obj3=new ValidateISBN();
        boolean res=obj3.test1("Helloworld");

    }
   @Test
    public void endingWithx()
   {
       ValidateISBN obj=new ValidateISBN();
       boolean
       res=obj.test1("012000030x");
      assertTrue(res);

   }
   @Test
    public void thirteenDigitIsbn()
   {
       ValidateISBN obj=new ValidateISBN();
       boolean
               res=obj.test1("9781853260089");
       assertTrue(res);


   }
}
