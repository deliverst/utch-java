package com.example.demo.app.documents;

import com.example.demo.components.FileManagment;
import com.example.demo.utils.Router;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping(Router.DOCUMENTS)
public class DocumentsRestController {

    @Value("${bucket}")
    private String bucket;
    private final FileManagment fileManagment;

    public DocumentsRestController(FileManagment fileManagment) {
            this.fileManagment = fileManagment;
        }

        @PostMapping("/upload")
        public void upload(@RequestParam("file")MultipartFile multipartFile,
                            @RequestParam("name") String name) {
            try{
                fileManagment.upload(multipartFile,name);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


//Nombre del Archivo
//System.out.println(bucket + File.separator + multipartFile.getOriginalFilename());