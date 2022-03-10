package com.Israa.Task3;

//3.a Lav en klasse, Customer, med attributterne: String firstName, String lastName, String username, int id
public class Customer
{
    String firstName;
    String lastName;
    String username;
    int id;

    // 3.b Klassen skal have en konstruktor der tager et parameter med kundens navn og brugernavn. Giv klassen en toString() metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters().

    public Customer(String firstName, String username)
    {
        this.firstName = firstName;
        this.username = username;
    }

    @Override
    public String toString()
    {
        return "Information about the customer: " + "\n" + "Name: " + firstName + "\n" + "Username: " + username + "\n";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUsername()
    {
        return username;
    }

    public int getId()
    {
        return id;
    }
}
