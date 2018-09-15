public class IntStack {
    private int top;
    private int[] stack;

    public IntStack(int size) {
        this.top = -1;
        this.stack = new int[size];
    }

    public boolean push(int el) {
        if (top != stack.length - 1) {
            top++;
            stack[top] = el;
            return true;
        }
        return false;
    }

    public int pop() throws EmptyStackEx {
        if (top != -1) {
            int el = stack[top];
            top--;
            return el;
        }
        throw new EmptyStackEx();
    }

    public int peek() throws EmptyStackEx {
        if (top != -1) {
            return top;
        }
        throw new EmptyStackEx();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i <= top; i++) {
            s+= stack[i] + " ";
        }
        return s;
    }
}
