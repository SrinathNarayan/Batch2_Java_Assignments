package Assignmnets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
	private static Pattern usrNamePtrn = Pattern.compile("^[a-z0-9_-]{6,14}$");
    
    public static boolean validateUserName(String userName){
         
        Matcher mtch = usrNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
    	System.out.println("--------------------------------------");
        System.out.println("Is 'Robot123' a valid user name? "
                        +validateUserName("Robot123"));
        System.out.println("--------------------------------------");
        System.out.println("Is 'cric' a valid user name? "
                        +validateUserName("cric"));
        System.out.println("--------------------------------------");
        System.out.println("Is 'MYLAPTOP' a valid user name? "
                        +validateUserName("MYLAPTOP"));
        System.out.println("--------------------------------------");
        System.out.println("Is 'new.2.user' a valid user name? "
                        +validateUserName("new.2.user"));
        System.out.println("--------------------------------------");
        System.out.println("Is 'only_2-user' a valid user name? "
                        +validateUserName("only_2-user"));
        System.out.println("--------------------------------------");
    }
}
