package ru.example.facade;

public class BinOps {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
    /*Переведите числа из двоичной записи в
         строках в int, перемножьте и переведите
         обратно в двоичную запись*/
    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) * Integer.parseInt(b,2));
    }
}