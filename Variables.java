package domain;

public class Variables{
    public static void main(String[] args){
        System.out.println("Variables and its sizes");

        boolean bol = true;
        System.out.println("boolean bol = " + bol);

        byte by = 127;
        System.out.println("byte by = " + by);

        char ch = 'X';
        ch = 68;
        System.out.println("char ch = " + ch);

        short shrt = -20;
        System.out.println("short shrt = " + shrt);

        int i = 1000000;
        System.out.println("int i = " + i);

        float f = 12.034f;
        System.out.println("float f = " + f);

        double d = 1200.23E-2;
        System.out.println("double d = " + d);
        
        long l = 120020397;
        System.out.println("long l = " + l);
        //----------------------------------------------
        String str1 = new String("Good Morning !");//heap
        String str2 = "Shailendra!!";//String pool
        String str3 = str1+str2; //operator + overloaded
        System.out.println(str1 + " - " + str2 + " = " + str3);
        
        str3 += 10;
        System.out.println(str3);
        
        //======================================
        if (i%2==0)
            System.out.println("interger is true");
        
        str1 += f;
        System.out.println(str1);
        
    }
}


//=======================================
/*
Variables and its sizes
boolean bol = true
byte by = 127
char ch = D
short shrt = -20
int i = 1000000
float f = 12.034
double d = 12.0023
long l = 120020397
Good Morning ! - Shailendra!! = Good Morning !Shailendra!!
Good Morning !Shailendra!!10
interger is true
Good Morning !12.034
*/
