package edu.andreluiz.anatomiaclasses;

public class MyClass {
    public static void main(String[] args) {
        // Variables
        String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;
        String firstName = "André Luiz";
        String lastName = "Gomes Pereira";
        boolean isMan = true;

        // Use method fullName
        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
    }

    // Methods
    public static String fullName(String firstName, String lastName) {
        return "Olá, me chamo " + firstName.concat(" ").concat(lastName);
    }
}
