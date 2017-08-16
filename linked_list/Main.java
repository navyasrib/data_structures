public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        for (int i=0; i<list.getLength(); i++) {
            System.out.println(list.findAt(i));
        }
    }
}