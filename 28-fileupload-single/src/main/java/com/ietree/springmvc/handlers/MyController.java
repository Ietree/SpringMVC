package com.ietree.springmvc.handlers;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/test")
public class MyController
{
    @RequestMapping("/upload.do")
    public String doFileUpload(MultipartFile img, HttpSession session) throws Exception
    {
        // String path = "d:/Pictures";
        String path = session.getServletContext().getRealPath("/images");
        if (img.getSize() > 0)
        {
            // 获取到上传文件的原始名称
            String fileName = img.getOriginalFilename();
            if (fileName.endsWith("jpg") || fileName.endsWith("png"))
            {
                File file = new File(path, fileName);
                img.transferTo(file);
                return "/success.jsp";
            }
            return "/index.jsp";
        }
        return "/index.jsp";
    }
}
