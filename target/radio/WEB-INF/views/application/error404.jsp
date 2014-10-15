<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>    
        <meta http-equiv="refresh" content="1; url=http://hoyradio.com/">
        <jsp:include page="header.jsp"/>
        <jsp:include page="links.jsp"/>
        <jsp:include page="metas.jsp"/>      
    </head>
    <body>

        <!-- Fixed navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#" style="color:white">
                        <strong>
                            Hoy Radio
                        </strong>
                    </a>
                </div>
                <div class="navbar-collapse collapse">                    
                </div><!--/.nav-collapse -->
            </div>
        </div>


        <div style="margin: auto; width: 250px; text-align: center; color: white; padding: 50px">            
            <h1>404 page not found</h1>
        </div>

    </body>
</html>
