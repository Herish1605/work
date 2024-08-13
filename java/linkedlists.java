import java.util.LinkedList;
public class linkedlists {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

       
        
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add(0,  "This is the element which we have added");

       
        System.out.println(list);
    }
}
