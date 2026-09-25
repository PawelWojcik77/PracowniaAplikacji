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
}


