package com.tpnprojs.tpntodoapp.repository;

import com.tpnprojs.tpntodoapp.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    ProjectTask getById(Long id); 
}
