class LinkedList {
    private int[] listArray;
    private int size;

    public LinkedList(int capacity) {
        listArray = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == listArray.length) {
            System.out.println("Lista este plină. Nu se poate insera elementul " + value + ".");
        } else {
            listArray[size] = value;
            size++;
            System.out.println("Elementul " + value + " a fost inserat în listă.");
        }
    }

    public boolean search(int value) {
        for (int i = 0; i < size; i++) {
            if (listArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Lista este goală.");
        } else {
            System.out.print("Elementele listei sunt: ");
            for (int i = 0; i < size; i++) {
                System.out.print(listArray[i] + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);

        // Testarea funcțiilor
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        int searchValue = 20;
        if (list.search(searchValue)) {
            System.out.println("Elementul " + searchValue + " se găsește în listă.");
        } else {
            System.out.println("Elementul " + searchValue + " nu se găsește în listă.");
        }

        searchValue = 40;
        if (list.search(searchValue)) {
            System.out.println("Elementul " + searchValue + " se găsește în listă.");
        } else {
            System.out.println("Elementul " + searchValue + " nu se găsește în listă.");
        }
    }
}