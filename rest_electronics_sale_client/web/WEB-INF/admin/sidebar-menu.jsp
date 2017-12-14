<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Home </a>
            <ul>
                <c:set value="${pageContext.request.servletPath}" var="servletPath"/>
                <li class="${servletPath.contains("index") ? "active" : "" }"> <a href="${pageContext.request.contextPath}/index"><i class="icon icon-home"></i> <span>Home</span></a> </li>
                <li class="${servletPath.contains("products") ? "active" : "" }"> <a href="${pageContext.request.contextPath}/products"><i class="icon icon-signal"></i> <span>Quản lý sản phẩm</span></a> </li>
                <li> <a href="#"><i class="icon icon-inbox"></i> <span>Quản lý phiếu nhập</span></a> </li>
                <li><a href="#"><i class="icon icon-th"></i> <span>Quản lý phiếu xuất</span></a></li>
                <li><a href="#"><i class="icon icon-fullscreen"></i> <span>Quản lý danh mục</span></a></li>
                <li><a href="#"><i class="icon icon-tint"></i> <span>Quản lý nhà cung cấp</span></a></li>
                <li><a href="#"><i class="icon icon-tint"></i> <span>Quản lý tồn kho</span></a></li>
            </ul>
        </div>
    </body>
</html>
