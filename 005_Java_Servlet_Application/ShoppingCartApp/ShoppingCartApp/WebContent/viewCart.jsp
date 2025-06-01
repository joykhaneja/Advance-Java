<%@ page import="com.cart.CartItem" %>
<%@ page import="java.util.*" %>
<%
    List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
    if (cart == null) cart = new ArrayList<>();
%>
<html>
<head><title>Your Cart</title></head>
<body>
<h2>Shopping Cart</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Qty</th><th>Actions</th></tr>
    <% for (CartItem item : cart) { %>
    <tr>
        <form action="CartServlet" method="post">
            <input type="hidden" name="productId" value="<%=item.getProductId()%>" />
            <input type="hidden" name="name" value="<%=item.getName()%>" />
            <td><%=item.getProductId()%></td>
            <td><%=item.getName()%></td>
            <td><input type="number" name="quantity" value="<%=item.getQuantity()%>" /></td>
            <td>
                <button type="submit" name="action" value="update">Update</button>
                <button type="submit" name="action" value="delete">Delete</button>
            </td>
        </form>
    </tr>
    <% } %>
</table>
<a href="index.jsp">Add More Items</a>
</body>
</html>
