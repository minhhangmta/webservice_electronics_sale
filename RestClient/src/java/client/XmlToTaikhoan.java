/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import entities.Quyen;
import entities.Taikhoan;
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
import static util.Common.tryParseInt;

/**
 *
 * @author minhh
 */
public class XmlToTaikhoan {

    public static List<Taikhoan> getAllFromXML(String xmlData) {
        List<Taikhoan> list = new ArrayList<>();
        try {
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlData));

            Document doc;
            doc = db.parse(is);

            NodeList nodeList;
            nodeList = doc.getElementsByTagName("taikhoan");
            //
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                Element eElement = (Element) node;
                Taikhoan tk = new Taikhoan();
                tk.setUsername(eElement.getElementsByTagName("username").item(0).getTextContent());
                tk.setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());

                NodeList nl = eElement.getElementsByTagName("maQ");
                Node n = nl.item(0);
                Element e = (Element) n;
                Quyen quyen = new Quyen();
                quyen.setMaQ(Integer.parseInt(e.getElementsByTagName("maQ").item(0).getTextContent()));
                tk.setMaQ(quyen);
                
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

//    public static void main(String[] args) {
//         List<Taikhoan> lstSP = new ArrayList<>();
//        TaikhoanClient spClient = new TaikhoanClient();
//        Object object = spClient.findAll_XML(String.class);
//        System.out.println("s " + object.toString());
//        lstSP = XmlToTaikhoan.getAllFromXML(object.toString());
//        for (Taikhoan taikhoan : lstSP) {
//            System.out.println(taikhoan.getUsername());
//            System.out.println(taikhoan.getMaQ().getMaQ());
//        }
//    }
}
