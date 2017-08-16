public class VerifyStack {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//        for (int i=0; i<10; i++)
//            stack.push(i);
//        for (int i=0; i<10; i++)
//            System.out.println(stack.pop());
        Evaluator evaluator = new Evaluator();
        String expression = "2 3 +";
        System.out.println(evaluator.evaluate(expression));
    }
}
