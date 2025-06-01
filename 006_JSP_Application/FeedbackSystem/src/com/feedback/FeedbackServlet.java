package com.feedback;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comments = request.getParameter("comments");

        Feedback feedback = new Feedback(name, email, comments);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/feedback_db", "root", "password@123");

            String sql = "INSERT INTO feedback (name, email, comments) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, feedback.getName());
            stmt.setString(2, feedback.getEmail());
            stmt.setString(3, feedback.getComments());
            stmt.executeUpdate();

            stmt.close();
            conn.close();

            response.sendRedirect("feedback.jsp?success=true");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("feedback.jsp?error=true");
        }
    }
}
