

<%

    session.setAttribute("view", "/viewAddProduct");

    String name = (String) session.getAttribute("name");
    String product_id = (String) session.getAttribute("product_id"); 
    String categoryName = (String) session.getAttribute("categoryName");
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
        <div>
            <h1>&nbsp;&nbsp;&nbsp;<i class="fas fa-box-open"></i>&nbsp; Preview Product</h1><br>
            <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="fas fa-align-left"></i>&nbsp;${name}<h2>
        </div>
    </div>
        
        <div class="one-half" style="background-color: #FFF;"><br><br><br>
        <section class="carousel slide cid-rKpgbVPIfa" data-interval="false" id="slider1-5">



            <div style="padding-left: 20px">
                <div class="mbr-slider slide carousel" data-pause="true" data-keyboard="false" data-ride="carousel"
                    data-interval="1500">
                    <ol class="carousel-indicators">
                        <c:set var="count" scope="request" value="${1}"/>
                        <c:forEach var="img" items="${allImage}">
                            <c:choose>
                                <c:when test="${count==1}">
                                    <li data-app-prevent-settings="" data-target="#slider1-5" class=" active"  data-slide-to="${count}"></li>
                                </c:when>
                                <c:otherwise>
                                    <li data-app-prevent-settings="" data-target="#slider1-5"   data-slide-to="${count}"></li>
                                </c:otherwise>
                            </c:choose>
                            <c:set var="count" scope="request" value="${count+1}" />
                        </c:forEach>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <c:set var="count" scope="request" value="${1}" />
                        <c:forEach var="img" items="${allImage}">

                                <c:choose>
                                    <c:when test="${count==1}"> 
                                                <div class="carousel-item slider-fullscreen-image active" data-bg-video-slide="false"
                                                    style="background-image: url(img/${img});">
                                                    <div class="container container-slide">
                                                        <div class="image_wrapper">
                                                            <div class="mbr-overlay"></div><img src="img/${img}" alt="" >
                                                        </div>
                                                    </div>
                                                </div>

                                    </c:when> 
                                    <c:otherwise>
                                                <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false"
                                                    style="background-image: url(img/${img});">
                                                    <div class="container container-slide">
                                                        <div class="image_wrapper">
                                                            <div class="mbr-overlay"></div><img src="img/${img}" alt="" >
                                                        </div>
                                                    </div>
                                                </div>
                                    </c:otherwise>
                                </c:choose> 
                                <c:set var="count" scope="request" value="${count+1}" />
                        </c:forEach> 
                    </div>
                </div>
            </div>

        </section>
        
    </div>
    <div class="one-half last">
        <ul id="tabify_menu" class="menu_tab" style="margin: 0;">
            <li><a href="#fane1">Product detail</a></li>
        </ul>
        <div id="fane1" class="tab_content">
            
            <h3><i class="fas fa-align-left"></i>&nbsp;Product ID</h3>
            <p>${product_id}</p>
            <h3><i class="fas fa-align-left"></i>&nbsp;Category Name</h3>
            <p>${categoryName}</p>
            
            
            
            <h3><i class="fas fa-align-left"></i>&nbsp;Price</h3>
            <p>$${price}</p>

            <h3><i class="fas fa-align-left"></i>&nbsp;Warranty</h3>
            <p>${warranty}</p>
            <h3><i class="fas fa-align-left"></i>&nbsp;Description</h3>
            <p>${Description}</p>

            <h3><i class="fas fa-align-left"></i>&nbsp;Description detail</h3> 
            <p>${descriptionDetail}</p> 


            <a href="addProductDB" class="button">Add to DB</a>
            <a href="index.jsp" class="button">Back</a>

        </div>
    </div>
    <div style="clear:both; height: 40px"></div>
</div>
<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smoothscroll/smooth-scroll.js"></script>
<script src="assets/dropdown/js/nav-dropdown.js"></script>
<script src="assets/dropdown/js/navbar-dropdown.js"></script>
<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
<script src="assets/theme/js/script.js"></script>
