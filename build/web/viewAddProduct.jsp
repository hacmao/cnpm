

<%

    session.setAttribute("view", "/viewAddProduct");

    String name = (String) session.getAttribute("name");
    String product_id = (String) session.getAttribute("product_id"); 
    String category_id = (String) session.getAttribute("categoryName");
    String price = (String) session.getAttribute("price");
    String Description = (String) session.getAttribute("Description");
    String descriptionDetail = (String) session.getAttribute("descriptionDetail");
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div style="padding-top:50px">
    <div class="one">
        <div class="heading_bg">
            <h2><i class="fas fa-box-open"></i>&nbsp; Preview Product</h2>
        </div>
    </div>
    <div class="one-half"><br>
        <h3><br>${name}</h3>
    </div>
    <div class="one-half last">
        <ul id="tabify_menu" class="menu_tab" style="margin: 0;">
            <li><a href="#fane1">Product detail</a></li>
        </ul>
        <div id="fane1" class="tab_content">
            <h3>Product ID</h3>
            <p>${product_id}</p>
            <h3>Category Name</h3>
            <p>${category_id}</p>

            <h3>Price</h3>
            <p>${price}</p>

            <h3>Description</h3>
            <p>${Description}</p>

            <h3>Description detail</h3> 
            <p>${descriptionDetail}</p> 


            <a href="addProductDB" class="button">Add to DB</a>
            <a href="index.jsp" class="button">Back</a>

        </div>
    </div>
    <div style="clear:both; height: 40px"></div>
</div>

