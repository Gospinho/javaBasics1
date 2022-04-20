import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        /*1*/ int x=3;
//        /*2*/ int y;
//        /*3*/ System.out.println(x++); //4
//        /*4*/ System.out.println(++x); // 5
//        /*5*/ System.out.println(x); // 5
//        /*6*/ y = x++;
//        /*7*/ System.out.println (y); // 5
//        /*8*/ y = ++x;
//        /*9*/ System.out.println (y); // 7
//        /*10*/ System.out.println (++y); // 8


        int[] tabelaCyfr = new int[5];
        tabelaCyfr = new int[]{0, 1, 2, 3, 4};
//        System.out.println(tabelaCyfr[2]);
        String[] tablicaPieskow = new String[4];
        tablicaPieskow = new String[]{"Dino", "Kudłaty", "Azorek", "Dyndol"};
//        System.out.println(tablicaPieskow[2]);
        // PĘTLA FOR

        for (int i = 0; i < tablicaPieskow.length; i++){
            System.out.println(tablicaPieskow[i]);
        }

    }
}
