package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();

        for (Person actual : people) {
            if (actual.getAge() >= 18 && actual.getAge() <= 65)
                result.add(actual.getAge());
        }
        return result;
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Kis Béla", 13));
        people.add(new Person("Tóth Ottó", 22));
        people.add(new Person("Nagy József", 65));
        people.add(new Person("Kovács Géza", 18));
        people.add(new Person("Kis Péter", 77));
        people.add(new Person("Nagy Péter", 50));
        people.add(new Person("Nagy Zsolt", 80));

        Vaccination vaccination = new Vaccination();
        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(people);

        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder);


    }
}
