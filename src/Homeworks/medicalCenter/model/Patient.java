package Homeworks.medicalCenter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Patient extends Person{

    private Doctor doctor;
    private Date dateOfRegistration;

    public Patient(String id, String name, String surname, String email, String phoneNumber, Doctor doctor, Date dateOfRegistration) {
        super(id, name, surname, email, phoneNumber);
        this.doctor = doctor;
        this.dateOfRegistration = dateOfRegistration;
    }

}
