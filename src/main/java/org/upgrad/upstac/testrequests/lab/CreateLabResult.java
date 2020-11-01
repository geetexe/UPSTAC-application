package org.upgrad.upstac.testrequests.lab;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateLabResult {

    @NotNull
    private String bloodPressure;

    @NotNull
    private String heartBeat;
    @NotNull
    private String temperature;
    private String oxygenLevel;
    private String comments;
    @NotNull
    private TestStatus result;

    public String getBloodPressure() {
        return bloodPressure;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getOxygenLevel() {
        return oxygenLevel;
    }

    public String getComments() {
        return comments;
    }

    public TestStatus getResult() {
        return result;
    }
}
