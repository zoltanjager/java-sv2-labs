package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Jhon Doe");
        client.setAddress("New York");
        client.setYear(1950);


        System.out.println("Your name: " + client.getName());
        System.out.println("Your address: " + client.getAddress());
        System.out.println("Your year of birth: " + client.getYear());

        client.migrate("London");
        System.out.println("Your address has changed: " + client.getAddress());
    }
}
