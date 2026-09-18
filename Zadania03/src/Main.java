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






}