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


        //Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println("Podaj numer miesiaca:");
        int miesiac = scanner.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pazdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
        }


        //Zadanie 6
        System.out.println("Zadanie 6");
        scanner.nextLine();
        System.out.println("Podaj swoje imie:");
        String imie = scanner.nextLine();
        String mojeImie = "Pawel";
        if (mojeImie.equals(imie)) {
            System.out.println("Masz takie samo imie jak ja.");
        } else {
            System.out.println("Masz inne imie niz ja.");
        }


        //Zadanie 7
        System.out.println("Zadanie 7");
        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();
        boolean pelnoletni = wiek >= 18 ? true : false;
        System.out.println("Użytkownik jest pełnoletni? " + pelnoletni);


        //Zadanie8
        System.out.println("Zadanie 8");
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Podany rok jest rokiem przestępnym.");
        } else {
            System.out.println("Podany rok nie jest rokiem przestępnym.");
        }


        //Zadanie 9
        System.out.println("Zadanie 9");
        System.out.print("Podaj wagę w kg: ");
        double waga = scanner.nextDouble();
        System.out.print("Podaj wzrost w centymetrach: ");
        double wzrost = scanner.nextDouble();
        double bmi = waga / (wzrost * wzrost);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        } else {
            System.out.println("nadwaga");
        }













        scanner.close();

}
