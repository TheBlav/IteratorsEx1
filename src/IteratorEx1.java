import java.util.*;

public class IteratorEx1 {

    public static void main(String[] args) {
        Map<String, Person> personMap = new TreeMap<>();
        Person person1 = new Person("Anna", "Musiał", 34);
        Person person2 = new Person("Grzegorz", "Dolążek", 25);
        Person person3 = new Person("Mateusz", "Romanowski", 42);
        Person person4 = new Person("Barbara", "Bananowa", 27);
        Person person5 = new Person("Agnieszka", "Alfons", 18);

        personMap.put(person1.getLastName(), person1);
        personMap.put(person2.getLastName(), person2);
        personMap.put(person3.getLastName(), person3);
        personMap.put(person4.getLastName(), person4);
        personMap.put(person5.getLastName(), person5);

        Collection<Person> people = personMap.values();
        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());()
        }

    }
}