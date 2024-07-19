package com.example.workflow.repository;

import com.example.workflow.entity.ActivityInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ActivityInstanceRepository extends JpaRepository<ActivityInstance ,String> {

    List<ActivityInstance> findByProcessInstanceId(String processInstanceId);
}
