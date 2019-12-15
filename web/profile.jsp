<%-- 
    Document   : profile.jsp
    Created on : Dec 11, 2019, 8:32:21 PM
    Author     : DELL
--%>
<c:set var='view' value='/profile' scope='session' />
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
  color : #FFF;
}

.title {
  color: grey;
  font-size: 24px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 50%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
h1 {
  text-align: center;
  text-transform: uppercase;
  color: #4CAF50;
}


body {
  background-color: #222;
}
.plate {
  width: 410px;
  margin: 10% auto;
}
.shadow {
  color: #fff;
  font-family: Arvo;
  font-weight: bold;
  text-shadow:
    -3px -3px 0 #222,
    3px -3px 0 #222,
    -3px 3px 0 #222,
    3px 3px 0 #222,
    4px 4px 0 #fff,
    5px 5px 0 #fff,
    6px 6px 0 #fff,
    7px 7px 0 #fff;
  line-height: 0.8em;
  letter-spacing: 0.1em;
  transform: scaleY(0.7);
  -webkit-transform: scaleY(0.7);
  -moz-transform: scaleY(0.7);
  margin:0;
  text-align: center;
}
.script {
  font-family: "Seaweed Script";
  color: #fff;
  text-align: center;
  font-size: 40px;
  position: relative;
  margin:0;
}
.script span {
  background-color: #222;
  padding: 0 0.3em;
}
.script:before {
  content:"";
  display: block;
  position: absolute;
  z-index:-1;
  top: 50%;
  width: 100%;
  border-bottom: 3px solid #fff;
}
.text1 {
  font-size: 60px;
}
.text2 {
  font-size: 169px;
}
.text3 {
  font-size: 80px;
}

</style>
<div id="container" > 

        <p class="shadow text3">PROFILER</p>
        <br><br> 
    
    <div class="card" style="background-color: #FFF">
        <img src="img/logo.png" alt="John" style="width:100%"><br>
        <h1>${name}</h1><br>
        <p class="title" >CEO & Founder</p>
        <p style="color: #000; size: 22px">HUST</p> 
        <c:choose>
            <c:when test="${isLogin == 1}">
                <a href="addProduct.jsp"><p><button>Add Product</button></p></a>
                <a href="checkOrder.jsp"><p><button>Check order</button></p></a>
            </c:when>
        </c:choose>
        
    </div>
        <br>
    
</div>



