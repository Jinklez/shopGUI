
/**
 * Abstract class Account - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Account
{
    // instance variables - replace the example below with your own
    private String username;
    private String password;
    
    public void setPass(String newPass){
        password = newPass;
    }
    
    public void setUser(String newName){
        username = newName;
    }
    
    public boolean checkPass(String pass){
        if(pass == password){
            return true;
        }else{
            return false;
        }
    }
     public boolean checkUser(String user){
        if(username == user){
            return true;
        }else{
            return false;
        }
    }
}
