package juit.utils;

public class Functions {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2)
    {
        return num1*num2;
    }
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
    public boolean equals(String str1,String str2)
    {
        return str1.equals(str2);
    }
    public boolean equals(int num1,int num2)
    {
        return num1 == num2;
    }
    public boolean equals(short num1,short num2)
    {
        return num1 == num2;
    }
    public boolean equals(byte num1,byte num2)
    {
        return num1 == num2;
    }
    public boolean equals(String str1,boolean bool)
    {
        String temp = String.valueOf(bool);
        return str1.equals(temp);
    }
    public boolean equals(boolean bool1,boolean bool2)
    {
        return bool1 == bool2;
    }
    public boolean equals(char c1,char c2)
    {
        return c1 == c2;
    }


}
