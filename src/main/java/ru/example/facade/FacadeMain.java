package ru.example.facade;

public class FacadeMain {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1100100","11001000"));// 100 + 200 = 100101100
        System.out.println(bins.mult("1100100","11001000"));// 100 * 200 = 100111000100000
    }
}
