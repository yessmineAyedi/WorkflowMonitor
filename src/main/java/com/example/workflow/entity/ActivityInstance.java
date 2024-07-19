package com.example.workflow.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ACT_HI_ACTINST")
public class ActivityInstance {

    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_INST_ID_")
    private String processInstanceId;

    @Column(name = "ACT_ID_")
    private String activityId;

    public String getId() {
        return id;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public String getActivityId() {
        return activityId;
    }


}
