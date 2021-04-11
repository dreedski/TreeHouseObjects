package com.treehouse.objects;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What would you like the name of your dispenser to be? ");
        String dispName = in.next();
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);

        System.out.println("We are making a new PEZ Dispenser!");
        PezDispenser dispenser = new PezDispenser(dispName);
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        if(dispenser.isEmpty()){
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with delicious PEZ...");
        dispenser.fill();
        if(!dispenser.isEmpty()){
            System.out.println("Dispenser is full.");
        }
        while(dispenser.dispense()){
            System.out.println("Chomp!");
        }
        if(dispenser.isEmpty()){
            System.out.println("Ate all the PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while(dispenser.dispense()){
            System.out.println("Chomp!!");
        }
        try {
                dispenser.fill(400);
                System.out.println("This will never happen");
            }catch (IllegalArgumentException iae){
            System.out.println("Whoa there!");
            System.out.printf("The error was: %s", iae.getMessage());
        }
    }
}
