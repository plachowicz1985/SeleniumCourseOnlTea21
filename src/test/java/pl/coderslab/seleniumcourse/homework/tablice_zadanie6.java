package pl.coderslab.seleniumcourse.homework;

import java.util.Arrays;
import java.util.Random;

public class tablice_zadanie6 {

    public static void main(String[] args) {
       //Tablica z First name
        String[] tableName = new String[10];
        tableName[0] = "Kurt";
        tableName[1] = "Brian";
        tableName[2] = "Jimi";
        tableName[3] = "Amy";
        tableName[4] = "Janis";
        tableName[5] = "Jacob";
        tableName[6] = "Jim";
        tableName[7] = "John";
        tableName[8] = "Dave";
        tableName[9] = "Jeremy Michael";

        Random rName = new Random();
        int randomName = rName.nextInt(tableName.length);
        System.out.println(tableName[randomName]);



        //Tablica z last name
        String[] tableLastName = new String[10];
        tableLastName[0] = "Cobain";
        tableLastName[1] = "Jones";
        tableLastName[2] = "Hendrix";
        tableLastName[3] = "Winehouse";
        tableLastName[4] = "Joplin";
        tableLastName[5] = "Miller";
        tableLastName[6] = "Morrison";
        tableLastName[7] = "Lennon";
        tableLastName[8] = "Alexander";
        tableLastName[9] = "Ward";

        Random rLastName = new Random();
        int randomLastName = rLastName.nextInt(tableLastName.length);
        System.out.println(tableLastName[randomLastName]);

        //losowe liczby do email
        Random liczba = new Random();
        int los = liczba.nextInt();
        System.out.println(los);

        //Email


        //System.out.println(tableName[randomName]+"."+tableLastName[randomLastName]+los+"@"+tableName[randomName]+tableLastName[randomLastName]+".pl");

        //static String email = tableName[randomName]+"."+tableLastName[randomLastName]+los+"@"+tableName[randomName]+tableLastName[randomLastName]+".pl";
        //System.out.println(email);
    }



}