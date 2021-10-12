package com.example.demo.components;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Componente para subir y descargar archivos del servidor
 * @author Javier Valles
 * @since  oct-11-2021
 */

@Component
public class FileManagment {
    /**
     * Metodo para subir archivos
     * @param multipartFile
     * @param name
     * @return
     */

    public String upload(MultipartFile multipartFile, String name) throws IOException {
        File newFile = new File(name);
        Files.copy(multipartFile.getInputStream(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        return name;
    }
}
