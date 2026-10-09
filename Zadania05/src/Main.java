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


    //Zadanie 8
    System.out.println("Zadanie 8:");
    System.out.println(czyTrojkatProstokatny(3, 4, 5));


    //Zadanie 9
    System.out.println("Zadanie 9:");
    System.out.println(ostatniZnak("Witaj"));


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



static boolean czyTrojkatProstokatny(double a, double b, double c) {

    if (a >= b && a >= c) {
        return a * a == b * b + c * c;
    }

    if (b >= a && b >= c) {
        return b * b == a * a + c * c;
    }

    return c * c == a * a + b * b;
}


static char ostatniZnak(String tekst) {
    return tekst.charAt(tekst.length() - 1);
}




