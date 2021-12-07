import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dizideki Elemanların Max ve Min Değerlerini Bulan Program
        System.out.print("\n!!! DİZİDEKİ ELEMANLARIN MAX VE MİN DEĞERLERİNİ BULAN PROGRAM !!!\n");

        int[] list1 = {56, 34, 1, 8, 101, -2, -33};
        String list = Arrays.toString(list1);
        System.out.println("Dizi : " + list);


        int min = list1[0];
        int max = list1[0];

        for (int i = 0; i < list1.length; i++) {
            if (max < list1[i]) {
                max = list1[i];
            }
        }

        for (int i = 0; i < list1.length; i++) {
            if (min > list1[i]) {
                min = list1[i];
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);


        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
        System.out.print("\n!!! DİZİDEKİ ELEMANLARIN GİRİLEN SAYIDAN KÜÇÜK EN YAKIN SAYIYI VE EN BÜYÜK EN YAKIN SAYIYI BULAN PROGRAM !!!\n");
        // Bir önceki programda bulunan max ve min değerler bu programda da kullanılmaktadır. Bu program pratik amaçlı yapılan program ile bütünleşiktir.

        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        int deger;

        String liste = Arrays.toString(list2);
        System.out.println("Dizi : " + liste);

        System.out.print("Girilen Sayı : ");
        deger = input.nextInt();

        for (int j : list2) {
            if (j > deger) {
                if (j <= max) {
                    max = j;
                }
            }
        }

        for (int j : list2) {
            if (j < deger) {
                if (j >= min) {
                    min = j;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
