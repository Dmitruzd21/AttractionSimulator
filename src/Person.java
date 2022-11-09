public class Person {

    protected String name;
    protected String surname;
    protected int numberOfTickets;

    public Person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}
