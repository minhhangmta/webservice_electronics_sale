/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.data;

import client.TaikhoanClient;
import client.XmlToTaikhoan;
import entities.Taikhoan;
import java.util.List;

/**
 *
 * @author minhh
 */
public class TaikhoanData {

    public static List<Taikhoan> getListTaiKhoan() {
        TaikhoanClient tkClient = new TaikhoanClient();
        Object object = tkClient.findAll_XML(String.class);
        List<Taikhoan> list = XmlToTaikhoan.getAllFromXML(object.toString());
        return list;
    }

    public static boolean existAccount(String username, String password) {
        List<Taikhoan> list = getListTaiKhoan();
        for (Taikhoan taikhoan : list) {
            if (username.equals(taikhoan.getUsername())
                    && password.equals(taikhoan.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
