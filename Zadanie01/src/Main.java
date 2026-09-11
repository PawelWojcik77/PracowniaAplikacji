import java.util.Scanner;

void main() {
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    String imie = "Paweł";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    System.out.println("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

    double stopnie;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj temperaturę w stopniach Celsjusza:");
    stopnie = scanner.nextDouble();
    double fahrenheit = 1.8 * stopnie + 32.0;
    System.out.println("Temperatura w stopniach Fahrenheita: " + fahrenheit);


    System.out.println("Podaj pierwszy bok trójkąta:");
    double a = scanner.nextDouble();
    System.out.println("Podaj drugi bok trójkąta:");
    double b = scanner.nextDouble();
    System.out.println("Podaj trzeci bok trójkąta:");
    double c = scanner.nextDouble();
    double obwod = a + b + c;
    System.out.println("Obwód trójkąta wynosi: " + obwod);

}
