package edu.miu.patientsappointmentsbookingapp.repository.iml;

import edu.miu.patientsappointmentsbookingapp.model.Patient;
import edu.miu.patientsappointmentsbookingapp.repository.PatientRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class PatientRepositoryIml implements PatientRepository {

    @Override
    public Patient[] getAllPatients() {
        Patient []patients=new Patient[5];
        patients[0] = new Patient(
                1,
                "Daniel",
                "Agar",
                "(641) 123-0009",
                "dagar@m.as",
                "1 N Street",
                LocalDate.of(1987, 1, 19)
        );
        patients[1] = new Patient(
                2,
                "Ana",
                "Smith",
                null,
                "amsith@te.edu",
                null,
                LocalDate.of(1948, 12, 5)
        );
        patients[2] = new Patient(
                3,
                "Marcus",
                "Garvey",
                "(123) 292-0018",
                null,
                "4 East Ave",
                LocalDate.of(2001, 9, 18)
        );
        patients[3] = new Patient(
                4,
                "Jeff",
                "Goldbloom",
                "(999) 165-1192",
                "jgold@es.co.za",
                null,
                LocalDate.of(1995, 2, 28)
        );
        patients[4] = new Patient(
                5,
                "Mary",
                "Washington",
                null,
                null,
                "30 W Burlington",
                LocalDate.of(1932, 5, 31)
        );
        return patients;
    }

}
