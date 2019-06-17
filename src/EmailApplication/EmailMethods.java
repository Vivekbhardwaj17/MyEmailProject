package EmailApplication;


import static EmailApplication.Data.ORGANISATION_NAME;

public class EmailMethods {


    private final String PASSWORD_STRING="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&";


    public String generateDefaultPassword(Integer DEFAULT_PASSWORD_LENGTH){
        char password[]=new char[DEFAULT_PASSWORD_LENGTH];
        for (Integer i = 0; i <DEFAULT_PASSWORD_LENGTH ; i++) {
           Integer index=(int)(Math.random()*PASSWORD_STRING.length());
           password[i]=PASSWORD_STRING.charAt(index);
                                                              }
        return new String(password);
                                                                           }



       public boolean setUserDetails(String name,String department,Data data){

        if(data.userMap.containsKey(name))
        return false;
        else{
            data.userMap.put(name,department);
            return true;
        }
                                                                    }

        public String getEmail(Data data){

                String Email=data.getFirstName()+"."+data.getLastName()+"_"+data.getDepartment()+"17@"+ORGANISATION_NAME+".in";
                             return Email;
                               }

         public void setNewPassword(String password,Data data){
          data.setPassword(password);
             System.out.println("Your New Password :"+password);
         }



}
