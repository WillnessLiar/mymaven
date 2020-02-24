package com.ssm.impl;

import com.ssm.mapper.ViewerMapper;
import com.ssm.po.Viewer;
import com.ssm.service.ViewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ViewerServiceImpl implements ViewerService {

    @Autowired
    private ViewerMapper viewerMapper;

    @Override
    public void addViewer(Viewer viewer) {
        this.viewerMapper.insertViewer(viewer);
    }

    @Override
    public List<Viewer> findViewerAll() {
        return this.viewerMapper.selectViewerAll();
    }

    @Override
    public void deleteViewerByVphone(String vphone) {
        this.viewerMapper.deleteViewerByVphone(vphone);
    }
}
