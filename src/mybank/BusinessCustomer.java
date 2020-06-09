/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;

/**
 *
 * @author virad
 */
public class BusinessCustomer extends Customer{
    private String email;

    public BusinessCustomer(String email, int id, String name) {
        super(id, name);
        this.email = email;
    }

    @Override
    public String toString() {
        return "BusinessCustomer{" + "email=" + email +""+super.toString()+ '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    
    
    
}
