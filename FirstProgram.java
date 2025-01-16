//import java.util.*;
//public class FirstProgram {
//    public static void main(String[] args) {
        //System.out.println("Hello Java");
        // WAP to swap variables without using third variable
//        int a=10;
//        int b=20;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);
        //WAP to find the ASCII value of a character
       // Scanner sc=new Scanner(System.in);
//        char ch=sc.next().charAt(0);
//        int ch1=(int) ch;
//        System.out.println(ch1);
        //WAP to sum of digits in integer
//        int rem=0;
//        int n=sc.nextInt();
//        while(n>0)
//        {
//            int m=n%10;
//            rem=rem+m;
//            n=n/10;
//        }
//        System.out.println(rem);
        //WAP to check odd or even
//        int n=sc.nextInt();
//        if(n%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }


//    }
//}
//jdk-tools and libraries
//jre-physical implementation and run time environment
//jvm-virtual implementation
//java code is converted in byte code

//WAP to explain memory usage in Java with the help of variables
//public class FirstProgram {
//    static int var1 = 50;
//    int var2;
//
//    public static void main(String[] args) {
//
//        int var3 = 10;
//        FirstProgram Lec = new FirstProgram();
//        Lec.var2 = 20;
//
//        System.out.println( var3);
//        System.out.println(  var1);
//        System.out.println(  Lec.var2);
//
//    }
//}
//WAP to employee
// class Employee{
//    String name;
//    int id;
//    double salary;
//    //String address;
//    String department;
//    Employee(String name,int id,double salary,String department){
//        this.name=name;
//        this.id=id;
//        this.salary=salary;
//        this.department=department;
//    }
//    void display(){
//        System.out.println("Name: "+name+" Id: "+id+" Salary: "+salary+" Department: "+department);
//    }
//
//}
//public class FirstProgram{
//    public static void main(String[] args) {
//        //Scanner sc=new Scanner(System.in);
//        Employee em=new Employee("Amrit",1,1000,"IT");
//        em.display();
//
//
//
//    }
//}

//WAP to create factorial of given number
//import java.util.*;
//public class FirstProgram{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int mul=1;
//        while(n>0)
//        {
//            mul =mul* n;
//            n--;
//
//        }
//        for(int i=n;i>0;i--)
//        {
//            mul=mul*i;
//
//        }
//        System.out.println(mul);
//    }
//}
//Write a Java program to calculate the simple interest for a given principal
//amount, rate of interest, and time period. Ensure that the input values are valid and
//non-negative.
//
//        Constraints:
//        0 <= P <= 100000
//        0 <= R <= 100
//         0 <= T <= 30
//import java.util.*;
//public class FirstProgram
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int P=sc.nextInt();
//        int R=sc.nextInt();
//        int T=sc.nextInt();
//        int princ=0,rate=0,time=0;
//
//
//        if(P>=0 && P<=100000){
//            princ=P;
//        }
//        if(R>=0 && R<=100){
//            rate=R;
//        }
//        if(T>=0 && T<=30){
//            time=T;
//        }
//        double si=(princ*rate*time)/100;
//        System.out.println(si);
//
//
//    }
//}
//Write a Java program to convert the temperature from Fahrenheit to
//Celsius. Ensure that the input Fahrenheit temperature is within a valid range.
//
//        Constraints:
//Fahrenheit temperature (F) is a decimal value.
//        -100 <=F <= 300
//import java.util.*;
//public class FirstProgram{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //(32°F − 32) × 5/9
//        double f=sc.nextDouble();
//        double fr=0;
//        if(f>=-100 && f<=300){
//            fr=f;
//        }
//        double cel=(32*fr-32)*5/9;
//        System.out.println(cel);
//
//    }
//}

//Write a Java program to calculate the BMI (Body Mass Index) based on
//weight and height inputs. Ensure that weight and height are within valid ranges.
//
//        Constraints:
//Weight (W) and height (H) are positive decimal values.
//        0 < W < 500
//        0< H < 3.0

//import java.util.*;
//public class FirstProgram{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double W=sc.nextDouble();
//        double H=sc.nextDouble();
//        double weight=0;
//        double height=0;
//        if(W>0 && W<500)
//        {
//            weight=W;
//        }
//        if(H>0 && H<3.0)
//        {
//            height=H;
//        }
//        double BMI=weight/(height*height);
//        System.out.println(BMI);
//    }
//}
//WAP to multiplication table
import java.util.*;
public class FirstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int mul=0;
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(n+" X "+i+"= "+n*i);
//
//        }
        //prime number
//        int count=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==2)
//        {
//            System.out.println("Prime");
//        }
//        else{
//            System.out.println("Not prime");
//        }
        //Generate Armstrong numbers b/w two intervals
//        int sum=0;
//        int count=0;
//        int m=0;
//        while(n>0){
//            m=n%10;
//            count=count+m;
//            //sum=sum+m;
//            //n=n/10;
//            count++;
//        }
        //System.out.println(sum);
        // int m=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++){
//                System.out.print("+");
//            }
//            System.out.println();
//        }
//        boolean b1=sc.nextBoolean();
//        boolean b2=sc.nextBoolean();
//        if(b1==true && b2==true){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        if(b1==true || b2==true){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//
//            System.out.println(!b1);
//
//
//            System.out.println(!b2);

//int score=sc.nextInt();
//if(score>=90)
//{
//    System.out.println("A");
//}
//else if(score<=80 && score<=89){
//    System.out.println("B");
//}
//else if(score<=70 && score<=79){
//    System.out.println("C");
//}
//else if(score<=60 && score<=69){
//    System.out.println("D");
//}
//else{
//    System.out.println("F");
//}
        //Write a program to keep taking numbers as input and print them until 0.
//        boolean m=true;
//        int n=0;
//        while(m){
//             n=sc.nextInt();
//
//            if(n==0){
//                m=false;
//                System.out.println("Not granted");
//            }
//            System.out.println(n);
//        }
        //Magic square
//int n=sc.nextInt();
//for(int i=1;i<=n;i++)
//{
//    for(int j=1)
//}
        //int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            if(i==1 || i==3)
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1;j<=n;j++)
//            {
//                System.out.print("+");
//            }
//            System.out.println();
//        }

        //Pyramid pattern
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=(2*i-1);k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Write a program to count the number of digits, alphabets, and special characters in a string using a for loop and if-else conditions.
////        Input: "Hello123!"
////        Outputs: Alphabets = 5, Digits = 3, Special Characters = 1
  //      String str=sc.nextLine();

//        int alphabet=0,digit=0,special=0;
//        for(int i=0;i<str.length();i++){
//            char a=str.charAt(i);
//            if(Character.isLetter(a)){
//                alphabet++;
//            }
//            else if(Character.isDigit(a)){
//                digit++;
//            }
//            else{
//                special++;
//            }
//
//        }
//        System.out.print("Alphabets = "+alphabet+",Digits = "+digit+",Special Character = "+special);
        //Write a program to reverse a string using a for loop.
//        String str=sc.nextLine();
//        String a="";
//        for(int i=str.length()-1;i>=0;i--)
//        {
//             a+=str.charAt(i);
//
//        }
//        System.out.println(a);

        int n=sc.nextInt();
        int k=n;
        int m=sc.nextInt();
        for(int i=1;i<=k.length();i++){

        }
    }
}