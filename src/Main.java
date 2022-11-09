import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueToAttraction = new LinkedList<>(generateClients());
        while (!queueToAttraction.isEmpty()) {
            Person person = queueToAttraction.poll();
            String personName = person.getName();
            String personSurname = person.getSurname();
            int ticketsNumberOfPerson = person.getNumberOfTickets();
            if (ticketsNumberOfPerson > 0) {
                System.out.println( personName + " " + personSurname + " прокатился на аттракционе.");
                person.setNumberOfTickets(ticketsNumberOfPerson - 1);
                queueToAttraction.offer(person);
            }
        }
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
