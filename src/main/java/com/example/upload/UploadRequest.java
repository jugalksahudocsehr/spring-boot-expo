package com.example.upload;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class UploadRequest {
    private Long patientId;
    private String folderName;
    private String subfolderName;
    private String documentName;
    private String documentUrl;
    private String provider;
    private String metadata;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOnDocument;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfFiling;

    // Getters and Setters
    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }
    public String getFolderName() { return folderName; }
    public void setFolderName(String folderName) { this.folderName = folderName; }
    public String getSubfolderName() { return subfolderName; }
    public void setSubfolderName(String subfolderName) { this.subfolderName = subfolderName; }
    public String getDocumentName() { return documentName; }
    public void setDocumentName(String documentName) { this.documentName = documentName; }
    public String getDocumentUrl() { return documentUrl; }
    public void setDocumentUrl(String documentUrl) { this.documentUrl = documentUrl; }
    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }
    public String getMetadata() { return metadata; }
    public void setMetadata(String metadata) { this.metadata = metadata; }
    public LocalDate getDateOnDocument() { return dateOnDocument; }
    public void setDateOnDocument(LocalDate dateOnDocument) { this.dateOnDocument = dateOnDocument; }
    public LocalDate getDateOfFiling() { return dateOfFiling; }
    public void setDateOfFiling(LocalDate dateOfFiling) { this.dateOfFiling = dateOfFiling; }
}
