<%-- 
    Document   : addProduct
    Created on : Dec 14, 2017, 2:46:03 PM
    Author     : Phong_Tung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="dao.impl.*" %>
<%@page import="pojo.*"%>
<%@page import="java.util.*" %>
<%@page import="util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock Management | Quản lý tài khoản</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/bootstrap-responsive.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/fullcalendar.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/matrix-style.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/matrix-media.css"/>" />
        <link href="<c:url value="/resources/font-awesome/admin/css/font-awesome.css"/>" rel="stylesheet" />
        <link rel="stylesheet" href="<c:url value="/resources/admin/css/jquery.gritter.css"/>" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!--header-->
        <jsp:include page="adheader.jsp"/>
        <!--end-header-->

        <!--sidebar-menu-->
        <jsp:include page="adsidebar-menu.jsp"/>
        <!--sidebar-menu-->
<!--main-container-part-->
        <div id="content">
            <!--breadcrumbs-->
            <div id="content-header">
                <div id="breadcrumb"> <a href="${pageContext.request.contextPath}/adindex" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a><a href="${pageContext.request.contextPath}/themtaikhoan" class="current">Thêm Tài Khoản</a></div>
                <h1>Thêm Tài Khoản</h1>
            </div>
            <!--End-breadcrumbs-->

            <div class="widget-box">
                <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                    <h5>Thêm tài khoản</h5>
                    <p>${msgAccount} ${msgAccountErr} ${msgPass}</p>
                </div>
                <div class="widget-content nopadding">
                    <form action="${pageContext.request.contextPath}/themtaikhoan" method="post" class="form-horizontal" commandName="newcate">
                        <div class="widget-content nopadding">
                            <form action="${pageContext.request.contextPath}/themtaikhoan" method="post" class="form-horizontal"commandName="newcate" >
                                <div class="control-group">
                                    <label class="control-label">UserName :</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập UserName " name="username"required=""/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Password :</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập Password " name="password" required=""/>
                                    </div>
                                </div>                              
                                <div class="control-group">
                                    <label class="control-label">Họ Và Tên</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập Họ Tên" name="hoten" required=""/>
                                    </div>
                                </div>                             
                                <div class="control-group">
                                    <label class="control-label">Email</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập Email" name="email" required=""/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Số Điện Thoại</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập Số Điện Thoại" name="sodienthoai"required=""/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Địa Chỉ</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Nhập Địa Chỉ" name="diachi"required=""/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Quyền</label>
                                    <div class="controls">
                                        <select  name="quyen">
                                            <%
                                                List<Quyen> list = new ArrayList<Quyen>();
                                                list = Common.getListQuyen();
                                                for (Quyen p : list) {
                                            %>
                                            <option value="<%= p.getMaQ()%>"><%=p.getTenquyen()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Trạng Thái</label>
                                    <div class="controls">
                                        <select  name="maTt">
                                            <%
                                                List<Trangthai> list3 = new ArrayList<Trangthai>();
                                                list3 = Common.getListTrangThai();
                                                for (Trangthai p : list3) {
                                            %>
                                            <option value="<%= p.getMaTt()%>"><%=p.getTentrangthai()%></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                                 <button type="submit" class="btn btn-success">save</button>
                            </form>
                        </div>
                    </form>
                </div>
                <!--Footer-part-->

                <div class="row-fluid">
                    <div id="footer" class="span12"> 2017 Stock Management. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
                </div>

                <!--end-Footer-part-->


                </body>
                </html>
