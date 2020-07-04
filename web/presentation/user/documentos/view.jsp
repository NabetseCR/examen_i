<%@page import="java.util.ArrayList"%>
<%@page import="examen.logic.Documento"%>
<%@page import="examen.presentation.documentos.Model"%>

<%
    Model model = (Model) request.getAttribute("model");
    ArrayList<Documento> documentos = model.getDocumentos();
    ArrayList<Documento> adquiridos = model.getDocumentosAd();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="/presentation/head.jsp" %>
        <title>Documentos</title>
    </head>
    <body>
        <%@ include file="/presentation/header.jsp" %>
        <h1>Documentos</h1><br>
        <p>
            Por favor seleccione el tipo de documento que desea y luego presione "Ir".
            Una vez elegido el documento, por favor presione el boton agregar.
        </p><br>
        <form name="form" action="/Examen/presentation/user/documentos/filter" method="post" >
            <table style="border:1px solid black;margin-left:auto;margin-right:auto; width: 35%; background: lightblue;"> 
                <tr>
                    <td>Tipo de Documento </td>
                    <td>
                        <select name="tipo">
                            <option value="001">Personas Juridicas</option>
                            <option value="002">Bienes Inmuebles</option>
                            <option value="003">Bienes Muebles</option>
                            <option value="004">Catastro</option>
                            <option value="005">Placas</option>
                            <option value="006">Propiedad Intelectual</option>
                            <option value="007">Alerta Registral</option>
                        </select>
                    </td>
                    <td> <input type="submit" value="Ir" /></td>
                </tr>
            </table>
        </form>
            <br><br>
            <table style="border:1px solid black;margin-left:auto;margin-right:auto; width: 35%; background: lightblue;"> 
                <tbody>
                <tr>
                    <td>Documento</td>
                    <td>Precio</td>
                    <td>Agregar</td>
                </tr>
                <% for (Documento c : documentos) {%>
                <tr> 
                    <td><%=c.getDescripcion()%> </td>  
                    <td><%=c.getMonto()%></td> 
                    <td>
                        <a href="/Examen/presentation/user/documentos/add?idFld=<%=c.getId()%>">
                            <img src="/Examen/img/agregar.jpg">
                        </a>
                    </td>
                </tr>              
                <%}%>
                </tbody>
            </table>
            <br>
            <h1>Mis Documentos</h1><br>
        <p>
            Este es el detalle de sus documentos.Recuerde que puede agregar otros o aumentar la cantidad de
            uno volviendo a agregarlo
        </p><br>
        <table style="border:1px solid black;margin-left:auto;margin-right:auto; width: 35%; background: lightblue;"> 
                <tbody>
                <tr>
                    <td>Descripcion</td>
                    <td>Monto</td>
                    <td>Timbres</td>
                    <td>Cantidad</td>
                    <td>Monto Total</td>
                </tr>
                <% for (Documento c : adquiridos) {%>
                <tr> 
                    <td><%=c.getDescripcion()%> </td>  
                    <td><%=c.getMonto()%></td> 
                    <td><%=c.getTimbre()%></td>
                    <td><%=model.getCantidad(c.getId())%></td>
                    <td><%=model.getMonto(c.getId())%></td>
                </tr>
                <%}%>
                <tr>
                    <td>Total</td>
                    <td><%= model.getTotal()%> </td>
                </tr>
                </tbody>
            </table>
    </body>
</html>
