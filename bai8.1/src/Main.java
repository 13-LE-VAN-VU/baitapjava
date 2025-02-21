public static void Main(String[] args) {
    MyIntStack stack = new MyIntStack(3);
    System.out.println(stack.push(1));
    System.out.println(stack.push(2));
    System.out.println(stack.push(3));
    System.out.println(stack.push(4));
    System.out.println(stack.peek());
    while (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
}