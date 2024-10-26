    package com.example.cloudinary_upload_java.controller;

    import com.example.cloudinary_upload_java.service.FileUpload;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.autoconfigure.AutoConfigureOrder;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.multipart.MultipartFile;
    import org.springframework.ui.Model;
    import java.io.IOException;

    @Controller
    public class FileUploadController {

        @Autowired
        private FileUpload fileUpload;


        @RequestMapping("/")
        public String home(){
            return "home";
        }

        @PostMapping("/upload")
        public String uploadFile(@RequestParam("imageURL")MultipartFile multipartFile, Model model ) throws IOException {
            String imageURL = fileUpload.upload(multipartFile);
            if (multipartFile.isEmpty()) {
                model.addAttribute("error", "Please select a file to upload.");
                return "home"; // Return to home or another view
            }
            System.out.println("Uploaded file: " + multipartFile.getOriginalFilename());
            model.addAttribute("imageURL", imageURL);
            return "gallery";
        }
    }

