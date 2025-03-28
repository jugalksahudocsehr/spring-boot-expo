# spring-boot-expo

# curl

```
curl --location 'http://localhost:8080/api/upload' \
--form 'file=@"/C:/Users/Doctor'\''s EHR LLC/Downloads/68747470733a2f2f796176757a63656c696b65722e6769746875622e696f2f73616d706c652d696d616765732f696d6167652d34342e6a7067.jpeg"' \
--form 'request="{\"patientId\":123, \"folderName\":\"Medical\", \"subfolderName\":\"Reports\", \"documentName\":\"test.pdf\", \"documentUrl\":\"https://example.com/test.pdf\", \"provider\":\"Dr. Smith\", \"metadata\":\"{}\", \"dateOnDocument\":\"2024-03-28\", \"dateOfFiling\":\"2024-03-28\"}";type=application/json'
```

# response

```
{
    "request": {
        "patientId": 123,
        "folderName": "Medical",
        "subfolderName": "Reports",
        "documentName": "test.pdf",
        "documentUrl": "https://example.com/test.pdf",
        "provider": "Dr. Smith",
        "metadata": "{}",
        "dateOnDocument": "2024-03-28",
        "dateOfFiling": "2024-03-28"
    },
    "file": "68747470733a2f2f796176757a63656c696b65722e6769746875622e696f2f73616d706c652d696d616765732f696d6167652d34342e6a7067.jpeg"
}
```
