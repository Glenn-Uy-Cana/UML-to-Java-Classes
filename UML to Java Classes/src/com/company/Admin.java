package com.company;

public class Admin {
    private String admin_name;
    private String admin_email;
    private String admin_password;

    public String getAdmin_name(){
        return this.admin_name;
    }

    public void setAdmin_name(String admin_name){
        this.admin_name = admin_name;
    }

    public String getAdmin_email(){
        return this.admin_email;
    }

    public void setAdmin_email(String admin_email){
        this.admin_email = admin_email;
    }

    public String getAdmin_password(){
        return this.admin_password;
    }

    public void setAdmin_password(String admin_password){
        this.admin_password = admin_password;
    }
}
