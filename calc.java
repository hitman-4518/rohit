import java.util.Scanner;
public class calc {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your 1st value : ");
        int a=sc.nextInt();
        System.out.print("Enter your 2nd value: ");
        int b=sc.nextInt();
        System.out.println("Enter a 1for(+) ,2for(-), 3for(*), 4for(/), 5for(%)");
        int num=sc.nextInt();
        if(num==1){
            System.out.print("addition of two number is: "+(a+b));
        }
        else if(num==2){
            System.out.println("subtract of two number: "+(a-b));
        }
        else if(num==3){
            System.out.println("Multiplay of two number is: "+(a*b));
        }
        else if(num==4){
            System.out.println("m divided by n the output is: "+(a/b));
        }
        else if(num==5){
            System.out.println("modulus of two number is: "+(a%b));
        }
        else{
            System.out.println("You Enter wrong number");
        }
    }
}