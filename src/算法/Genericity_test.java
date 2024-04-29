package 算法;

public class Genericity_test {
    public static void main(String[] args) {
        Integer test = test(123);
        String test2 = test("你好");
        Genericity_test test3 = test(new Genericity_test());
    }

    public static <T> T test(T t) {
        return t;
    }

}
