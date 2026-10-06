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