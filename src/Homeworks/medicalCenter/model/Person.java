package Homeworks.medicalCenter.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;

}
