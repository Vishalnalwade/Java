public class Loops {
    public static  void main(String[] args){
        String word="Hello";

//        start;tell where to stop; increment or decrement;
//        i++; i=i+1; ++i;
//        i--; i=i-1; --i;
//        shay
//        for (int i=10;i>0;i--) {
//            if(i % 2 != 0 && i >3)
//            System.out.println(i);
//        }
//        int k=0;
//        while (k<10){
//            System.out.println(k);
//            k--;
//        }
        String original="abcdefghi";

        reverseString(original);
        String name="Vishal";
        if(name.equalsIgnoreCase("Vishal")){
            System.out.println("My name is VishAl");
        }
        else {
            System.out.println("My name is not Vishal");
        }
    }
    static void reverseString(String input){
        //apply your logic here
        int length=input.length();
        int i=length-1;
        while (i>=0) {
            System.out.println(input.charAt(i));
            i--;
        }
    }
}
