<html>
<head><title>Feedback Form</title></head>
<body>
<h2>Submit Feedback</h2>

<% if ("true".equals(request.getParameter("success"))) { %>
    <p style="color:green;">Feedback submitted successfully!</p>
<% } else if ("true".equals(request.getParameter("error"))) { %>
    <p style="color:red;">There was an error. Try again.</p>
<% } %>

<form action="FeedbackServlet" method="post">
    Name: <input type="text" name="name" required><br/>
    Email: <input type="email" name="email" required><br/>
    Comments:<br/>
    <textarea name="comments" rows="4" cols="30" required></textarea><br/>
    <input type="submit" value="Submit Feedback">
</form>

<a href="admin.jsp">Admin Panel</a>
</body>
</html>
