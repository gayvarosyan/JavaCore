package Classworks.figurePainter;

public class FigurePainter {

    public void figureOne(char c, int LineCount) {
        //*
        //**
        //***
        //****
        //*****
        for (int i = 1; i <=LineCount ; i++) {
            for (int j = 5; j > j; j--) {
                System.out.print(c + " ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(c +" ");
            }
            System.out.println();
        }
        System.out.println();
        //*****
        //****
        //***
        //**
        //*
    }

    public void figureTwo(char c) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
            //*
            //**
            //***
            //****
            //*****

    }

    public void figureTree(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
           //*****
           //****
           //***
           //**
           //*


    public  void figureFour(char c) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
              //   *
              //  ***
              // *****
              //*******
              // *****
              //  ***
              //   *

    public  void figureFive(char c) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
