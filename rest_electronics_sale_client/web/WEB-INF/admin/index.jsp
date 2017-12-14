<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Stock Management | Home</title>
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
                <div class="quick-actions_homepage">
                    <ul class="quick-actions">
                        <li class="bg_lb"> <a href="${pageContext.request.contextPath}/index"> <i class="icon icon-home"></i> Home </a> </li>
                        <li class="bg_lg span3"> <a href="${pageContext.request.contextPath}/products"> <i class="icon-th-list"></i> Quản lý sản phẩm </a> </li>
                        <li class="bg_ly"> <a href="#"> <i class="icon-inbox"></i> Quản lý phiếu nhập </a> </li>
                        <li class="bg_lo"> <a href="#"> <i class="icon-th"></i> Quản lý phiếu xuất </a> </li>
                        <li class="bg_lo span3"> <a href="#"> <i class="icon-th-list"></i> Quản lý tồn kho</a> </li>
                        <li class="bg_lo span3"> <a href="#"> <i class="icon-tint"></i> Quản lý nhà cung cấp </a> </li>
                        <li class="bg_lg"> <a href="#"> <i class="icon-calendar"></i> Quản lý danh mục</a> </li>

                    </ul>
                </div>
                <!--End-Action boxes-->    
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
