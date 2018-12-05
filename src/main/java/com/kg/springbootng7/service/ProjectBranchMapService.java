package com.kg.springbootng7.service;

import java.util.List;

import com.kg.springbootng7.entity.ProjectBranchMap;





public interface ProjectBranchMapService {

    public ProjectBranchMap createProjectBranchMap(ProjectBranchMap projectBranchMap);
    public List<ProjectBranchMap> getProjectBranchMaps();
    public ProjectBranchMap findByProjectBranchMapId(Long id);
    public ProjectBranchMap updateProjectBranchMap(Long id,ProjectBranchMap projectBranchMap);
    public void deleteProjectBranchMapById(Long id); 
    public Object[] getProjectBranchMapsNativeQuery();
}
