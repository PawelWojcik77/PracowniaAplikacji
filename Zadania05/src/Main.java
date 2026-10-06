void main() {

    //Zadanie1
    System.out.println("Zadanie 1:");
    System.out.println(mojWiek());

    // Zadanie2
    System.out.println("Zadanie 2:");
    System.out.println(mojeImie());

    //Zadanie 3
    System.out.println("Zadanie 3:");
    obliczenia(10, 5);

    //Zadanie 4
    System.out.println("Zadanie 4:");
    System.out.println(czyParzysta(8));

    //Zadanie 5
    System.out.println("Zadanie 5:");
    System.out.println(czyPodzielnaPrzez3i5(15));


    //Zadanie 6
    System.out.println("Zadanie 6:");
    System.out.println(potegaTrzecia(3));


    //Zadanie 7
    System.out.println("Zadanie 7:");
    System.out.println(pierwiastek(25));


}

int mojWiek() {
    return 19;
}


String mojeImie() {
    return "Paweł";
}


void obliczenia(int liczba1, int liczba2) {
    System.out.println("Suma: " + (liczba1 + liczba2));
    System.out.println("Roznica: " + (liczba1 - liczba2));
    System.out.println("Iloczyn: " + (liczba1 * liczba2));
}



    static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }



    static boolean czyPodzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

static double potegaTrzecia(double liczba) {
    return liczba * liczba * liczba;
}


static double pierwiastek(double liczba) {
    return Math.sqrt(liczba);
}


