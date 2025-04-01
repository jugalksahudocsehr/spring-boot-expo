package com.example.upload;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuthorizationMetadata extends Metadata {
    private String authCode;
    private LocalDateTime authDate;
}

