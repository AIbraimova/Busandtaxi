import java.util.Arrays;
import java.util.Scanner;

public class Bus extends Car implements StopAble {

    private Person[] people;

    public Bus(String name, String color, int maxGuest, int price, Person[] people) {
        super(name, color, maxGuest, price);
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "people=" + Arrays.toString(people) +
                '}';
    }

    @Override
    public void stop() {

        for (int i = 0; i < people.length; i++) {
        }
            if (getMaxGuest() == people.length) {
                System.out.println("Bus is full!");
            } else {
                System.out.println("Come in :)");
            }


        }

    }
