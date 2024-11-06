public class ThreeQuestions {
    public static void main(String[] args) {

        //Q1
        //Print Following pattern
        //1
        //12
        //123
        //1234
        //12345

        for (int i=0;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Q2
        // Print Following pattern
        //12345
        //1234
        //123
        //12
        //1

        for (int i=5;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Q3
        //Print Following pattern
        //*
        //**
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*

        for (int i=0;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=4;i>0;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
