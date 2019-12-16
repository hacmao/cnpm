<img src="img/store.jpg" width="20%">
<h1>&nbsp;Order Info </h1>
<style>
table, th, td {
  text-align: center;
}
</style>
<div style="padding-top: 20px;padding-bottom: 200px; padding-left: 20px;padding-right: 20px"> 
    <table>
        <tr>
            <th></th>
            <th> Name</th>
            <th> Credit number</th>
            <th > Confirmation Number  </th>
            <th> Date Created  </th> 
            <th> Product  </th> 
            <th> Amount  </th>
        </tr>
        <c:forEach var="item" items = "${orderInfos}">
            <c:set var="i" scope="request" value="${0}"></c:set>
            
                <tr align="center">
                    <td rowspan="${item.getProducts().size()}" width="10%">
                        <form action="<c:url value='deleteOrder'/>" method="post">
                            <input type="hidden"name="customerId"value="${item.getId()}" />
                            <a href="#"><button>delete</button></a>
                        </form>
                    </td>
                    <td rowspan="${item.getProducts().size()}"  >${item.getName()}</td>
                    <td rowspan="${item.getProducts().size()}" width="15%">${item.getCcNumber()}</td>
                    <td rowspan="${item.getProducts().size()}" width="15%">${item.getConfirmationNumber()}</td>
                    <td rowspan="${item.getProducts().size()}" width="15%">${item.getDateCreated()}</td> 
                    <td>${item.getProducts().get(0)}</td>
                    <td>${item.getAmounts().get(0)}</td>
                </tr>

                <c:set var="i" scope="request" value="${0}"></c:set>  
                <c:forEach var="p" items="${item.getProducts()}"> 
                    <c:if test="${i!=0}">
                        <tr>
                           <td>${item.getProducts().get(i)}</td>
                           <td>${item.getAmounts().get(i)}</td>
                        </tr>
                    </c:if>
                    <c:set var="i" scope="request" value="${i+1}"></c:set>     
                </c:forEach>

            
        </c:forEach>
    </table>
</div>

