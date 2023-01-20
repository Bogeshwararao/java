package introduction.Linkelist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.insertLast(23);
        list.Insert(12,3);
        list.display();
        list.deleteFirst();
       System.out.println(list.deleteLast()); 
        list.display();
    }
}
