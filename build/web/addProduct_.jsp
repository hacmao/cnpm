<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="session_bean.ProductSessionBean" %>
<%@page import="java.util.logging.Logger" %>
<div id="container1">
    <div class="one-half">
        <div class="heading_bg">
            <h2>Preview </h2>
            <%
                String name = (String) request.getParameter("name");
                String price =(String) request.getParameter("price");
                String description = (String) request.getParameter("description");
                String categoryId= (String) request.getParameter("categoryId");
                String information= (String) request.getParameter("information");
                String accessorries = (String) request.getParameter("accessory");
                String warranty = (String) request.getParameter("warranty");
                List<String> allImage = (List<String>) session.getAttribute("allImage");
                if (name!=null && price!=null && categoryId!=null && allImage!=null && allImage.size()!=0){
                    if (description==null) description="";
                    if (information==null) information="";
                    if (accessorries==null) accessorries="";
                    if (warranty==null) warranty="";
            %>
            <div id="">
                <div class="one-half">
                </div>
                <div class="one-half">
                    <ul id="tabify_menu1" class="menu_tab" style="margin: 0;">
                        <li> <a href="#fane1"><%=name%></a> </li>
                    </ul>
                    <div class="tab_content">
                        <div id ="portfolio">
                            <div class ="portfolio-container" id ="colurms">
                                <ul>
                                    <li class="one-third">
                                        <p>
                                            <a title ="<%=name%>" href="" class="portfolio-item-preview" data-rel="prettyPhoto">
                                                <%
                                                    Logger logger= Logger.getLogger("category");
                                                    logger.info("hey"+ allImage.get(0));
                                                %>
                                                <img src ="${initParam.imgPreview}<%=allImage.get(0)%>" height="220px" width="220px" alt="" class="portfolio-img pretty-box">
                                            </a>
                                        </p>
                                        <h4> <a href="#"> <%=name%></a> </h4>
                                        <p> <%=description%></p>
                                        <p style="text-align: left">
                                            <a href="" class="button_small white"> See Details &raquo;</a>
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="one-half">
                    <div class="amazingslider-wrapper" id="amazingslider-wrapper-1" style="display:block;position:relative;max-width:700px;margin:0px auto 98px;">
                        <div class="amazingslider" id="amazingslider-1" style="display:block;position:relative;margin:0 auto;">
                            <ul class="amazingslider-slides" style="display: none;">
                                <%
                                    for (String img : allImage)
                                        if (img != null ){
                                %>
                                <li> <img src="${initParam.imgPreview}<%=img%>"  alt="" title="" width="600px"></li>
                                <%
                                            logger.info(""+ img);
                                        }
                                %>
                            </ul>
                            <ul class="amazingslider-thumbnails" style="display:none;">
                                <%
                                    for (String img : allImage) {
                                %>
                                <li>  <img src="${initParam.imgPreview}<%=img%>" alt="" title=""></li>
                                <%
                                    }
                                %>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="one-half">
                    <ul id="tabify_menu" class="menu_tab" style="margin: 0;">
                        <li> <a href="#fane1">Product Details</a> </li>
                    </ul>
                    <div id="fane1" class="tab_content">
                        <h3> Technical Details</h3>
                        <p>
                            <%=information%>
                        </p>
                        <h3>Accessories</h3>
                        <p><%=accessorries%></p>

                        <h3>Warranty Strategy</h3>
                        <p> <%=warranty%></p>

                        <h3>Price</h3>
                        <p><%=price%> $</p>
                        <p style="text-align:left; margin-right: 16px">
                            <a href="submitproduct" class="button">Add to cart</a>
                        </p>
                    </div>
                </div>
                <div style="clear:both; height: 40px"></div>
            </div>
            <%
            } else {
            %>
            <div><b>Missing information!!</b></div>
            <%
                    name="";
                    price="";
                    accessorries= "";
                    warranty="";
                    description="";
                    information="";
                    categoryId ="";
                }
            %>
        </div>
    </div>
    <div class="one-half last">
        <form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/addproduct" >
            <fieldset>
                <label>Product Name <span class="required">*</span></label>
                <input type="text" name="name" id="Myname" value="<%=name%>" class="text requiredField" required>
            </fieldset>
            <fieldset>
                <label>Price <span class="required">*</span></label>
                <input type="number" step="0.01" name="price" id="myemail" value="<%=price%>" class="text requiredField" required>
            </fieldset>
            <fieldset>
                <label>Description Detail <span class="required">*</span></label>
                <textarea name="description" id="Mymessage" class="text requiredField"> <%=description%> </textarea>
            </fieldset>
            <fieldset>
                <label>Category Id <span class="required">*</span></label>
                <input type="number" name="categoryId" id="Mcs" value="<%=categoryId%>" class="text requiredField" required>
            </fieldset>
            <fieldset>
                <label>Information <span class="required">*</span></label>
                <textarea name="information" id="Mymessage-5" rows="20" cols="30" class="text requiredField"> <%=information%></textarea>
            </fieldset>




            <fieldset>
                <label>Image <span class="required">*</span></label>
                <input type="file" accept="image/vnd.sealedmedia.softseal-jpg" onchange="preview_image(event)" name="image1" id="Myname1" value="" class="text requiredField">
            </fieldset>
            <fieldset>
                <input type="file" name="image2" id="Myname2" onchange="preview_image(event)" value="" class="text requiredField">
            </fieldset>
            <fieldset>
                <input type="file" name="image3" id="Myname3" onchange="preview_image(event)" value="" class="text requiredField">
            </fieldset>
            <fieldset>
                <input type="file" name="image4" id="Myname4" onchange="preview_image(event)" value="" class="text requiredField">
            </fieldset>
            <fieldset>
                <input type="file" name="image5" id="Myname5"onchange="preview_image(event)"  value="" class="text requiredField">
            </fieldset>

            <fieldset>
                <label>Accessory <span class="required">*</span></label>
                <textarea name="accessory" id="Mymessage-11" rows="20" cols="30"  class="text requiredField"><%=accessorries%></textarea>
            </fieldset>
            <fieldset>
                <label>Warranty Strategy <span class="required">*</span></label>
                <textarea name="warranty" id="Mymessage-1" rows="20" cols="30" class="text requiredField"><%=warranty%></textarea>
            </fieldset>
            <input   value="Preview" class="button white" type="submit">
        </form>

        <div style="clear:both; height: 10px"></div>
        <%
            if (name!=null && price!=null && categoryId!=null && allImage!=null && allImage.size()!=0){
        %>
        <form method="post" action="submitproduct" >
            <input  value="Submit " class="button white" type="submit">
        </form>
        <%
            }
        %>
        <div style="clear:both; height: 40px"></div>
    </div>

</div>
