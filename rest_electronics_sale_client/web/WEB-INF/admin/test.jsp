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
                                    <h5>Danh sách sản phẩm</h5>
                                </div>
                                <br>
                                <button class="btn btn-success" style="margin-left: 20px;">Thêm sản phẩm</button>
                                <br>
                                <br>
                                <div class="widget-content nopadding">
                                    <table class="table table-bordered data-table">
                                        <thead>
                                            <tr>
                                                <th>STT</th>
                                                <th>Tên sản phẩm</th>
                                                <th>Hình ảnh</th>
                                                <th>Mô tả</th>
                                                <th>Đơn vị tính</th>
                                                <th>Giá</th>
                                                <th>Số lượng</th>
                                                <th>Nhà cung cấp</th>
                                                <th>Trạng thái</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="gradeX">
                                                <td>1</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/a.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                    <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                            <tr class="gradeX">
                                                <td>2</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/a.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                    <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                            <tr class="gradeX">
                                                <td>3</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/a.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                    <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                            <tr class="gradeX">
                                                <td>4</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/b.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                   <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                            <tr class="gradeX">
                                                <td>5</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/3.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                    <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                            <tr class="gradeX">
                                                <td>6</td>
                                                <td>Samsung Galaxy S7</td>
                                                <td><img alt="" style="height:100px; width:100px;" src="<c:url value="/resources/img/product/4.jpg"/>" /></td>
                                                <td>Important Notice:You might be asked to log onto a ...</td>
                                                <td>VND</td>
                                                <td>20000000</td>
                                                <td>1000</td>
                                                <td>Samsung</td>
                                                <td>Đang bán</td>
                                                <td>
                                                    <button type="button" class="btn btn-warning btn-mini">Sửa</button>
                                                    <button type="button" class="btn btn-danger btn-mini">Xóa</button>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="fg-toolbar ui-toolbar ui-widget-header ui-corner-bl ui-corner-br ui-helper-clearfix">
                                        <div class="dataTables_filter" id="DataTables_Table_0_filter">
                                            <br>
                                            <table>
                                                <tr>
                                                    
                                                    <td><label>Tìm mã/tên sản phẩm <input type="text" aria-controls="DataTables_Table_0"></label></td>
                                                    <td><label>Tìm nhà cung cấp <input type="text" aria-controls="DataTables_Table_0"></label></td>
                                                </tr>
                                            </table>
                                        </div>
                                        <div class="dataTables_paginate fg-buttonset ui-buttonset fg-buttonset-multi ui-buttonset-multi paging_full_numbers" id="DataTables_Table_0_paginate"><a tabindex="0" class="first ui-corner-tl ui-corner-bl fg-button ui-button ui-state-default ui-state-disabled" id="DataTables_Table_0_first">First</a><a tabindex="0" class="previous fg-button ui-button ui-state-default ui-state-disabled" id="DataTables_Table_0_previous">Previous</a>
                                            <span><a tabindex="0" class="fg-button ui-button ui-state-default ui-state-disabled">1</a><a tabindex="0" class="fg-button ui-button ui-state-default">2</a><a tabindex="0" class="fg-button ui-button ui-state-default">3</a><a tabindex="0" class="fg-button ui-button ui-state-default">4</a><a tabindex="0" class="fg-button ui-button ui-state-default">5</a></span><a tabindex="0" class="next fg-button ui-button ui-state-default" id="DataTables_Table_0_next">Next</a><a tabindex="0" class="last ui-corner-tr ui-corner-br fg-button ui-button ui-state-default" id="DataTables_Table_0_last">Last</a></div></div>
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
