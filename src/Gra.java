import java.util.Random;

public class Gra {
    //GRA
    //1. Wylosuj x
    //2. Pobierz liczbe
    //3. Sprawdz
    //4.opcjonalnie stworzyc zautomatyzowane rozwiazanie uzywajac wyszukiwania binarnego
    public static void main(String[] args) {
    int x = getRandomInt();
    Wynik(x);


    }


    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getUserValue(){

    }
     public static Integer Wynik(int x){
         int liczba = getUserValue();
        if (x == liczba)
            System.out.println("Sukcess!");

        if(x> liczba)
            System.out.println("Liczba jest  mniejsza");

        if(x< liczba)
            System.out.println("Liczba jest większa");

     }
    public static int wyszukiwanieBinarne(int szukanaLiczba)
    {
        int lewo = 0, prawo = tablicaLiczb.length - 1, srodek = 0;

        while(lewo <= prawo)
        {
            srodek = (lewo + prawo) / 2;
            if(tablicaLiczb[srodek] == szukanaLiczba)
                return srodek;
            else if(tablicaLiczb[srodek] < szukanaLiczba)
                lewo = srodek + 1;
            else
                prawo = srodek - 1;
        }

        return -1; //jeżeli liczba nie została odnaleziona zwróć -1
    }
}
