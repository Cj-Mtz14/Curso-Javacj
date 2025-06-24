public class Arrays {

    public static void foo(int[] data) {

    }
    public static void main(String[] args) {
        int[] data = {1, 2, 34, 5, 89};
        int[] data2 = data;
        int [] data3 = {1, 2, 34, 5, 89};
        System.out.println(data == data2);
        System.out.println(data == data3); // false

        foo(data3);
        System.out.println(data.toString());

        
        
    }

}
