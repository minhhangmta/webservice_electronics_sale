/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author minhh
 */
public class AdminLogoutController {

    @RequestMapping(value = "/admin/logout", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        System.out.println("logout");
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        return "adlogin";
    }
}
