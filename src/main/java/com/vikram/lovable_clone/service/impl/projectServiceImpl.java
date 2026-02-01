package com.vikram.lovable_clone.service.impl;

import com.vikram.lovable_clone.dto.project.ProjectRequest;
import com.vikram.lovable_clone.dto.project.ProjectResponse;
import com.vikram.lovable_clone.dto.project.ProjectSummaryResponse;
import com.vikram.lovable_clone.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
