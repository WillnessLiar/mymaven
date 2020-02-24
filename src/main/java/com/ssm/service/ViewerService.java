package com.ssm.service;

import com.ssm.po.Viewer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ViewerService {

    void addViewer(Viewer viewer);
    List<Viewer> findViewerAll();
    void deleteViewerByVphone(String vphone);
}
