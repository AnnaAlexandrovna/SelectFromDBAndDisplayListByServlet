<%@ page import="WorkWithDB.ContentOfDB" %>
<%@ page import="java.util.List" %>
<%@ page import="WorkWithDB.MadeTree" %><%--
  Created by IntelliJ IDEA.
  User: Candidate
  Date: 7/22/2019
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Path</title>
</head>
<body>
Hi!

<%
    List<MadeTree> listOfContentOfDB = (List<MadeTree>) request.getAttribute("dataFromDB");
    for (MadeTree contentOfDB:listOfContentOfDB )
    {
%>
<p>
<%--<%=contentOfDB.getItemID()%>
 <%=contentOfDB.getParentID()%>
--%>
<ul>
    <li><%=contentOfDB.getText()%> </li>
<%--<li><%=contentOfDB.printAll()%></li>--%>
</ul>
</p>

<%
}
%>
</body>
</html>
