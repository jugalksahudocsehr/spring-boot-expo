package com.example.upload;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "uploads")
@Data
public class UploadRequest {
    private Long patientId;
    private String folderName;
    private String subfolderName;
    private String documentName;
    private String documentUrl;
    private String provider;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = ABNMetadata.class, name = "ABN"),
            @JsonSubTypes.Type(value = AuthorizationMetadata.class, name = "AUTHORIZATION")
    })
    private Metadata metadata;

    private LocalDateTime dateOnDocument;
    private LocalDateTime dateOfFiling;
}

