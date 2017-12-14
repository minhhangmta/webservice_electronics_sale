<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Stock Management | Quản lý sản phẩm</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/fullcalendar.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/matrix-style.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/matrix-media.css"/>" />
        <link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet" />
        <link rel="stylesheet" href="<c:url value="/resources/css/jquery.gritter.css"/>" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!--header-->
        <jsp:include page="header.jsp"/>
        <!--end-header-->

        <!--sidebar-menu-->
        <jsp:include page="sidebar-menu.jsp"/>
        <!--sidebar-menu-->

        <!--main-container-part-->
        <div id="content">
            <!--breadcrumbs-->
            <div id="content-header">
                <div id="breadcrumb"> <a href="${pageContext.request.contextPath}/index" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
            </div>
            <!--End-breadcrumbs-->

            <!--Action boxes-->
            <div class="container-fluid">
                <hr>
                <div class="row-fluid">
                    <div class="span12">
                        <div class="container-fluid">
                            <div class="widget-box">
                                <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                                    <h5>Data table</h5>
                                </div>
                                <div class="widget-content nopadding">
                                    <table class="table table-bordered data-table">
                                        <thead>
                                            <tr>
                                                <th>STT</th>
                                                <th>Tên sản phẩm</th>
                                                <th>Hình ảnh</th>
                                                <th>Mô tả</th>
                                                <th>Đơn vị tính</th>
                                                <th>Số lượng</th>
                                                <th>Nhà cung cấp</th>
                                                <th>Trạng thái</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            
                                            <c:forEach items="${listSanPham}" var="listSanPham">
                                                <c:forTokens begin="1" end="${listSanPham.size()}" var="stt" step="1">
                                                <tr class="gradeX">
                                                    <td>${stt}</td>
                                                    <td>${listSanPham.tensanpham}</td>
                                                    <td>Win 95+</td>
                                                    <td>Win 95+</td>
                                                    <td>Win 95+</td>
                                                    <td>Win 95+</td>
                                                    <td>Win 95+</td>
                                                    <td>Win 95+</td>
                                                    <td class="center">4</td>
                                                </tr>
                                                </c:forTokens>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!--End-Action boxes-->    
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--end-main-container-part-->

        <!--Footer-part-->

        <div class="row-fluid">
            <div id="footer" class="span12"> 2017 Stock Management. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
        </div>

        <!--end-Footer-part-->

        <script src="<c:url value="/resources/js/excanvas.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.ui.custom.js"/>"></script> 
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.flot.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.flot.resize.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.peity.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/fullcalendar.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.dashboard.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.gritter.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.interface.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.chat.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.validate.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.form_validation.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.wizard.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.uniform.js"/>"></script> 
        <script src="<c:url value="/resources/js/select2.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.popover.js"/>"></script> 
        <script src="<c:url value="/resources/js/jquery.dataTables.min.js"/>"></script> 
        <script src="<c:url value="/resources/js/matrix.tables.js"/>"></script> 

        <script type="text/javascript">
            // This function is called from the pop-up menus to transfer to
            // a different page. Ignore if the value returned is a null string:
            function goPage(newURL) {

                // if url is empty, skip the menu dividers and reset the menu selection to default
                if (newURL != "") {

                    // if url is "-", it is this page -- reset the menu:
                    if (newURL == "-") {
                        resetMenu();
                    }
                    // else, send page to designated URL            
                    else {
                        document.location.href = newURL;
                    }
                }
            }

            // resets the menu selection upon entry to this page:
            function resetMenu() {
                document.gomenu.selector.selectedIndex = 2;
            }
        </script>
    </body>
</html>
