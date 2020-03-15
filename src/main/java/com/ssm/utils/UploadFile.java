//package com.ssm.utils;
//
//import org.springframework.web.multipart.MultipartFile;
//import org.thymeleaf.expression.Lists;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UploadFile {
//
//    public String UploadFile(MultipartFile file)  {
//        // 首先校验图片格式
//        List<String> imageType = new ArrayList();
//        imageType.add("jpg");
//        imageType.add("jpeg");
//        imageType.add("png");
//        imageType.add("bmp");
//        imageType.add("gif");
//        // 获取文件名，带后缀
//        String originalFilename = file.getOriginalFilename();
//        // 获取文件的后缀格式
//        String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1).toLowerCase();
//        if (imageType.contains(fileSuffix)) {
//            // 只有当满足图片格式时才进来，重新赋图片名，防止出现名称重复的情况
//            String newFileName = UUIDTypeHandler.createUUID() + originalFilename;
//            // 该方法返回的为当前项目的工作目录，即在哪个地方启动的java线程
//            String dirPath = System.getProperty("user.dir");
//            String path = File.separator + "uploadImg" + File.separator + newFileName;
//            File destFile = new File(dirPath + path);
//            if (!destFile.getParentFile().exists()) {
//                destFile.getParentFile().mkdirs();
//            }
//            try {
//                file.transferTo(destFile);
//                // 将相对路径返回给前端
//                return path;
//            } catch (IOException e) {
//                log.error("upload pic error");
//                return null;
//            }
//        } else {
//            // 非法文件
//            log.error("the picture's suffix is illegal");
//            throw new NotifyException(ExceptionConstants.FILE_UPLOAD_ERROR);
//        }
//    }}