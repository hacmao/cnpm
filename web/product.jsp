<%@page import="entity.Product"%>

<%@page   import="java.util.List"%>

<%@page  import="entity.ProductDetail"%>
<script src="js/jquery.tools.min.js"></script>

<%    session.setAttribute("view", "/product");

    Product selectedProduct = (Product) session.getAttribute("selectedProduct");
    ProductDetail selectedProductDetail = (ProductDetail) session.getAttribute("selectedProductDetail");
%>
<c:choose>
    <c:when test="${selectedProduct == null}">
        <div style="padding-left: 150px;">
            <img src="img/store.jpg" width="20%">




            <br><br>
            <img src ="img/noresult--img.png" width="65%" style="padding:50px;padding-left: 300px">


            <div style="clear:both; height: 40px"></div>

        </div>
    </c:when>
    <c:otherwise>
        <c:choose> 
            <c:when test="${isLogin != '1'}">
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
    
                        <% for (String img : selectedProductDetail.getAllImages()) {%>
                            <li><a title="amazing shop" href="img/<%=img%>" class="portfolio-item-preview" data- rel="prettyPhoto"><img src="img/tn-<%=img%>" width="60" height="60" alt="" class="portfolio-img pretty-box"/></a></li>
                        <% }%>
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
                            <c:choose>
                                <c:when test="${selectedProductDetail.getQuantity() != 0}">
                                    <i class="fas fa-align-left"></i>
                                    <span style="font-size: 25px">Product Left</span>
                                    <p><%=selectedProductDetail.getQuantity()%> items</p>
                                </c:when>
                                <c:otherwise>
                                    <i class="fas fa-align-left"></i>
                                    <span style="font-size: 25px">Product Left</span>
                                    <br><span style="color:red">Sold out<br></span><br>
                                    </c:otherwise>
                                </c:choose>
                            <i class="fas fa-align-left"></i>
                            <span style="font-size: 25px">Product Selled</span>
                            <p><%=selectedProductDetail.getNumSelled()%> items</p>

                            <i class="fas fa-align-left"></i>
                            <span style="font-size: 25px">Price</span>
                            <p><%=selectedProduct.getPrice()%> $</p>
                            <p style="text-align:left; margin-right: 16px">
                                <c:choose>
                                    <c:when test="${selectedProductDetail.getQuantity() == 0}" >
                                        <button class="button" disabled>Add to cart</button>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="addToCart?${selectedProduct.productId}" class="button">Add to cart</a>
                                    </c:otherwise>
                                </c:choose>
                            </p>
                        </div>
                    </div>
                    <div style="clear:both; height: 40px"></div>
                    <br><br><br><br>
                </div>
            </c:when>
            <c:otherwise>
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
    
                        <% for (String img : selectedProductDetail.getAllImages()) {%>
                            <li><a title="amazing shop" href="img/<%=img%>" class="portfolio-item-preview" data- rel="prettyPhoto"><img src="img/tn-<%=img%>" width="60" height="60" alt="" class="portfolio-img pretty-box"/></a></li>
                        <% }%>
                </ul> -->

                    </div>
                    <div class="one-half last">
                        <ul id="tabify_menu" class="menu_tab" style="margin: 0;">
                            <li><a href="#fane1">Product Details</a></li>
                        </ul>
                        <form action="updateProduct" method="post">
                            <div id="fane1" class="tab_content">
                                <i class="fas fa-align-left"></i>
                                <span style="font-size: 25px">Technical Details</span>
                                <textarea  name="info" cols="40" rows="20"  >
                                    <%=selectedProductDetail.getInformation()%>
                                </textarea>
                                <i class="fas fa-align-left"></i>
                                <span style="font-size: 25px">Warranty</span>
                                <p><input type="text" value="<%=selectedProductDetail.getGuaranty()%>" name="warranty"/></p>

                                <i class="fas fa-align-left"></i>
                                <span style="font-size: 25px">Product Left</span>
                                <p><input type="text" value="<%=selectedProductDetail.getQuantity()%>" name="quantity" />items</p>

                                <i class="fas fa-align-left"></i>
                                <span style="font-size: 25px">Product Selled</span>
                                <p><input type="text" value="<%=selectedProductDetail.getNumSelled()%>" name="numSelled" /> items</p>

                                <i class="fas fa-align-left"></i>
                                <span style="font-size: 25px">Price</span>
                                <p><input type="text" value="<%=selectedProduct.getPrice()%>" name="price" /></p>
                                <p style="text-align:left; margin-right: 16px">
                                    <a href="addToCart?${selectedProduct.productId}" class="button">Add to cart</a>
                                    <button class="button">Update</button>
                                    <a href="deleteProduct" class="button">Delete</a><br>
                                    <c:if test="${deleteErr != null}">
                                        <span style="color: red">* cannot delete beacause this product is in order.</span>
                                    </c:if>
                                    <%
                                        session.setAttribute("deleteErr", null);
                                    %>
                                </p>
                            </div>
                        </form>
                    </div>
                    <div style="clear:both; height: 40px"></div>
                    <br><br><br><br>
                </div>
            </c:otherwise>
        </c:choose>
    </c:otherwise>
</c:choose>
<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smoothscroll/smooth-scroll.js"></script>
<script src="assets/dropdown/js/nav-dropdown.js"></script>
<script src="assets/dropdown/js/navbar-dropdown.js"></script>
<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
<script src="assets/theme/js/script.js"></script>