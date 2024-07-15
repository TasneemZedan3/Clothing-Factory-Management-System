/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author semoz
 */
public class CEO {
    
    String ceoName;
    String ceoNum;
    String ceoEmail;
    String ceoCompany;
    int ceoAge;
    SectionManager sm; //3shan (1-1) relationship

    public CEO() {
    }

    public CEO(String ceoName, String ceoNum, String ceoEmail, String ceoCompany, int ceoAge) {
        this.ceoName = ceoName;
        this.ceoNum = ceoNum;
        this.ceoEmail = ceoEmail;
        this.ceoCompany = ceoCompany;
        this.ceoAge = ceoAge;
    }
    public CEO(String ceoName, String ceoNum, String ceoEmail, String ceoCompany, int ceoAge, SectionManager sm) {
        this.ceoName = ceoName;
        this.ceoNum = ceoNum;
        this.ceoEmail = ceoEmail;
        this.ceoCompany = ceoCompany;
        this.ceoAge = ceoAge;
        this.sm = sm;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoNum() {
        return ceoNum;
    }

    public void setCeoNum(String ceoNum) {
        this.ceoNum = ceoNum;
    }

    public String getCeoEmail() {
        return ceoEmail;
    }

    public void setCeoEmail(String ceoEmail) {
        this.ceoEmail = ceoEmail;
    }

    public String getCeoCompany() {
        return ceoCompany;
    }

    public void setCeoCompany(String ceoCompany) {
        this.ceoCompany = ceoCompany;
    }

    public int getCeoAge() {
        return ceoAge;
    }

    public void setCeoAge(int ceoAge) {
        this.ceoAge = ceoAge;
    }

    //methods:
    protected void reviewReport() {
        sm.showReport();
    }

    protected void assignSectionManager(String Name, String PhoneNumber, String EmailAddress) {
        this.sm.mangName = Name;
        this.sm.mangNum = PhoneNumber;
        this.sm.mangEmail = EmailAddress;
    }

    public void signUp(String ceoName, String ceoNum, String ceoEmail, String ceoCompany, int ceoAge) {
        this.ceoName = ceoName;
        this.ceoNum = ceoNum;
        this.ceoEmail = ceoEmail;
        this.ceoCompany = ceoCompany;
        this.ceoAge = ceoAge;
    }
}
