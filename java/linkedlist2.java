import java.util.LinkedList;
public class linkedlist2 {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.add("one");

        list.add("two");

        list.add("three");

        list.add("four");

        list.add("five");

        list.add(5, "this is the element we have added to the last.");
        System.out.println(list);
    }
}
