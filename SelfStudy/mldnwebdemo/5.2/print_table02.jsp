<html>
    <head>
        <title>高端培训</title>
    </head>
    <body>
        <table border="1" width="100%">
        <%
            int rows = 10;
            int cols = 10;
            for (int x = 0; x < rows; x++) {
        %>
            <tr>
        <%
                for(int y = 0; y < cols; y++) {
        %>
                <td><%=(x * y)%></td>
        <%
                }
        %>
            </tr>
        <%
            }
        %>
        </table>
    </body>
</html>