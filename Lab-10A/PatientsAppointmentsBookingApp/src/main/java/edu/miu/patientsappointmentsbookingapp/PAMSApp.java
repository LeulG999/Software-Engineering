package edu.miu.patientsappointmentsbookingapp;

import com.fasterxml.jackson.databind.SerializationFeature;
import edu.miu.patientsappointmentsbookingapp.model.Patient;
import edu.miu.patientsappointmentsbookingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PAMSApp implements CommandLineRunner {

    private PatientService patientService;

    public static void main(String[] args) {
        SpringApplication.run(PAMSApp.class, args);
    }

    public PAMSApp(PatientService patientService, Environment environment) {
        this.patientService = patientService;
    }

    @Value("${app.environment}")
    private String environment;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Active Environment is :" + environment);
        System.out.println("------------------------------------------------------------------------------------");
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        Patient[]patients=patientService.getAllPatientSortedByAge();
        String json=objectMapper.writeValueAsString(patients);
        System.out.println(json);
    }


}
