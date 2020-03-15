package com.ssm.controller;

import com.ssm.po.Viewer;
import com.ssm.service.ViewerService;
import com.ssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Viewer")
public class ViewerController {

    @Autowired
    private ViewerService viewerService;

        @RequestMapping(path ="/addViewer.do", method = RequestMethod.POST)
    public String addViewer(@Valid Viewer viewer, BindingResult result) {
        if (result.hasErrors()) {
            return "findex";
        }
            this.viewerService.addViewer(viewer);
            System.out.println(viewer);
            System.out.println(viewer.toString());
            return "demo2ok";
        }

    @RequestMapping("/findViewerAll")
    public String findViewerAll(Model model) {
        List<Viewer> list = this.viewerService.findViewerAll();
        model.addAttribute("list", list);
        return "showmessage";
    }

    @RequestMapping("/deleteViewer")
    public String deleteViewer(String vphone) {
        this.viewerService.deleteViewerByVphone(vphone);
        return "redirect:/Viewer/findViewerAll";
    }

}
