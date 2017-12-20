/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import client.data.TaikhoanData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import entities.*;


@Controller
public class AdLoginController {

    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public String Login(ModelMap mm) {
        return "adlogin";
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String confirmLogin(HttpServletRequest request, @ModelAttribute Taikhoan taikhoan, ModelMap mm) {
        String username = taikhoan.getUsername();
        String password = taikhoan.getPassword();
        boolean checkExist = TaikhoanData.existAccount(username, password);
        //int ma = quyen.getMaQ();
        if (checkExist) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return "redirect:/admin/index";
        } else {
            mm.put("error", "Incorrect email or password!");
            return "adlogin";
        }
    }
}
