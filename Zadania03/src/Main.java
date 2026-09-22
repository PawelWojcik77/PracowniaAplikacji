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



}