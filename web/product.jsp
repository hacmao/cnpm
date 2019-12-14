<%@page import="entity.Product"%>

<%@page   import="java.util.List"%>

<%@page  import="entity.ProductDetail"%>
<script src="js/jquery.tools.min.js"></script>

<%

    session.setAttribute("view", "/product");

    Product selectedProduct = (Product) session.getAttribute("selectedProduct");
    ProductDetail selectedProductDetail = (ProductDetail) session.getAttribute("selectedProductDetail");
%>
 
 
<div style="padding-left: 80px"> 
    <img src="img/store.jpg" width="20%">
    <br><br><br>

    <div class="one">
        <div class="heading_bg">
            <h2><%=selectedProduct.getName()%></h2>
        </div>
    </div><br><br><br>
    <div class="one-half">
        <section class="carousel slide cid-rKpgbVPIfa" data-interval="false" id="slider1-5">



            <div >
                <div class="mbr-slider slide carousel" data-pause="true" data-keyboard="false" data-ride="carousel"
                    data-interval="1500">
                    <ol class="carousel-indicators">
                        <c:set var="count" scope="request" value="${1}"/>
                        <c:forEach var="img" items="${selectedProductDetail.getAllImages()}">
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
                        <c:forEach var="img" items="${selectedProductDetail.getAllImages()}">

                                <c:choose>
                                    <c:when test="${count==1}"> 
                                                <div class="carousel-item slider-fullscreen-image active" data-bg-video-slide="false"
                                                    style="background-image: url(img/${img}>);">
                                                    <div class="container container-slide">
                                                        <div class="image_wrapper">
                                                            <div class="mbr-overlay"></div><img src="img/${img}" alt="" >
                                                        </div>
                                                    </div>
                                                </div>

                                    </c:when> 
                                    <c:otherwise>
                                                <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false"
                                                    style="background-image: url(img/${img}>);">
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

        <!--<ul>
            
                <% for (String img : selectedProductDetail.getAllImages()) { %>
                    <li><a title="amazing shop" href="img/<%=img%>" class="portfolio-item-preview" data- rel="prettyPhoto"><img src="img/tn-<%=img%>" width="60" height="60" alt="" class="portfolio-img pretty-box"/></a></li>
                <% } %>
        </ul> -->
        
    </div>
    <div class="one-half last">
        <ul id="tabify_menu" class="menu_tab" style="margin: 0;">
            <li><a href="#fane1">Product Details</a></li>
        </ul>
        <div id="fane1" class="tab_content">
            <i class="fas fa-align-left"></i>
            <span style="font-size: 25px">Technical Details</span>
            <p align="justify"><%=selectedProductDetail.getInformation()%></p>
            
            <i class="fas fa-align-left"></i>
            <span style="font-size: 25px">Warranty</span>
            <p><%=selectedProductDetail.getGuaranty()%></p>
            
            <i class="fas fa-align-left"></i>
            <span style="font-size: 25px">Price</span>
            <p><%=selectedProduct.getPrice()%> $</p>
            <p style="text-align:left; margin-right: 16px">
                <a href="addToCart?${selectedProduct.productId}" class="button">Add to cart</a>
            </p>
        </div>
    </div>
    <div style="clear:both; height: 40px"></div>
    <br><br><br><br>
</div>

<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smoothscroll/smooth-scroll.js"></script>
<script src="assets/dropdown/js/nav-dropdown.js"></script>
<script src="assets/dropdown/js/navbar-dropdown.js"></script>
<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
<script src="assets/theme/js/script.js"></script>