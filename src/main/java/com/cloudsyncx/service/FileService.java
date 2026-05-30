package com.cloudsyncx.service;

import com.cloudsyncx.entity.FileMetadata;
import com.cloudsyncx.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public FileMetadata findByFileName(
        String fileName) {

    List<FileMetadata> files =
            fileRepository.findByFileName(fileName);

    if (files.isEmpty()) {
        return null;
    }

    return files.get(0);
}