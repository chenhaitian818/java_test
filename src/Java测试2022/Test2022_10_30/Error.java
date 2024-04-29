package Test2022_10_30;

public class Error extends Exception {
    //异常信息
    private String message;

    public Error() {
    }

    //构造函数
    public Error(String message) {
        super(message);
        this.message = message;
    }
}