package com.cart;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        String productId = request.getParameter("productId");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        switch (action) {
            case "add":
                boolean exists = false;
                for (CartItem item : cart) {
                    if (item.getProductId().equals(productId)) {
                        item.setQuantity(item.getQuantity() + quantity);
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    cart.add(new CartItem(productId, name, quantity));
                }
                break;

            case "update":
                for (CartItem item : cart) {
                    if (item.getProductId().equals(productId)) {
                        item.setQuantity(quantity);
                        break;
                    }
                }
                break;

            case "delete":
                cart.removeIf(item -> item.getProductId().equals(productId));
                break;
        }

        response.sendRedirect("viewCart.jsp");
    }
}
