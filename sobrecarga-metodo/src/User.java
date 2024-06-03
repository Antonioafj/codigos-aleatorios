public class User {

    private String firtName;
    private String lastName;

    public User(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String output(){
        return firtName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName){

        if (showLastName) {
            return output();
        }
        return firtName.toUpperCase();
        
    }
    public String toString(){
        return "User { " +
                " Firstname = " + firtName + "," + " Lastname = " + lastName + "}";
    }
 
}