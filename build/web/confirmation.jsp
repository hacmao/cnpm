<div style="padding-top: 50px">
    <div class="one" style="padding-left: 20px">

        <h2>Confirmation</h2>
        <p id="confirmationText" style="background-color: #e2e1eb; padding-left: 40px">
            <strong>Your order has been successful processed and will be delivery within 24 hours.</strong>
            <br />
            <br /> Please keep note of your confirmation number :
            <strong>${orderRecord.confirmationNumber}</strong>
            <br> If you have any query concerning your order, feel free to contact us.
            <br><br> Thank you for your shopping at Apple Store! See you soon!
        </p>
    </div>
    <div class="two-third" style="width: 50%">
        <div class="heading_bg">
            <h2>Order Summary</h2>
        </div>
        <table>
            <th>PRODUCT</th>
            <th>QUANTITY</th>
            <th>PRICE</th>
            <c:forEach var="orderedProduct" items="${orderedProducts}" varStatus="iter">
                <tr>
                    <td>
                        ${products[iter.index].name}
                    </td>
                    <td>
                        ${orderedProduct.quantity}
                    </td>
                    <td>
                        <fmt:formatNumber type="currency" currencySymbol="&dollar; " value="${products[iter.index].price * orderedProduct.quantity}" />
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="2"><strong>Delivery Surcharge:</strong></td>
                <td>
                    <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${initParam.deliveryFee}" />
                </td>
            </tr>
            <tr>
                <td colspan="2"><strong>Credit Total:</strong></td>
                <td>
                    <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${orderRecord.amount}" />
                </td>
            </tr>
            <tr>
                <td colspan="3"><strong>Date Processed:</strong> ${orderRecord.dateCreated}</td>
            </tr>
        </table>
    </div>
    <div class="two-third last" style="padding-right:40px;width: 30%">
        <div class="heading_bg">
            <h3>
                Delivery Address
            </h3>
        </div>
        <table>
            <tr>
                <td colspan="3">
                    ${customer.name}
                    <br> ${customer.address}
                    <br>
                    city ${customer.cityRegion}
                    <br>
                    <hr>
                    <strong>Email :</strong> ${customer.email}
                    <br>
                    <strong>Phone:</strong> ${customer.phone}
                </td>
            </tr>
        </table>
    </div>
    <div style="clear:both; height: 40px"></div>
</div>
                <div style="padding-bottom: 100px"></div>