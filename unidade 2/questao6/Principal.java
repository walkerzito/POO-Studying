import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        originalList.add('A');
        originalList.add('B');
        originalList.add('C');
        originalList.add('D');
        originalList.add('E');
        originalList.add('F');
        originalList.add('G');
        originalList.add('H');
        originalList.add('I');
        originalList.add('J');

        LinkedList<Character> reversLinkedList = new LinkedList<>();

        for (int i= originalList.size() - 1; i >= 0; i--){
            reversLinkedList.add(originalList.get(i));
        }

        System.out.println("Lista original");
        for(char c: originalList){
            System.out.println(c + " ");
        }
        
        System.out.println("Lista reversa");
        for(char d: reversLinkedList){
            System.out.println(d + "");
        }
    }

    }