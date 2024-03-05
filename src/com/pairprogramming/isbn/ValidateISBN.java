package com.pairprogramming.isbn;

public class ValidateISBN {
    public boolean test1(String isbn) {
        int total=0;
        if (extracted(isbn)) return true;
        if(isbn.length()!=10)
        {throw new NumberFormatException("It must be 10digit number");

        }
        for(int i=0;i<10;i++)
        {

            if(!Character.isDigit(isbn.charAt(i)))
            {if(i==9 && isbn.charAt(i)=='x')
            {
                total+=10;
            }else {
                throw new NumberFormatException("It must be 10digit number");
            }

            }total+=Character.getNumericValue(isbn.charAt(i))*(10-i);
        }
        return total%11==0?true:false;
    }

    private boolean extracted(String isbn) {
        if(isbn.length()==13)
        {
            return true;
        }
        return false;
    }
}
