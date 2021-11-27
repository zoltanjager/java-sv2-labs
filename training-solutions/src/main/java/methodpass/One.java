package methodpass;

public class One {

    public static void main(String[] args) {
        int number = 2;
        System.out.println(number);
        number += 1;
        System.out.println(number);

        System.out.println(addOne(number));
        System.out.println(number);
    }

    public static int addOne(int number){
        return number +=1;
    }

}
