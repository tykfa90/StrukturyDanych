public class Runner {

    public static void main(String[] args) throws EmptyStackEx {
        IntStack myStack = new IntStack(5);

        System.out.println(myStack.isEmpty());

        myStack.push(2);
        myStack.push(2);
        myStack.push(5);
        myStack.push(6);
        myStack.push(9);

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        myStack.peek();

        System.out.println(myStack.isEmpty());

        myStack.push(0);
        System.out.println(myStack);

        System.out.println(myStack.isFull());
    }
}
