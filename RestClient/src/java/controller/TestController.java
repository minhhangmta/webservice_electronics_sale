/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import client.TaikhoanClient;
import client.XmlToTaikhoan;
import entities.Sanpham;
import entities.Taikhoan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.*;
import util.Common;
import util.Constant;

/**
 *
 * @author minhh
 */
@Controller
@Configuration
//@ComponentScan("service.impl")
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(ModelMap mm) {
        TaikhoanClient spClient = new TaikhoanClient();
        List<Taikhoan> list = new ArrayList<>();
        Object object = spClient.findAll_XML(String.class);
        list = XmlToTaikhoan.getAllFromXML(object.toString());
        mm.addAttribute("listTK",list);
        return "test";
    }

}
