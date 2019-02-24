public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int delta =0;
        delta= Delta(2,2,2);
        String wynik = Sprawdz(delta);
        System.out.println(wynik);

    }

    public static int Delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static String Sprawdz(int delta) {
        String result = "";
        if (delta == 0)
            result = "jedno miejscce";

        if (delta > 0)
            result = "dwa miejsca";

        if (delta < 0)
            result = "brak miejsc zerowych";

        return result;
    }
 // skrot listowania ctrl+alt+l

}
/*
alternatywa metody Algorytmu Sprawdz:
if(delta,0)
result = "brak miejsc zerowych";
else if(delta>0)
result = "dwa miejsca";
else
result = "jedno miejscce";

 */
