package com.vikram.lovable_clone.service;

import com.vikram.lovable_clone.dto.project.FileContentResponse;
import com.vikram.lovable_clone.dto.project.FileTreeResponse;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
