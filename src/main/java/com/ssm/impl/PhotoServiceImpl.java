package com.ssm.impl;

import com.ssm.mapper.PhotoMapper;
import com.ssm.po.Photo;
import com.ssm.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PhotoServiceImpl implements PhotoService {

@Autowired
private PhotoMapper photoMapper;
    @Override
    public void uploadPhoto(Map<String, Object> photo) {
        photoMapper.insert_photo(photo);
    }

    @Override
    public List<Map<String, Object>> select_photo() {
        return photoMapper.select_photo();
    }
}
