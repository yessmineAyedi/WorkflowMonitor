package com.example.workflow.controller;


import com.example.workflow.entity.ActivityInstance;
import com.example.workflow.service.ActivityInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityInstanceController {

    @Autowired
    private ActivityInstanceService service;

    @GetMapping("/activities/{processInstanceId}")
    public List<ActivityInstance> getActivities(@PathVariable String processInstanceId){
        return service.getActivityInstanceByProcessInstanceId(processInstanceId);
    }
}
