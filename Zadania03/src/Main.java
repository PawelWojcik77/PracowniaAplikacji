//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.print("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int i = 1;
        while (i <= liczba) {
            System.out.println(i);
            i = i + 2;

    }

        //zadanie 2
        System.out.println("Zadanie 2");
        System.out.print("Podaj liczbe: ");
        liczba = scanner.nextInt();
        int potega = 1;
        while (potega <= liczba) {
            System.out.println(potega);
            potega = potega * 2;
    }

        //Zadanie3
        System.out.println("Zadanie 3");
        int suma = 0;
        System.out.print("Podaj liczbe: ");
        liczba = scanner.nextInt();
        while (liczba != 0) {
        suma = suma + liczba;
        System.out.print("Podaj liczbe: ");
        liczba = scanner.nextInt();
    }
    System.out.println("Suma: " + suma);



        //Zadanie4
    System.out.println("Zadanie 4");

    int liczba4;
    int suma4 = 0;
    int ilosc4 = 0;
    int najmniejsza4 = 0;
    int najwieksza4 = 0;

    System.out.println("Podawaj liczby całkowite.");
    System.out.println("Podaj 0, aby zakończyć.");

    System.out.print("Podaj liczbę: ");
    liczba4 = scanner.nextInt();

    while (liczba4 != 0) {

        if (ilosc4 == 0) {
            najmniejsza4 = liczba4;
            najwieksza4 = liczba4;
        }

        if (liczba4 < najmniejsza4) {
            najmniejsza4 = liczba4;
        }

        if (liczba4 > najwieksza4) {
            najwieksza4 = liczba4;
        }

        suma4 = suma4 + liczba4;
        ilosc4 = ilosc4 + 1;

        System.out.print("Podaj liczbę: ");
        liczba4 = scanner.nextInt();
    }

    if (ilosc4 > 0) {

        int sumaMinMax4 = najmniejsza4 + najwieksza4;
        double srednia4 = (double) suma4 / ilosc4;

        System.out.println("Najmniejsza liczba: " + najmniejsza4);
        System.out.println("Największa liczba: " + najwieksza4);
        System.out.println("Suma najmniejszej i największej: " + sumaMinMax4);
        System.out.println("Średnia arytmetyczna: " + srednia4);

    } else {

        System.out.println("Nie podano żadnych liczb.");
    }

    //Zadanie5
    System.out.println("Zadanie 5");
    int wylosowana5 = (int) (Math.random() * 100) + 1;
    int podana5;
    System.out.println("Zgadnij liczbę od 1 do 100.");
    podana5 = scanner.nextInt();
    while (podana5 != wylosowana5) {
        if (podana5 > wylosowana5) {
            System.out.println("Podałeś za dużą wartość");
        }
        if (podana5 < wylosowana5) {
            System.out.println("Podałeś za małą wartość");
        }
        podana5 = scanner.nextInt();
    }
    System.out.println("Gratulacje");


    //Zadanie6
    System.out.println("Zadanie 6");

    System.out.print("Podaj znak wypełnienia: ");
    char znak6 = scanner.next().charAt(0);

    System.out.print("Podaj x: ");
    int x6 = scanner.nextInt();

    System.out.print("Podaj y: ");
    int y6 = scanner.nextInt();

    System.out.print("Podaj długość a: ");
    int a6 = scanner.nextInt();

    System.out.print("Podaj długość b: ");
    int b6 = scanner.nextInt();


    for (int wiersz6 = 1; wiersz6 < y6; wiersz6++) {
        System.out.println();
    }


    for (int wiersz6 = 1; wiersz6 <= b6; wiersz6++) {


        for (int spacja6 = 1; spacja6 < x6; spacja6++) {
            System.out.print(" ");
        }


        for (int znakWiersz6 = 1; znakWiersz6 <= a6; znakWiersz6++) {
            System.out.print(znak6);
        }

        System.out.println();
    }



    //Zadanie7
    System.out.println("Zadanie 7");
    System.out.print("Podaj wysokość choinki: ");
    int wysokosc7 = scanner.nextInt();
    for (int wiersz7 = 1; wiersz7 <= wysokosc7; wiersz7++) {
        for (int spacja7 = 1; spacja7 <= wysokosc7 - wiersz7; spacja7++) {
            System.out.print(" ");
        }
        for (int gwiazdka7 = 1; gwiazdka7 <= 2 * wiersz7 - 1; gwiazdka7++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //zadanie8
    System.out.println("Zadanie 8");
    System.out.print("Podaj liczbę: ");
    int liczba8 = scanner.nextInt();
    int silnia8 = 1;
    for (int i8 = 1; i8 <= liczba8; i8++) {
        silnia8 = silnia8 * i8;
    }
    System.out.println("Silnia: " + silnia8);


    //Zadanie9
    System.out.println("Zadanie 9");
    System.out.print("Podaj słowo: ");
    String slowo9 = scanner.next();
    boolean palindrom9 = true;
    for (int i9 = 0; i9 < slowo9.length() / 2; i9++) {
        if (slowo9.charAt(i9) != slowo9.charAt(slowo9.length() - 1 - i9)) {
            palindrom9 = false;
        }
    }
    if (palindrom9) {
        System.out.println("Podane słowo jest palindromem.");
    } else {
        System.out.println("Podane słowo nie jest palindromem.");
    }



    //Zadanie10
    System.out.println("Zadanie 10");
    petlaGlowna10:
    for (int i10 = 1; i10 <= 10; i10++) {
        if (i10 % 2 != 0) {
            continue;
        }
        for (int j10 = 1; j10 <= 10; j10++) {
            System.out.println(j10);
            if (j10 > i10) {
                continue petlaGlowna10;
            }
        }
    }




}