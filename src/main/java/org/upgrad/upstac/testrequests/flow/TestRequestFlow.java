package org.upgrad.upstac.testrequests.flow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.upgrad.upstac.testrequests.RequestStatus;
import org.upgrad.upstac.testrequests.TestRequest;
import org.upgrad.upstac.users.User;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class TestRequestFlow {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    public void setRequest(TestRequest request) {
        this.request = request;
    }

    @ManyToOne
    @JsonIgnore
    private TestRequest request;

    private RequestStatus fromStatus ;

    public void setFromStatus(RequestStatus fromStatus) {
        this.fromStatus = fromStatus;
    }

    public void setToStatus(RequestStatus toStatus) {
        this.toStatus = toStatus;
    }

    public void setChangedBy(User changedBy) {
        this.changedBy = changedBy;
    }

    private RequestStatus toStatus ;

    @ManyToOne
    private User changedBy;

    private LocalDate happenedOn=LocalDate.now();







}
