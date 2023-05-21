class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Elementul " + value + " a fost adăugat în vârful stivei.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stiva este goală. Nu se poate suprima vârful.");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            System.out.println("Elementul " + value + " a fost suprimat din vârful stivei.");
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stiva este goală.");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean search(int value) {
        Node current = top;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Testarea funcțiilor
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Elementul din vârful stivei: " + stack.peek());

        int searchValue = 20;
        if (stack.search(searchValue)) {
            System.out.println("Elementul " + searchValue + " se găsește în stivă.");
        } else {
            System.out.println("Elementul " + searchValue + " nu se găsește în stivă.");
        }

        stack.pop();
        stack.pop();
        System.out.println("Elementul din vârful stivei: " + stack.peek());

        searchValue = 40;
        if (stack.search(searchValue)) {
            System.out.println("Elementul " + searchValue + " se găsește în stivă.");
        } else {
            System.out.println("Elementul " + searchValue + " nu se găsește în stivă.");
        }
    }
}