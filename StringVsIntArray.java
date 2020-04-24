package domain;

public class UserDefinedTypes {

    public static void main(String[] args) {
        System.out.println("hello world!");
        
        //Array
        int[] arr = new int[5];
        for(int m=0 ; m < arr.length ; ++m) {
            arr[m] = m+1;
            System.out.println(arr[m]);
        }
        //arr[5] = 10;//exception
        //
        
        System.out.println(arr);
        arr = new int[10];
        System.out.println(arr);
        int[] arr1 = {1,2,3};
        System.out.println(arr1);
       // arr1 = {2,3,4}; cannot re assign this
        //=========================================
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        if(str1 == str2)
            System.out.println("str1==str2");
        String str3 = "Hello";
        if(str1 == str3)
            System.out.println("str1==str3");
        
        String str11 = str1;
        if(str1 == str11)
            System.out.println("str1==str11");
        
        String str33 = str3;
        if(str3 == str33)
            System.out.println("str3==str33");
        
    }

}
/*
hello world!
1
2
3
4
5
[I@4aa298b7
[I@7d4991ad
[I@28d93b30
str1==str11
str3==str33
*/
