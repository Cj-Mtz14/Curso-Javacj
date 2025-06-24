public class Functions {

    public static void Foo(Square sqFoo) {
        sqFoo.side *= 2;
        

    }

    public static void main(String[] args) {

        Square sq1 = new Square(10);
        Foo(sq1);
        System.out.println(sq1);
        
    }

}
