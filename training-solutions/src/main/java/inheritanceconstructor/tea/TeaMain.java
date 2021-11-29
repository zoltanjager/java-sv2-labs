package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Zöld tea", 300);
        HerbalTea herbalTea = new HerbalTea("Borsmenta tea", 500);

        System.out.println(tea.getName());
        System.out.println(tea.getPrice());
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
        System.out.println(herbalTea.getClass());
    }
}
