package com.example.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin
public class FileUploadController {

    @Autowired
    private UploadRepository uploadRepository;

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<?> uploadFile(
            @RequestPart("file") MultipartFile file,
            @RequestPart("request") UploadRequest request) {

        // Save to MongoDB
        UploadRequest savedRequest = uploadRepository.save(request);

        // Response
        Map<String, Object> resp = new HashMap<>();
        resp.put("file", file.getOriginalFilename());
        resp.put("request", savedRequest);

        return ResponseEntity.ok(resp);
    }
}
