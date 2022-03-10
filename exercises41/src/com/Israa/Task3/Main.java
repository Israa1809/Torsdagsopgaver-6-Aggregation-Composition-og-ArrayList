package com.Israa.Task3;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args)
    {
        /*3.c Skriv en Main klasse med en main metode, hvor der oprettes en beholder af typen ArrayList, som du kalder 'customers'.
         Denne skal være erklæret som static global variabel - dvs tilgængelig udenfor main metoden. I customers skal du placere 6 instanser af Customer typen. (Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)
         */
        customers.add(new Customer("Israa", "Israa123"));
        customers.add(new Customer("Asiya", "Asiya123"));
        customers.add(new Customer("Yusef", "Yusef123"));
        customers.add(new Customer("Yasin", "Yasin123"));
        customers.add(new Customer("Firat", "Firat123"));
        customers.add(new Customer("Bob", "Bob123"));

        printCustomers();
    }

    //3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop. Test metoden fra main ved at kalde den.
    public static void printCustomers()
    {
        for (Customer a : customers)
        {
            System.out.println(a);
        }
    }
}

/*
Brug eventuel overskydende tid til at færdiggøre dokumentation af Matadorprojektet så det helt afspejler koden som den ser ud lige nu. Herefter henviser vi til træningsøvelser under "Ekstra materiale" inde på Moodle.
 */


