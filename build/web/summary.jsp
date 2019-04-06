<%-- 
    Document   : summary
    Created on : Apr 6, 2019, 2:05:52 PM
    Author     : praka
--%>

<%@page import="java.util.ArrayList"%>
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
                background:  appworkspace;
            }
        </style>
    </head>
    <body>
        <h1>Summary</h1>
        <table style="border: 1px solid black">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>credit</th>
                <th>register</th>
            </tr>
        <%
            ArrayList<Subjects> subjects = (ArrayList<Subjects>) session.getAttribute("registerSubjects");
            for(Subjects s : subjects){
        %>
            
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getSubjName() %></td>
                <td><%= s.getCredit() %></td>
                <td>
                    <form action="./DeleteSubjectServlet" method="POST">
                        <input type="hidden" name="subjectId" value="<%= s.getId()%>">
                        <input type="submit" value="Remove">
                    </form>
                </td>
            </tr>
            
        <%
            }
        %>
        </table>
        <form>
            <button type="submit">Save Registration</button>
        </form>
    </body>
</html>
