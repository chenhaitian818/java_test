package Test2022_11_27;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        UserService userService=new UserService();
        Class userServiceClass=Class.forName("Test2022_11_27.UserService");
//        Object obj=userServiceClass.newInstance();
        Method loginMethod=userServiceClass.getDeclaredMethod("userService",int.class);
        Object retValue=loginMethod.invoke(loginMethod,"no","name");
    }
}
