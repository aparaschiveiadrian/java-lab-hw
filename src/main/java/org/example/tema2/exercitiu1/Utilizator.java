package org.example.tema2.exercitiu1;

public class Utilizator {
    private final String firstName;
    private final String lastName;

    public Utilizator(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

}
