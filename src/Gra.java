import java.util.Random;
import java.util.Scanner;

public class Gra {
    //GRA
    //1. Wylosuj x
    //2. Pobierz liczbe
    //3. Sprawdz
    //4.opcjonalnie stworzyc zautomatyzowane rozwiazanie uzywajac wyszukiwania binarnego
    public static void main(String[] args) {

        int x = getRandomInt();
        System.out.println("x = "+ x);
        Wynik(x);

    }


    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getUserValue(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        return  scan.nextInt();

    }
     public static void Wynik(int x){
         int liczba = getUserValue();


        if(x> liczba) {
            System.out.println("Liczba jest  większa");
            Wynik(x);
        }

        else if(x< liczba) {
            System.out.println("Liczba jest mniejsza");
            Wynik(x);
        }
        else
            System.out.println("Sukcess!");

     }
//        public static int wyszukiwanieBinarne(int szukanaLiczba)
//             {
//         int lewo = 0, prawo = tablicaLiczb.length - 1, srodek = 0;
//
//        while(lewo <= prawo)
//        {
//            srodek = (lewo + prawo) / 2;
//            if(tablicaLiczb[srodek] == szukanaLiczba)
//                return srodek;
//            else if(tablicaLiczb[srodek] < szukanaLiczba)
//                lewo = srodek + 1;
//            else
//                prawo = srodek - 1;
//        }
//
//        return -1; //jeżeli liczba nie została odnaleziona zwróć -1
//    }
}
