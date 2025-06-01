<%@ page import="java.sql.*" %>
<html>
<head><title>Admin Panel</title></head>
<body>
<h2>All Feedback Submissions</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Email</th><th>Comments</th><th>Submitted At</th></tr>
<%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/feedback_db", "root", "password@123");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM feedback ORDER BY submitted_at DESC");

        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getString("email") %></td>
        <td><%= rs.getString("comments") %></td>
        <td><%= rs.getTimestamp("submitted_at") %></td>
    </tr>
<%
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        out.println("<p>Error fetching feedback data.</p>");
        e.printStackTrace(out);
    }
%>
</table>
<a href="feedback.jsp">Back to Feedback</a>
</body>
</html>
