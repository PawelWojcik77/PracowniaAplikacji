import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("Podaj liczbe:");
        int liczba = scanner.nextInt();
        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }


        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println("Podaj pierwszy bok:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugi bok:");
        int b = scanner.nextInt();
        System.out.println("Podaj trzeci bok:");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Mozna zbudowac trojkat.");
        } else {
            System.out.println("Nie mozna zbudowac trojkata.");
        }



        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println("Podaj pierwsza liczbe:");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe:");
        int liczba2 = scanner.nextInt();
        if (liczba1 > liczba2) {
            System.out.println("Najwieksza liczba to: " + liczba1);
        } else {
            System.out.println("Najwieksza liczba to: " + liczba2);
        }



        // Zadanie 4
        System.out.println("Zadanie 4");
        System.out.println("Podaj pierwsza liczbe:");
        int liczba3 = scanner.nextInt();
        System.out.println("Podaj druga liczbe:");
        int liczba4 = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe:");
        int liczba5 = scanner.nextInt();
        int najwieksza = liczba3;
        if (liczba4 > najwieksza) {
            najwieksza = liczba4;
        }
        if (liczba5 > najwieksza) {
            najwieksza = liczba5;
        }
        System.out.println("Najwieksza liczba to: " + najwieksza);





        scanner.close();

}
