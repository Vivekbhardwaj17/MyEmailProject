package EmailApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {



    public MainClass() {

    }
    public static void main(String[] args) throws IOException {
        Data data=new Data();
        EmailMethods methods=new EmailMethods();


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Give Deatis:\n First Name :");
            String firstName = reader.readLine().trim();
            data.setFirstName(firstName);

            System.out.print("Last Name :");
            String lastName=reader.readLine().trim();
            data.setLastName(lastName);

            System.out.print("Enter your department Code:");
            String department=reader.readLine().trim().toUpperCase();
            data.setDepartment(department);
            Boolean response=methods.setUserDetails(data.getName(),department,data);
            String Emial=methods.getEmail(data);
            if(response )
                System.out.println("Hello "+data.getName()+",\n Your Email Address :"+methods.getEmail(data)+"\n Your Password :"+methods.generateDefaultPassword(data.getDefaultPasswordLength()));
            else {
                System.out.println("Hello"+data.getName()+"Email Adress :"+methods.getEmail(data));
            }



    }







}
