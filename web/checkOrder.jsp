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
            <th></th>
            <th> Status</th>
            <th> Name</th>
            <th> Credit number</th>
            <th > Confirmation Number  </th>
            <th> Date Created  </th> 
            <th> Product  </th> 
            <th> Amount  </th>
        </tr>
        <c:if test="${size != null}">
            <c:forEach var="item" items = "${orderInfos}">
                <c:set var="i" scope="request" value="${0}"></c:set>

                    <tr align="center">


                        <td rowspan="${item.getProducts().size()}" width="5%">
                        <form action="<c:url value='deleteOrder'/>" method="post">
                            <input type="hidden" name="customerId" value="${item.getId()}" />
                            <a href="deleteOrder"><button>del</button></a>
                        </form>
                    </td>
                <form action="updateOrder" method="post">
                    <td rowspan="${item.getProducts().size()}" width="2%">
                        <input type="hidden" name="customerId" value="${item.getId()}" />
                        <button>upd</button> 
                    </td>
                    <td rowspan="${item.getProducts().size()}" width="2%">
<!--                            <input type="text" style="text-align: center" value="${item.getStatus()}" name="status"/>
                        -->
                        <select name="status">
                            <c:choose>
                                <c:when test="${item.getStatus()== 'confirm'}">
                                    <option value="confirm" selected="true">confirm</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="confirm">confirm</option>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${item.getStatus()== 'prepare'}">
                                    <option value="prepare" selected="true">prepare</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="prepare">prepare</option>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${item.getStatus()== 'wrap'}">
                                    <option value="wrap" selected="true">wrap</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="wrap">wrap</option>
                                </c:otherwise>
                            </c:choose>
                            <c:choose>
                                <c:when test="${item.getStatus()== 'done'}">
                                    <option value="done" selected="true">done</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="done">done</option>
                                </c:otherwise>
                            </c:choose>

                        </select>
                    </td>

                </form>
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
        </c:if>
    </table>
</div>
<div style="padding-bottom: 150px"></div>
