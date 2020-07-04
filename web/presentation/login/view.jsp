<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="examen.presentation.login.Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <%@ include file="/presentation/head.jsp" %>
    </head>
    <body >

        <%@ include file="/presentation/header.jsp" %>

        <% Model model = (Model) request.getAttribute("model"); %>
        <% Map<String, String> errores = (Map<String, String>) request.getAttribute("errores"); %>
        
        <div style="width:50%; margin:auto;">
            <form name="form" action="/Examen/presentation/login/login" method="post" > 
                <table  class="table letras" style="border:1px solid black;margin-left:auto;margin-right:auto; width: 50%;">
                    <tr>
                        <td colspan="2" bgcolor="black"><h2 style="color:white;">Login</h2></td>
                    </tr>
                    <tr>
                        <td>Correo Electronico</td>
                        <td><input  placeholder="Correo del usuario" type="text" name="correoFld" required = ""></td>
                    </tr>
                    <tr>
                        <td>Clave</td>
                        <td><input placeholder="Clave del usuario" type="password" name="claveFld" required = ""></td>
                    </tr>
                    <tr>
                        <td colspan="2" ><button  style="margin-bottom: 15px">Ingresar</button> </td>
                    </tr>
                </table>
            </form>
        </div>
        <%@ include file="/presentation/footer.jsp" %>                  
    </body>
</html>
 
