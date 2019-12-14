<%@page import="entity.Category"%>

<%@page   import="java.util.List"%>

<%@page  import="entity.Product"%>

<%

    session.setAttribute("view", "/category");

    Category category = (Category) session.getAttribute("selectedCategory");

%>
 


<div style="padding-left: 150px;">
    <img src="img/store.jpg" width="20%">
    <c:choose>
        <c:when test="${categoryProducts != null}">
            <div class="one">

                <div class="heading_bg">

                    <h1><%=category.getName()%></h1>

                </div>

                <div id="portfolio">

                    <div class="portfolio-container" id="columns">

                        <ul>


                                    <%

                                    List<Product> categoryProducts = (List<Product>) session.getAttribute("categoryProducts");

                                    for (Product p : categoryProducts) {
                                    %>
                                    <li class="one-third" style="box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);padding:25px;">

                                        <p>

                                        <a title="<%=p.getName()%>" href="img/<%=p.getImage()%>" class="portfolio-item-preview" data- rel="prettyPhoto">
                                            <img src="img/<%=p.getImage()%>" alt="" width="250" height="250" class="portfolio-img pretty-box">

                                        </a>

                                        </p>

                                        <h4><a href="product?<%=p.getProductId()%>"><%=p.getName()%></a></h4>
                                        <%  
                                            String des;
                                            if (p.getDescription().length() > 200) {
                                                des = p.getDescription().substring(0, 200);
                                            }
                                            else {
                                                des = p.getDescription(); 
                                                des += "<br><br><br><br>";
                                            } %>
                                        <p align="justify"><%=des%></p>
                                        
                                        
                                        <div class="mbr-section-btn" buttons="0" style="text-align: center; ">
                                            <a class="btn btn-primary display-3" href="product?<%=p.getProductId()%>" class="button_small white">See Details &raquo;</a>
                                        </div>
                                        
                                     

                                    </li>

                                    <% } 
                                    %>

                                

                        </ul>

                    </div>

                </div>

            </div>
        </c:when>
 
        <c:otherwise>
            <br><br>
            <img src ="img/noresult--img.png" width="65%" style="padding:50px;padding-left: 300px">
        </c:otherwise>
    </c:choose>
    <div style="clear:both; height: 40px"></div>

</div>
<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smoothscroll/smooth-scroll.js"></script>
<script src="assets/dropdown/js/nav-dropdown.js"></script>
<script src="assets/dropdown/js/navbar-dropdown.js"></script>
<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
<script src="assets/theme/js/script.js"></script>