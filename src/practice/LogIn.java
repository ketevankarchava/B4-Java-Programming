package practice;

public class LogIn {

    public static void main(String[] args) {
        Credentials obj = new Credentials();
        System.out.println(obj.getUsername());
        System.out.println(obj.password);
    }
    }

    class Credentials{
    private String username = "admin";
    private String password = "<PASSWORD>";

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
    }
