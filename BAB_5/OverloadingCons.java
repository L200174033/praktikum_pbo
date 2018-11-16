
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-RPL
 */
public class OverloadingCons {
    int idUser, level;
    String userName;
    Date lastLogin;
    
    public OverloadingCons(){
        
    }
    
    public OverloadingCons(int iduser, String userName){
        this.idUser = iduser;
        this.userName = userName;
        System.out.println(
                "ID User: "+this.idUser+"\n"+
                "Username: "+this.userName+"\n");
    }
    
    public OverloadingCons(int iduser, int level){
        this.idUser = iduser;
        this.level = level;
        System.out.println(
                "ID User: "+this.idUser+"\n"+
                "Level: "+this.level+"\n");
    }
    
    public OverloadingCons(int iduser, Date lastlogin){
        this.idUser = iduser;
        this.lastLogin = lastlogin;
        System.out.println(
                "ID User: "+this.idUser+"\n"+
                "Last login: "+this.lastLogin+"\n");
    }
    public OverloadingCons(int iduser, String userName, int level, Date lastlogin){
        this.idUser = iduser;
        this.userName = userName;
        this.level = level;
        this.lastLogin = lastlogin;
        System.out.println(
                "ID User: "+this.idUser+"\n"+
                "Username: "+this.userName+"\n"+
                "Level: "+this.level+"\n"+
                "Last login: "+this.lastLogin+"\n");
    }
}
