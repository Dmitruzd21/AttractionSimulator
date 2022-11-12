import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueToAttraction = new LinkedList<>(generateClients());
        while (!queueToAttraction.isEmpty()) {
            Person person = queueToAttraction.poll();
            String personName = person.getName();
            String personSurname = person.getSurname();
            int ticketsNumberOfPersonBeforeRiding = person.getNumberOfTickets();
            if (ticketsNumberOfPersonBeforeRiding > 0) {
                rideTheAttraction(personName, personSurname);
                person.setNumberOfTickets(ticketsNumberOfPersonBeforeRiding - 1);
            }
            int ticketsNumberOfPersonAfterRiding = person.getNumberOfTickets();
            if (ticketsNumberOfPersonAfterRiding > 0) {
                queueToAttraction.offer(person);
            }
        }
    }

    public static void rideTheAttraction(String personName, String personSurname) {
        System.out.println( personName + " " + personSurname + " прокатился на аттракционе.");
    }

    public static List<Person> generateClients() {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Nikita","Krasnogorskii",5));
        listOfPersons.add(new Person("Alex","Sitkovich",4));
        listOfPersons.add(new Person("Ludmila","Pushkina",1));
        listOfPersons.add(new Person("Bob","Leinardov",3));
        listOfPersons.add(new Person("Ann","Ivanova",2));
        return listOfPersons;
    }
}
