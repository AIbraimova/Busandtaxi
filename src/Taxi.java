import java.util.Arrays;

public class Taxi extends Car implements StopAble{


    private Person [] clients;

    public Taxi(String name, String color, int maxGuest, int price, Person[] clients) {
        super(name, color, maxGuest, price);
        this.clients = clients;
    }

    public Person[] getClients() {
        return clients;
    }

    public void setClients(Person[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }

    @Override
    public void stop() {
        for (int i = 0; i < clients.length; i++) {
        }
        if (getMaxGuest() == clients.length) {
            System.out.println("Bus is full");
        } else {
            System.out.println("Come in :)");
        }

    }
}
