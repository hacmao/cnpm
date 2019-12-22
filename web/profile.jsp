<c:set var='view' value='/profile' scope='session' />
<link class="jsbin" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
<script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>
<style>
    article, aside, figure, footer, header, hgroup, 
    menu, nav, section { display: block; }
</style>

<div style="padding-left: 80px"> 
    <img src="img/store.jpg" width="20%">
    <div style="padding-bottom: 20px"></div>
    <div class="one">
        <div class="heading_bg">
            <h2>Profiler</h2><hr>
        </div>
    </div><br><br><br><br>

    <form action="updateProfile" method="post" enctype="multipart/form-data">
        <div class="one-half" width="60%">
            <c:choose>
                <c:when test="${user == null or user.getImg() == null}">
                    <img src="img/none.jpg" id="blah" width="300" height="300"><br><br>
                    <input type='file' onchange="readURL(this)" name="img" id="Myname1" />
                </c:when>
                <c:otherwise>
                    <img name="img" id="blah" src="img/user/${user.getImg()}" width="300" height="300"><br><br>
                    <input type='file' onchange="readURL(this);" name="img" id="Myname1"/>
                </c:otherwise>
            </c:choose><br>
        </div>
        <div class="one-half last" style="width: 50%">
            <strong>Name : </strong><br>
            <span><input type="text" name="username" value= "${user.getName()}"></span><br>

            <strong>Password : </strong><br>
            <input type="password" name="password" value="${user.getPassword()}"><br>
            <strong> Information : </strong><br>
            <span> <textarea cols="40" rows="5" name="info" placeholder="${user.getInfo()}"></textarea></span><br><br>
            <input type="submit" value="Update">
        </div>
    </form>
    
    <div style="padding-bottom: 400px; padding-left: 80px"></div>            
            <hr>
    <c:if test="${isLogin=='1'}">
        <strong>Admin functions : </strong><br>
        <a href="addProduct.jsp"><button> Add product</button></a>
        <a href="checkOrder"><button> Check Order</button></a> 
        <a href="userInfo"><button>User Info</button></a>
    </c:if>
    <c:if test="${isLogin=='2'}">
        <strong>User functions : </strong><br>
        <a href="checkUserOrder"><button> Check Order</button></a>
    </c:if>    


</div>

<div style="padding-bottom: 100px"></div>
<script>
    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah')
                        .attr('src', e.target.result)
                        .width(300)
                        .height(300);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }
</script>