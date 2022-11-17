import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Aiperi",'F',20,"detfzghbn");
        Person person1 = new Person("Aigerim",'F',20,"edxrcftvgz");
        Person person2 = new Person("Akyl",'M',25,"ghftzg");
        Person person3 = new Person("Bakyt",'M',30,"cvgbzbu");
        Person [] persons = {person,person1,person2,person3};


        Bus bus = new Bus("Bus","white",4,15,persons);
        Taxi taxi = new Taxi("Yandex","yellow",2,250,persons);

        for (Person person4:persons){
            if(person4.getAge() >0){

             bus.stop();
            taxi.stop();
        }
        else {
                System.err.println("error");}
        }

    }
}