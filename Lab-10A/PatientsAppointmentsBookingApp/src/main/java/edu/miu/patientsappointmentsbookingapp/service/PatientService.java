package edu.miu.patientsappointmentsbookingapp.service;

import edu.miu.patientsappointmentsbookingapp.model.Patient;

public interface PatientService {
    public Patient[] getAllPatientSortedByAge();
}
