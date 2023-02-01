public class App {
    public static void main(String[] args) throws Exception {
        Calculator obj = new Calculator(10, 94);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}
