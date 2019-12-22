<script src="js/jquery.tools.min.js"></script>

<script>
    $(function() {
        $("#prod_nav ul").tabs("#panes > div", {
            effect: 'fade',
            fadeOutSpeed: 400
        });
    });
</script>
<script>
    $(document).ready(function() {
        $(".pane-list li").click(function() {
            window.location = $(this).find("a").attr("href");
            return false;
        });
    });
</script>
<!--lol-->
<c:set var='view' value='/index' scope='session' />
<div style="padding:5px"></div>
<section class="cid-qTkA127IK8 mbr-fullscreen mbr-parallax-background" id="header2-1">
    <div class="container align-center">
        <div class="row justify-content-md-center">
            <div class="mbr-white col-md-10">
                <h1 class="mbr-section-title mbr-bold pb-3 mbr-fonts-style display-1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome</h1>

                <p class="mbr-text pb-3 mbr-fonts-style display-7">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To Apple Store</p>
                <!--<div class="mbr-section-btn"><a class="btn btn-md btn-secondary display-4" href="https://mobirise.com">LEARN MORE</a> 
                    <a class="btn btn-md btn-white-outline display-4" href="https://mobirise.com">l</a></div>-->
            </div>
        </div>
    </div>
    <div class="mbr-arrow hidden-sm-down" aria-hidden="true">
        <a href="#next">
            <i class="mbri-down mbr-iconfont"></i>
        </a>
    </div>
</section>

<section class="carousel slide cid-rKpgbVPIfa" data-interval="false" id="slider1-5">
    <div class="full-screen">
        <div class="mbr-slider slide carousel" data-pause="true" data-keyboard="false" data-interval="4000">
            <ol class="carousel-indicators">
                <li data-app-prevent-settings="" data-target="#slider1-5" class=" active" data-slide-to="1"></li>
                <c:set var="countProduct" scope="request" value="${2}" />
                <c:forEach var="product" items="${bestProducts}">
                    <li data-app-prevent-settings="" data-target="#slider1-5" data-slide-to="${countProduct}"></li>
                    <c:set var="countProduct" scope="request" value="${countProduct+1}" />
                </c:forEach>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="carousel-item slider-fullscreen-image active" data-bg-video-slide="false" style="background-image: url(assets/images/background3.jpg);">
                    <div class="container container-slide">
                        <div class="image_wrapper">
                            <div class="mbr-overlay" style="opacity: 0.4;"></div><img src="assets/images/background3.jpg" alt="" title="">
                            <div class="carousel-caption justify-content-center">
                                <div class="col-10 align-center">
                                    <h2 class="mbr-fonts-style display-1">OUR BEST SELLER</h2>
                                    <p class="lead mbr-text mbr-fonts-style display-5">The goal of Apple is not to make money but to make really nice products, really great products</p>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <c:forEach var="product" items="${bestProducts}">
                    <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${initParam.imgProductPath}${product.getImage()});">
                        <div class="container container-slide">
                            <div class="image_wrapper" style="width: 100%">
                                <div class="mbr-overlay"></div><img src="${initParam.imgProductPath}${product.getImage()}" alt="" title="">
                                <div class="carousel-caption justify-content-center">
                                    <div class="col-10 align-center">
                                        <h2 class="mbr-fonts-style display-1">${product.getName()}</h2>
                                        <p class="lead mbr-text mbr-fonts-style display-5"></p>
                                        <div class="mbr-section-btn" buttons="0"><a class="btn btn-success display-4" href="product?${product.productId}">MORE INFO</a> <a class="btn  btn-white-outline display-4" href="addToCart?${product.productId}">BUY NOW</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
            <a data-app-prevent-settings="" class="carousel-control carousel-control-prev" role="button" data-slide="prev" href="#slider1-5"><span aria-hidden="true" class="mbri-left mbr-iconfont"></span><span class="sr-only">Previous</span></a>
            <a data-app-prevent-settings="" class="carousel-control carousel-control-next" role="button" data-slide="next" href="#slider1-5"><span aria-hidden="true" class="mbri-right mbr-iconfont"></span><span class="sr-only">Next</span></a>
        </div>
    </div>

</section>
<section class="carousel slide cid-rKpgbVPIfa" data-interval="false" id="slider2-5">
    <div class="full-screen">
        <div class="mbr-slider slide carousel" data-pause="true" data-keyboard="false" data-interval="4000">
            <ol class="carousel-indicators">
                <li data-app-prevent-settings="" data-target="#slider2-5" class=" active" data-slide-to="1"></li>
                <c:set var="countProduct" scope="request" value="${2}" />
                <c:forEach var="product" items="${newProducts}">
                    <li data-app-prevent-settings="" data-target="#slider2-5" data-slide-to="${countProduct}"></li>
                    <c:set var="countProduct" scope="request" value="${countProduct+1}" />
                </c:forEach>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="carousel-item slider-fullscreen-image active" data-bg-video-slide="false" style="background-image: url(assets/images/background3.jpg);">
                    <div class="container container-slide">
                        <div class="image_wrapper">
                            <div class="mbr-overlay" style="opacity: 0.4;"></div><img src="assets/images/background3.jpg" alt="" title="">
                            <div class="carousel-caption justify-content-center">
                                <div class="col-10 align-center">
                                    <h2 class="mbr-fonts-style display-1">OUR NEWEST PRODUCT</h2>
                                    <p class="lead mbr-text mbr-fonts-style display-5">The goal of Apple is not to make money but to make really nice products, really great products</p>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <c:forEach var="product" items="${newProducts}">
                    <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${initParam.imgProductPath}${product.getImage()});">
                        <div class="container container-slide">
                            <div class="image_wrapper" style="width: 100%">
                                <div class="mbr-overlay"></div><img src="${initParam.imgProductPath}${product.getImage()}" alt="" title="">
                                <div class="carousel-caption justify-content-center">
                                    <div class="col-10 align-center">
                                        <h2 class="mbr-fonts-style display-1">${product.getName()}</h2>
                                        <p class="lead mbr-text mbr-fonts-style display-5"></p>
                                        <div class="mbr-section-btn" buttons="0"><a class="btn btn-success display-4" href="product?${product.productId}">MORE INFO</a> <a class="btn  btn-white-outline display-4" href="addToCart?${product.productId}">BUY NOW</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>

            </div>
            <a data-app-prevent-settings="" class="carousel-control carousel-control-prev" role="button" data-slide="prev" href="#slider2-5"><span aria-hidden="true" class="mbri-left mbr-iconfont"></span><span class="sr-only">Previous</span></a>
            <a data-app-prevent-settings="" class="carousel-control carousel-control-next" role="button" data-slide="next" href="#slider2-5"><span aria-hidden="true" class="mbri-right mbr-iconfont"></span><span class="sr-only">Next</span></a>
        </div>
    </div>

</section>
<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smoothscroll/smooth-scroll.js"></script>
<script src="assets/dropdown/js/nav-dropdown.js"></script>
<script src="assets/dropdown/js/navbar-dropdown.js"></script>
<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
<script src="assets/theme/js/script.js"></script>