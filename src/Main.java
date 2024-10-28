public class Main {
    public static void main(String[] args) {
        Book book = new Book(101,"novel",100,"USA");
        Book bookTwo = new Book(102,"novel2",102,"India");
        int bookNo=book.getBookNo();//operation
        String country=bookTwo.getCountry();
        System.out.println(bookNo);
        System.out.println(country);
    }
}

class Book{
//    datatype-type of data
//    int ,char, String,boolean;
    int bookNo;
//    data type -int  variable name-bookNo
    String type;
    int rackNo=100;
    String country="India";

    public int getBookNo(){
        return bookNo;
    }

    public String getCountry(){
        return country;
    }

    public Book(int bookNo, String type, int rackNo, String country) {
        this.bookNo = bookNo;
        this.type = type;
        this.rackNo = rackNo;
        this.country = country;
    }
}

//1 give me books
//Book
//types of books
// book number
//rack no
//is Avaliable yes no
//a
//abc

//Real World Problems
//code -library systems savebookinfo,students,

//old Registar doarys
//new database Students ,books ,payments,
//[][][][][]
//program -set of instructions
//[java] jdk jre jvm .class


//datatypes
//variables
//object
//method

//1 class
//2 variables inside class
//3 datatype of variables
//4 assign value to variable
//5 operations getBookNo() Writing method of that class
//6 printed that operations
//7 call that method