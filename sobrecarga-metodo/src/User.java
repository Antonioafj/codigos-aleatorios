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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firtName == null) ? 0 : firtName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (firtName == null) {
            if (other.firtName != null)
                return false;
        } else if (!firtName.equals(other.firtName))
            return false;
        return true;
    }

    
}