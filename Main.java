import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Input size of array");
        int size = scan.nextInt();
        MyArray MyArray = new MyArray(size);
        mainMenu(MyArray);
    }

    static void mainMenu(MyArray myArray){
        char option;
        do{
            System.out.println("MY ARRAY");
            System.out.println("[1] Add");
            System.out.println("[2] View");
            System.out.println("[3] Remove");
            System.out.println("[4] Search");
            System.out.println("[5] Sort");
            System.out.println("[6] Edit");
            System.out.println("[7] Exit");
    
            option = scan.next().charAt(0);
            switch(option){
                case '1':
                    addElement(myArray);
                    break;
                case '2':
                    myArray.viewArray();
                    break;
                case '3':
                    removeElement(myArray);
                    break;
                case '4':
                    searchElement(myArray);
                    break;
                case '5':
                    sortElements(myArray);
                    break;
                case '6':
                    editElements(myArray);
                    break;
                case '7':
            }
        }
        while(option != '7');
        System.out.println("Goodbye...");
    }

    //options
    static void addElement(MyArray myArray){
        if(myArray.isFull()) return;
        System.out.print("Enter number to add: ");
        int value = scan.nextInt();
        myArray.add(value);
    }

    static void removeElement(MyArray myArray){
        if(myArray.isEmpty()) return;
        System.out.println("Enter index of value to remove");
        int index = scan.nextInt();
        myArray.remove(index);
    }

    static void searchElement(MyArray myArray){
        if(myArray.isEmpty()) return;
        System.out.println("Enter value to search in array");
        int value = scan.nextInt();
        myArray.search(value);
    }

    static void sortElements(MyArray myArray){
        if(myArray.isEmpty()) return;
        System.out.println("Ascending or Descending? (a/d)");
        char option = scan.next().charAt(0);
        myArray.sort(option);
        myArray.viewArray();
    }

    static void editElements(MyArray myArray){
        if(myArray.isEmpty()) return;
        myArray.viewArray();
        System.out.print("Enter index: ");
        int index = scan.nextInt();
        System.out.print("Enter value: ");
        int value = scan.nextInt();
        myArray.edit(index, value);
    }
}