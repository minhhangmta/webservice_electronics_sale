/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import client.data.TaikhoanData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import entities.*;
import service.AccountService;
import dao.impl.AccountDaoImpl;
import util.Common;

/**
 *
 * @author Phong_Tung
 */
@Controller
public class AdLoginController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public String Login(ModelMap mm) {
//        mm.put("taikhoan", new Taikhoan());
        return "adlogin";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
//    public String confirmLogin(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("taikhoan") Taikhoan t, ModelMap mm){
//         boolean checkExist = TaikhoanData.existAccount(t.getUsername(), t.getPassword());
//         //int ma = quyen.getMaQ();
//        if (checkExist) {
//            HttpSession session = request.getSession();
//            session.setAttribute("username", t.getUsername());
//             return "adindex";
//        } else {
//            mm.put("msg", "Incorrect email or password!");
//            return "adlogin";
//        }           
//    }
    public String confirmLogin(HttpServletRequest request, @ModelAttribute("userFormData") Taikhoan formData, ModelMap mm) {
        System.out.println("=====>  " + formData.getUsername());
        System.out.println("=====>  " + formData.getPassword());
        String username = formData.getUsername();
        String password = formData.getPassword();
        boolean checkExist = TaikhoanData.existAccount(username, password);
        //int ma = quyen.getMaQ();
        if (checkExist) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return "adindex";
        } else {
            mm.put("msg", "Incorrect email or password!");
            return "adlogin";
        }
    }
}
