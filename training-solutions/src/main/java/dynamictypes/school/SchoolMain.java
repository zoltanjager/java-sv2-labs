package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {

        School school = new School("Iskola", 12);
        School primarySchool = new PrimarySchool("általános iskola", 8);
        School secondarySchool = new SecondarySchool("Középiskola", 4);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
