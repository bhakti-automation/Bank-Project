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
public class IndividualCustomer extends Customer{
    
    private int ssn;
    
    

    public IndividualCustomer(int ssn, int id, String name) {
        super(id, name);
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" + "ssn=" + ssn + ""+super.toString()+ '}';
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    
}
