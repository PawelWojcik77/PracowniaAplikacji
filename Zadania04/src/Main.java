//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Zadanie1");

    int[] tablica1 = {1, 2, 3, 4, 5, 6};
    int[] tablica2 = {10, 20, 30, 40, 50};

    System.out.println("Pierwsza tablica:");
    for (int i = 0; i < tablica1.length; i += 2) {
        System.out.println(tablica1[i]);
    }
    System.out.println("Druga tablica:");
    for (int i = 0; i < tablica2.length; i += 2) {
        System.out.println(tablica2[i]);
    }
    System.out.println();


    //Zadanie2
    System.out.println("Zadanie2");
    int[] tablica = {2, 5, 1, 37, 8, 15};
    int najwieksza = tablica[0];
    for (int i = 1; i < tablica.length; i++) {
        if (tablica[i] > najwieksza) {
            najwieksza = tablica[i];
        }
    }
    System.out.println("Najwieksza liczba: " + najwieksza);
    System.out.println();


    //Zadanie3
    System.out.println("zadanie3");
    String[] tablica3 = {"kot", "pies", "słoń"};
    for (String slowo : tablica3) {
        System.out.println(slowo.toUpperCase());
    }
    System.out.println();


    //Zadanie4
    System.out.println("Zadanie4");
    Scanner scanner = new Scanner(System.in);
    String[] slowa = new String[5];
    for (int i = 0; i < slowa.length; i++) {
        System.out.println("Podaj slowo:");
        slowa[i] = scanner.nextLine();
    }
    System.out.println("Slowa od konca:");
    for (int i = slowa.length - 1; i >= 0; i--) {
        String slowo = slowa[i];
        for (int j = slowo.length() - 1; j >= 0; j--) {
            System.out.print(slowo.charAt(j));
        }
        System.out.println();
    }
    System.out.println();


}













