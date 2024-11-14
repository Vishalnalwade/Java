import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        char num='1';
//        System.out.println((int)num);
        String user=sc.nextLine();
        if(isPalindrome(user)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
    static  boolean isPalindrome(String input){
        String left="";
        String right="";
        for (int i=0;i<input.length();i++){
            left=left+input.charAt(i);
        }

        for (int i=input.length()-1;i>=0;i--){
            right=right+input.charAt(i);
        }

       return right.equals(left);

    }
    static  boolean isPalindromeOptimised(String input){
        int end=input.length() - 1;
        int mid=input.length() /2;
        for (int start=0;start <mid;start++){
            char first=input.charAt(start);
            char last=input.charAt(end);
            if(first!=last){
                return false;
            }
            end--;
//            String a="hi";
//            a.substring(0,1);TODO:2D array


        }
        return true;
    }
}
