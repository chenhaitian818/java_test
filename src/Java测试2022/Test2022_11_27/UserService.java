package Test2022_11_27;

public class UserService {
    int no;
    String name;
    public UserService(int no){
        this.no=no;
    }
    public UserService(){
        this.no = 1;
        this.name = "cxh";
    }

    public UserService(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
