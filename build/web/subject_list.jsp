<%-- 
    Document   : subject_list
    Created on : Apr 6, 2019, 2:05:34 PM
    Author     : praka
--%>

<%@page import="java.util.List"%>
<%@page import="my.model.Subjects"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                border: 1px solid black;
                text-align: left;
                padding: 8px;
            }

            th {
                background: cadetblue;
            }

            tr:nth-child(even) {
                background: #cccccc;
            }
        </style>
    </head>
    <body>
        <h1>Subject List</h1>
        <h3>${sessionScope.Users.username} , Add subject you want to register.</h3>
        <br>
        <span style="color: red">${requestScope.message}</span>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>credit</th>
                <th>register</th>
            </tr>
        <%
            List<Subjects> subjects = (List<Subjects>) session.getAttribute("Subjects");
            for(Subjects s : subjects){
        %>
            
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getSubjName() %></td>
                <td><%= s.getCredit() %></td>
                <td>
                    <form action="./AddSubjectServlet" method="POST">
                        <input type="hidden" name="subjectId" value="<%= s.getId()%>">
                        <input type="submit" value="Register">
                    </form>
                </td>
            </tr>
            
        <%
            }
        %>
            
        </table><br>
        <a href="summary.jsp">Summary</a>
    </body>
</html>
