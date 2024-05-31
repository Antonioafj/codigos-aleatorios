public class User {


    private boolean isLogged;
    private String firstName;
    private String lastName;
    private String fullName;
    private Adress adress;


    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void setLogged(boolean logged){
        isLogged = logged;
    }
} 