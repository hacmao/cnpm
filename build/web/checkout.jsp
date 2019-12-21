<c:set var='view' value='/checkout' scope='session' />
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function () {
       $("#checkoutForm").validate({
           rules: {
               name: "required",
               email: {
                   required: true,
                   email: true
               },
               phone: {
                   required: true,
                   number: true,
                   minlength: 9
               },
               address: {
                   required: true
               },
               creditcard: {
                   required: true,
                   creditcard: true
               }
           }
       });
    });
</script>
<img src="img/store.jpg" width="20%">
<div>
    <div class="one-half" style="padding-left: 50px;">
        <div class="heading_bg">
        <h2>Checkout</h2>
        </div>
        <p>
        In order to purchase the items in your shopping cart,
        please provide us with the following information:
        </p>
        <c:if test="${!empty orderFailureFlag}">
            <p style="color: #c00; font-style: italic">
                We were unable to process your order. Please try again!
            </p>
        </c:if>
        <form id="checkoutForm" action="<c:url value='purchase' />" method="post">
            <fieldset>
                <label>Name<span class="required">*</span></label>
                <input type="text" name="name" id="name" value="${form.name}" />
            </fieldset>
            <fieldset>
                <label>Email<span class="required">*</span></label>
                <input type="text" name="email" id="email" value="${form.email}" />
            </fieldset>
            <fieldset>
                <label>Phone <span class="required">*</span></label>
                <input type="text" name="phone" id="phone" value="${form.phone}" />
            </fieldset>
            <fieldset>
                <label>Address <span class="required">*</span></label>
                <input type="text" size="45" name="address" id="address" value="${form.address}" />
            </fieldset>
            <fieldset>
                <label>City <span class="required">*</span></label>
                <input type="text" size="45" name="cityRegion" id="cityRegion" value="${form.cityRegion}" />
            </fieldset>
            <fieldset>
                <label>Credit Card Number<span class="required">*</span></label>
                <input type="text" size="45" name="creditcard" id="creditcard" value="${form.ccNumber}" />
            </fieldset>
            <fieldset><br>
                <input value="Submit purchase" class="button white" type="submit">
            </fieldset>
        </form>
    </div>
    <div class="one-half last" style="padding-left: 100px">
        <div class="heading_bg">
            <h2>Order Information</h2>
        </div>
        <p>
            Next-working day delivery is guaranteed<br>
        A
            <fmt:formatNumber type="currency" currencySymbol="&euro; " value="${initParam.deliveryFee}"/>
            delivery surcharge is applied to all purchase orders
        </p>
        <p>
            
        </p>
        <table>
            <th>Total</th>
            <th>Delivery Surcharge</th>
            <th>Credit Total</th>
            <tr>
                <td><fmt:formatNumber type="currency" currencySymbol="&dollar; " value="${cart.subtotal}"/></td>
                <td><fmt:formatNumber type="currency" currencySymbol="&dollar; " value="${initParam.deliveryFee}"/></td>
                <td><fmt:formatNumber type="currency" currencySymbol="&dollar; " value="${cart.subtotal + initParam.deliveryFee}"/></td>
            </tr>
        </table>
    </div>
 <div style="clear:both; height: 40px"></div>
</div> 