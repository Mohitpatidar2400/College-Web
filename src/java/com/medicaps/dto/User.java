
package com.medicaps.dto;


public class User {
    
    private int userId;
    private String name;
    private String mail;
    private String phone;
    private String password;
    private int type;
    private int branch;
    private int otp;
    private int isVerify;
    
    

    public User(String name, String email, String password, int type, int branch) {
        this.name = name;
        this.mail = email;
        this.password = password;
        this.type = type;
        this.branch = branch;
    }

    public User(int userId, String name, String mail, String phone, int type, int branch, int isVerify) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.type = type;
        this.branch = branch;
        this.isVerify = isVerify;
    }

    public User(int userId, String name, String mail, String phone, int branch) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.branch = branch;
    }

    public User(int userId, String name, String mail, String phone) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public User(String name, String mail, String password, int type, int branch, int otp) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.type = type;
        this.branch = branch;
        this.otp = otp;
    }

  

    

    

    public int getUserId() {
        return userId;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }

    public int getBranch() {
        return branch;
    }

    public int getOtp() {
        return otp;
    }

    public int getIsVerify() {
        return isVerify;
    }
    
    
    public String getName()
    {
    return name;
    
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        //System.out.println("maillllll"+mail);
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public void setIsVerify(int isVerify) {
        this.isVerify = isVerify;
    }
    
    
}
