package edu.miu.patientsappointmentsbookingapp.service.iml;

import edu.miu.patientsappointmentsbookingapp.model.Patient;
import edu.miu.patientsappointmentsbookingapp.repository.PatientRepository;
import edu.miu.patientsappointmentsbookingapp.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
public class PatientServiceIml implements PatientService {

       PatientRepository patientRepository;
    public PatientServiceIml(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient[] getAllPatientSortedByAge() {
        Patient[] patients=patientRepository.getAllPatients();
        Arrays.sort(patients, Comparator.comparing(Patient::getAge).reversed());
        return patients;
    }
}
