package extra;

import java.util.Scanner;

public class User {
    private String userName;
    private String password;

    public User(){
        this.userName = "";
        this.password = "";
    }

    public User(String name, String description){
        this.userName = name;
        this.password = description;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    @Override
    public String toString(){
        return "UserName: " + userName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();

        System.out.print("userName >> ");
        user.setUserName(scanner.nextLine());

        System.out.println(user.getUserName());
    }
}
