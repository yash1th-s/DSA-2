package ArrayList;
import java.util.*;

public class ALOprations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("----------MENU--------------\n1.add\n2.get\n3.remove\n4.set\n5.check\n6.exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the element to be added:");
                int x = sc.nextInt();
                list.add(x);
                System.out.println(list);
                break;

                case 2:System.out.println("Enter the element to find index:");
                x = sc.nextInt();
                int elt = list.get(x);
                System.out.println("Element at index:"+elt);
                break;

                case 3:System.out.println("Enter the index of element to be removed:");
                x = sc.nextInt();
                list.remove(x);
                System.out.println(list);
                break;

                case 4:System.out.println("Enter the index and element:");
                int id = sc.nextInt();
                x = sc.nextInt();
                list.set(id, x);
                System.out.println(list);
                break;

                case 5:System.out.println("Enter the element:");
                x = sc.nextInt();
                System.out.println(list.contains(x));
                break;

                case 6:System.exit(0);
            }
            sc.close();
        }
        
    }
    
}
