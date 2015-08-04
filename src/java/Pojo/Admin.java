/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author EDU
 */
public class Admin {
    private int AdminId;
    private String AdminName;
    private String AdminSurname;
    private String Username;
    private String Password;
    private String ConfirmPassword;

    /**
     * @return the AdminId 
     */
    public int getAdminId() {
        return AdminId;
    }

    /**
     * @param AdminId the AdminId to set
     */
    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    /**
     * @return the AdminName
     */
    public String getAdminName() {
        return AdminName;
    }

    /**
     * @param AdminName the AdminName to set
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * @return the AdminSurname
     */
    public String getAdminSurname() {
        return AdminSurname;
    }

    /**
     * @param AdminSurname the AdminSurname to set
     */
    public void setAdminSurname(String AdminSurname) {
        this.AdminSurname = AdminSurname;
    }

    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

       public void setConfirmPassword(String confirm) {
        this.ConfirmPassword = confirm;
    }
        public String getUsername() {
        return Username;
    }

       public void setUsername(String username) {
        this.Username = username;
    }
}
