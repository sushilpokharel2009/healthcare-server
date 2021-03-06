package lk.bhanuka.models;

import javax.swing.text.html.HTMLDocument;

/**
 * Created by bhanuka on 12/9/16.
 */
public class MedicalOfficer extends User{

    private String specialization;

    public MedicalOfficer(String nic, String name, String dob, String specialization){
        super(nic,name, dob );
        this.specialization = specialization;
    }

    public MedicalOfficer(String nic, String name, String dob){
        this(nic, name, dob, "General");
    }

    public void setSpecialization(String specialization){

        this.specialization = specialization;

    }

    public String getSpecialization(){
        return this.specialization;
    }


    public String getRole() {
        return "medical_officer";
    }

    public int getAccessLevel() {
        return 5;
    }
}
