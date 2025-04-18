# Spring-boot-expo

# Curl Request

```
curl --location 'http://localhost:8080/api/upload' \
--form 'file=@"/C:/Users/Doctor'\''s EHR LLC/Downloads/AtomicKotlin-sample.pdf"' \
--form 'request="{
  \"patientId\": 654321,
  \"folderName\": \"Insurance\",
  \"subfolderName\": \"Authorization\",
  \"documentName\": \"insurance_approval.pdf\",
  \"documentUrl\": \"/uploads/insurance_approval.pdf\",
  \"provider\": \"XYZ Insurance\",
  \"metadata\": {
    \"type\": \"AUTHORIZATION\",
    \"authCode\": \"AUTH789\",
    \"authDate\": \"2025-04-01T10:00:00\"
  },
  \"dateOnDocument\": \"2025-03-29T14:00:00\",
  \"dateOfFiling\": \"2025-04-02T08:30:00\"
}
";type=application/json'
```

# Response

```
{
    "request": {
        "patientId": 654321,
        "folderName": "Insurance",
        "subfolderName": "Authorization",
        "documentName": "insurance_approval.pdf",
        "documentUrl": "/uploads/insurance_approval.pdf",
        "provider": "XYZ Insurance",
        "metadata": {
            "type": "AUTHORIZATION",
            "authCode": "AUTH789",
            "authDate": "2025-04-01T10:00:00"
        },
        "dateOnDocument": "2025-03-29T14:00:00",
        "dateOfFiling": "2025-04-02T08:30:00"
    },
    "file": "AtomicKotlin-sample.pdf"
}
```

# MongoDB - Stored Data
```
{
    "_id" : ObjectId("67eba1dd64d0945ab27b7fe5"),
    "patientId" : NumberLong(123456),
    "folderName" : "MedicalRecords",
    "subfolderName" : "ABN",
    "documentName" : "consent_form.pdf",
    "documentUrl" : "/uploads/consent_form.pdf",
    "provider" : "ABC Healthcare",
    "metadata" : {
        "abn" : "ABN123456",
        "abnDate" : ISODate("2025-03-30T14:30:00.000+0000"),
        "_class" : "com.example.upload.ABNMetadata"
    },
    "dateOnDocument" : ISODate("2025-03-28T03:45:00.000+0000"),
    "dateOfFiling" : ISODate("2025-03-31T11:15:00.000+0000"),
    "_class" : "com.example.upload.UploadRequest"
}
{
    "_id" : ObjectId("67eba22164d0945ab27b7fe6"),
    "patientId" : NumberLong(654321),
    "folderName" : "Insurance",
    "subfolderName" : "Authorization",
    "documentName" : "insurance_approval.pdf",
    "documentUrl" : "/uploads/insurance_approval.pdf",
    "provider" : "XYZ Insurance",
    "metadata" : {
        "authCode" : "AUTH789",
        "authDate" : ISODate("2025-04-01T04:30:00.000+0000"),
        "_class" : "com.example.upload.AuthorizationMetadata"
    },
    "dateOnDocument" : ISODate("2025-03-29T08:30:00.000+0000"),
    "dateOfFiling" : ISODate("2025-04-02T03:00:00.000+0000"),
    "_class" : "com.example.upload.UploadRequest"
}

```
