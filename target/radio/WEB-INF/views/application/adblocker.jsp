<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.jsp"/>        
        <jsp:include page="metas.jsp"/>
        <jsp:include page="links.jsp"/>
    </head>
    <body>
    <s:include value="/pages/application/navigation.jsp"/>
    <br/>
    <br/>
    <div class="container">
        <div class="row">
            <div class="col-lg-offset-4 col-lg-5">
                <div class="panel">
                    <div class="panel-body">
                        <div class="text-center">
                            <h1><spring:message code="text21"/></h1>
                            <br/>
                            <a class="btn btn-success btn-lg" href="http://hoyradio.com">
                                <spring:message code="text22"/>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>