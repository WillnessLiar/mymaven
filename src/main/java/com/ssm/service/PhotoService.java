package com.ssm.service;

import com.ssm.po.Photo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface PhotoService {

//    Integer insertPhoto(Photo photo);
    void uploadPhoto(Map<String,Object> photo);
    List<Map<String,Object>> select_photo();
}
