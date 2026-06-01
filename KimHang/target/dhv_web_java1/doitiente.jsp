<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Chuyen doi tien te</title>
</head>
<body>

<h2>Convert Chuyen doi bat ky loai tien te</h2>

<form action="<%= request.getContextPath() %>/chuyendoi" method="post">
    Enter Amount:
    <input type="text" name="amount">

    <br><br>

    Enter Rate:
    <input type="text" name="rate">

    <button type="submit">Convert</button>
</form>

<%
    Object result = request.getAttribute("result");

    if(result != null){
%>

    <h3>Result: <%= result %></h3>

<%
    }
%>

</body>
</html>