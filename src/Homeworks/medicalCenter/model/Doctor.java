package Homeworks.medicalCenter.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Doctor extends Person{
    private Profession profession;

    public Doctor(String id, String name, String surname, String email, String phoneNumber, Profession profession) {
        super(id, name, surname, email, phoneNumber);
        this.profession = profession;
    }
}
