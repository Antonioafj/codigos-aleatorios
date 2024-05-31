public class User {


    private boolean isLogged;
    public String firstName;
    public String lastName;
    public String fullName;
    public Adress adress;


    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void setLogged(boolean logged){
        isLogged = logged;
    }
} 