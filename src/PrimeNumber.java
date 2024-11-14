import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        System.out.println(num);
        if(isPrime(num)){
            System.out.println("It is prime not number");
        }
        else{
            System.out.println("It is prime number");
        }
    }
    static boolean isPrime(int input){
        for (int i=2;i<input;i++){
            if (input % i==0){
                return true;
            }
        }
        return false;
    }
}
