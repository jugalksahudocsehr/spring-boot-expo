package com.example.upload;

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

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity uploadFile(
            @RequestPart("file") MultipartFile file,
            @RequestPart("request") UploadRequest request) {

        HashMap resp = new HashMap() {{
            put("file", file.getOriginalFilename());
            put("request", request);
        }};
        return ResponseEntity.ok().body(resp);
    }
}
