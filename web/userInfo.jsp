<img src="img/store.jpg" width="20%">
<h1>&nbsp;User Info </h1>
<div style="padding-top: 20px;padding-bottom: 200px; padding-left: 20px;padding-right: 20px">
    <table style="text-align: center">
        <tr>
            <th> </th>
            <th>Name</th>
            <th>Password</th>
            <th>Info</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr style="text-align: center">
                <td style="width: 10%">
                    <form action="checkUserOrder" method="get">
                        <input type="text" value="${user.getName()}" name="userName" hidden/>
                        <button>check order</button>
                    </form>
                </td>
                <td style="text-align: center">
                    ${user.getName()}
                </td>
                <td style="text-align: center">${user.getPassword()}</td>
                <td style="text-align: center">${user.getInfo()}</td>
            </tr>
        </c:forEach>
    </table>

</div>
<div style="padding-bottom: 100px"></div>