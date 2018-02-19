package ooplab9;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("Aorn", "0043",
                new Address("84/1","Nakhonsithammarat","80000"),
                new Job("IT", "25000"));

        System.out.println(person.toString());

        person.getJob().setSalary("30000");

        System.out.println(person.toString());
    }

}
