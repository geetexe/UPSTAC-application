package org.upgrad.upstac.testrequests;

import lombok.Data;
import org.upgrad.upstac.testrequests.consultation.Consultation;
import org.upgrad.upstac.testrequests.lab.LabResult;
import org.upgrad.upstac.users.User;
import org.upgrad.upstac.users.models.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class TestRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long requestId;

    @ManyToOne
    private User createdBy;

    private LocalDate created=LocalDate.now();

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    private RequestStatus status = RequestStatus.INITIATED;


    private String name;
    private Gender gender;
    private String address;
    private Integer age;
    private String email;
    private String phoneNumber;
    private Integer pinCode;

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    @OneToOne(mappedBy="request")
    Consultation consultation;

    public void setLabResult(LabResult labResult) {
        this.labResult = labResult;
    }

    @OneToOne(mappedBy="request")
    LabResult labResult;

}
