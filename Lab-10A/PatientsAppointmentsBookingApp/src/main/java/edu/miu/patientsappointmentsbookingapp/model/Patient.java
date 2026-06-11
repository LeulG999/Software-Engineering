package edu.miu.patientsappointmentsbookingapp.model;

import java.time.LocalDate;
import java.time.Period;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public int getAge(){
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }

}
