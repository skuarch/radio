<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html><head><jsp:include page="application/links.jsp"/><jsp:include page="application/header.jsp"/><jsp:include page="application/metas.jsp"/></head>
    <body>        
        <div class="container">
            <jsp:include page="application/navigation.jsp" />                    
            <jsp:include page="application/description.jsp" />
            <div class="row">
                <div class="col-lg-4 text-center">
                    <div class="panel panel-default">                        
                        <div class="panel-body text-center">
                            <jsp:include page="application/left-ad.jsp" />
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 text-center">
                    <div class="panel panel-warning">                        
                        <div class="panel-body">
                            <div style="height: 255px; margin: auto; ">
                                <jsp:include page="application/player.jsp"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 text-center">
                    <div class="panel panel-default">                        
                        <div class="panel-body text-center">
                            <jsp:include page="application/right-ad.jsp" />
                        </div>
                    </div>
                </div>
            </div>    
            <div class="row">
                <jsp:include page="application/subnavigation.jsp" />
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">        
                    <div class="panel panel-default _1">                        
                        <div class="_11">
                            <c:import url="application/genreButtons.jsp"/>
                        </div>
                        <div class="_7" id="resultsStations">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="application/footer.jsp"/><div id="modalLoading" class="_8"><div class="_9"><img src="<c:url value="/resources/img/484.GIF"/>" alt="" height="128" width="128"/></div></div> 
        <div class="footer"><div class="container"><p class="text-muted"><br/><spring:message code="text32"/></p></div></div><div class="afs_ads">&nbsp;</div>
        <jsp:include page="application/scripts.jsp" />
    </body>
</html>