package _11_dsa_stack_queue.thuc_hanh;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();

        myGenericStack.push("Five");
        myGenericStack.push("Four");
        myGenericStack.push("Three");
        myGenericStack.push("Two");
        myGenericStack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2. Pop elements from stack : ");

        System.out.println(myGenericStack.pop());
        System.out.println(myGenericStack.pop());
        System.out.println("\n1.3. Size of stack after pop operations : " + myGenericStack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
