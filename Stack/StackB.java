package Stack;

public class StackB {
    static class Stack {
        static final int MAX_SIZE = 1000;
        static int[] stackArray = new int[MAX_SIZE];
        static int top = -1;

        public static boolean isEmpty() {
            return top == -1;
        }

        // push operation
        public static void push(int data) {
            if (top < MAX_SIZE - 1) {
                stackArray[++top] = data;
            } else {
                System.out.println("Stack overflow");
            }
        }

        // pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int poppedValue = stackArray[top--];
            return poppedValue;
        }

        
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            
            s.pop();
        }
        // print the stack using for loop
        for (int i = 0; i <= Stack.top; ++i) {
            System.out.println(" " + Stack.stackArray[i]);
        }
    }
}
