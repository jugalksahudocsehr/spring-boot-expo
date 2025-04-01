package com.example.upload;

import lombok.Data;

import java.util.Date;

@Data
public class ABNMetadata extends Metadata {
    private String abn;
    private Date abnDate;
}

