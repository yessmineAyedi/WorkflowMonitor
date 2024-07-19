package com.example.workflow.service;


import com.example.workflow.entity.ActivityInstance;
import com.example.workflow.repository.ActivityInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityInstanceService {

    @Autowired
    private ActivityInstanceRepository repository;

    public List<ActivityInstance> getActivityInstanceByProcessInstanceId (String processInstanceId){
        return repository.findByProcessInstanceId(processInstanceId);
    }
}
