import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("enter the String you want to add:");

        String m = sc.nextLine();

        System.out.println("enter the position at which you want to add an element:");

        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<String>();

        list.add("one");

        list.add("two");

        list.add("three");

        list.add("four");

        list.add("five");
        

        list.add(n, m);

        System.out.println(list);

    }
}
