package com.example.upload;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UploadRepository extends MongoRepository<UploadRequest, String> {
}

