public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    // Constructor
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
            // Option 3: Increase capacity dynamically
            int newCapacity = contents.length * 2;
            int[] newContents = new int[newCapacity];
            System.arraycopy(contents, 0, newContents, 0, contents.length);
            contents = newContents;
        }
        contents[++tos] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}