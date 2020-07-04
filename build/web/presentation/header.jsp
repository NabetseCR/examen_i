<%@page import="examen.logic.Persona"%>
<% Persona usuario = (Persona) session.getAttribute("usuario");  %>
<header>
    <nav id ="navbar">
        <ul> 
            <li>
                <a href="/Examen/presentation/login/show">Inicio</a>
            </li>
            <% if (usuario != null) {%> 
            <li>
                <a  href="/Examen/presentation/user/documentos/show">Documentos</a>
            </li>
            <li >
                <a  href="/Examen/presentation/login/logout">Desconectar</a>
            </li> 
            <li>
                <a  href="#"><%=usuario.getNombre()%></a>
            </li>                
            <% } %>            
        </ul>
    </nav>
    <img src="/Examen/img/header.jpg">
</header> 
