package com.ssm.controller;

import com.ssm.config.Auth;
import com.ssm.po.Viewer;
import com.ssm.service.PhotoService;
import com.ssm.service.ViewerService;
import com.ssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ImageUploadController {
    @Autowired
    private PhotoService photoService;
    @Autowired
    private ViewerService viewerService;
    @Auth(role = "0")
    @ResponseBody
    @RequestMapping("/uploadImage")
    public R uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request,String msg) throws IOException {

        //上传路径保存设置
         String path = request.getServletContext().getRealPath("/images");
//        String path = "images";
        File realPath = new File(path);
        System.out.println("上传文件保存地址：" + realPath);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        //上传文件地址
        System.out.println("上传文件保存地址：" + realPath);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        //存储文件名
        int max=10000,min=1;
        int ran = (int) (Math.random()*(max-min)+min);
        String file_name=file.getOriginalFilename();
        String[] split = file_name.split("\\.");
        file_name=split[0]+ran+"."+split[1];
        file.transferTo(new File(realPath + "/" + file_name));
        Map<String,Object> photo=new HashMap<>();
        photo.put("pdata",file_name);
        photo.put("msg",msg);
        photoService.uploadPhoto(photo);
        return R.ok();
    }

    @ResponseBody
    @GetMapping("/selectPhoto")
    public List<Map<String,Object>> selectPhoto(){
        return photoService.select_photo();
    }
    //上传消息

    @ResponseBody
    @RequestMapping("/insertMsg")
    public R insertMsg(String name ,String email , String phone, String msg) throws IOException {
        Viewer viewer=new Viewer();
        viewer.setVemail(email);
        viewer.setVmessage(msg);
        viewer.setVphone(phone);
        viewer.setVname(name);
        viewerService.addViewer(viewer);
        return R.ok();
    }

}
