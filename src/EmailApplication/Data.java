package EmailApplication;

import java.util.HashMap;

public class Data {
    private String firstName;
    private String lastName;
    private String department;
    public static final String ORGANISATION_NAME = "gla.ac";
    private String password;
    private final Integer MAIL_CAPACITY = 10000;
    private final Integer DEFAULT_PASSWORD_LENGTH = 8;
 public static  HashMap<String,String > userMap=new HashMap<>();


 public Data(){

              }


    public String getName() {
        return firstName+" "+lastName;
                             }



    public  Integer getMailCapacity() {
        return MAIL_CAPACITY;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setPassword(String password) {
        this.password = password;            }

    public  Integer getDefaultPasswordLength() {
        return DEFAULT_PASSWORD_LENGTH;
    }
}
