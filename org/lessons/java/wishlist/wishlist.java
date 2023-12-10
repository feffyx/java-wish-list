package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class wishlist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> listaRegali = new HashSet<>();

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il nome del regalo: ");
            String nomeRegalo = scanner.nextLine();

            if (listaRegali.contains(nomeRegalo)) {
                System.out.println("Hai già inserito questo regalo. Inserisci un regalo diverso.");
            } else {
                listaRegali.add(nomeRegalo);
                System.out.println("Regalo aggiunto alla lista.");

                // Mostra la lunghezza della lista
                System.out.println("Lunghezza della lista: " + listaRegali.size());

                // Chiedi all'utente se vuole continuare
                System.out.print("Vuoi aggiungere un altro regalo? (sì/no): ");
                String risposta = scanner.nextLine().toLowerCase();

                continua = risposta.equals("sì");
            }
        }

        // Stampa la lista finale
        System.out.println("Lista dei regali di Natale:");
        for (String regalo : listaRegali) {
            System.out.println(regalo);
        }

        // Chiudi lo scanner
        scanner.close();
    }
}
