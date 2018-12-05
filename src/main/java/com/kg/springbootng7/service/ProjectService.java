package com.kg.springbootng7.service;

import java.util.List;

import com.kg.springbootng7.entity.Project;





public interface ProjectService {

    public Project createProject(Project team);
    public List<Project> getProjects();
    public Project findByProjectId(Long id);
    public Project updateProject(Long id,Project team);
    public void deleteProjectById(Long id); 

}
