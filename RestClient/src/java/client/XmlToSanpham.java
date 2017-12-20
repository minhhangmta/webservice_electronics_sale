/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entities.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author minhh
 */
public class XmlToSanpham {

    public static List<Sanpham> getAllFromXML(String xmlData) {
        List<Sanpham> list = new ArrayList<>();
        try {
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlData));

            Document doc;
            doc = db.parse(is);

            NodeList nodeList;
            nodeList = doc.getElementsByTagName("sanpham");
            //
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                Element eElement = (Element) node;
                Sanpham sp = new Sanpham();
                sp.setMaSp(Integer.parseInt(eElement.getElementsByTagName("maSp").item(0).getTextContent()));
                sp.setTensanpham(eElement.getElementsByTagName("tensanpham").item(0).getTextContent());
                sp.setAnh(eElement.getElementsByTagName("anh").item(0).getTextContent());
                sp.setMota(eElement.getElementsByTagName("mota").item(0).getTextContent());
                sp.setGia(Integer.parseInt(eElement.getElementsByTagName("gia").item(0).getTextContent()));
                sp.setSale(Integer.parseInt(eElement.getElementsByTagName("sale").item(0).getTextContent()));
                sp.setSoluong(Integer.parseInt(eElement.getElementsByTagName("soluong").item(0).getTextContent()));

                //get nha cung cap
                NodeList nodeList1 = eElement.getElementsByTagName("maNcc");
                Node n1 = nodeList1.item(0);
                Element e = (Element) n1;
                Nhacungcap ncc = new Nhacungcap();
                ncc.setTennhacc(e.getElementsByTagName("tennhacc").item(0).getTextContent());
                sp.setMaNcc(ncc);

                //get trang thai
                nodeList1 = eElement.getElementsByTagName("maTt");
                n1 = nodeList1.item(0);
                e = (Element) n1;
                Trangthai tt = new Trangthai();
                tt.setTentrangthai(e.getElementsByTagName("tentrangthai").item(0).getTextContent());
                sp.setMaTt(tt);

                //get danh muc
                nodeList1 = eElement.getElementsByTagName("maDm");
                n1 = nodeList1.item(0);
                e = (Element) n1;
                Danhmuc dm = new Danhmuc();
                dm.setTendanhmuc(e.getElementsByTagName("tendanhmuc").item(0).getTextContent());
                sp.setMaDm(dm);

                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
//        public static void main(String[] args) {
//         List<Sanpham> lstSP = new ArrayList<>();
//        SanphamClient spClient = new SanphamClient();
//        Object object = spClient.findAll_XML(String.class);
//        System.out.println("s " + object.toString());
//        lstSP = XmlToSanpham.getAllFromXML(object.toString());
//        for (Sanpham taikhoan : lstSP) {
//            System.out.println(taikhoan.getTensanpham());
//            System.out.println(taikhoan.getMaTt().getTentrangthai());
//        }
//    }
}
