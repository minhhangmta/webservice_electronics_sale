/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.data;

import client.*;
import entities.*;
import java.util.List;

/**
 *
 * @author minhh
 */
public class SanphamData {

    public static List<Sanpham> getListSanpham() {
        SanphamClient spClient = new SanphamClient();
        Object object = spClient.findAll_XML(String.class);
        List<Sanpham> list = XmlToSanpham.getAllFromXML(object.toString());
        return list;
    }
}
