package com.example.upload;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin
public class FileUploadController {
    
    @PostMapping(consumes = "multipart/form-data")
    public String uploadFile(
            @RequestPart("file") MultipartFile file,
            @RequestPart("request") UploadRequest request) {
        
        return "File: " + file.getOriginalFilename() + " uploaded successfully!";
    }
}
