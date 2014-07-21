<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script type="text/javascript">eval(${js});</script>
<div class="_7">
    <div class="row">
        <a class="btn btn-success btn-lg btn-block" onclick="moreStations();">
            <spring:message code="text15"/>
        </a>
    </div>
    <div class="row">
        <c:choose>
            <c:when test="${fs.size() <= 0}">
                <br>
                <div class="alert alert-info">
                    <spring:message code="text4" />
                </div>    
            </c:when>
            <c:otherwise>
                <br>
                <c:forEach items="${fs}" var="s">                    
                    <div class="col-lg-4 alert alert-success text-center _6" onclick="playStation('${s.urlStreaming}', 'play', ${s.type.id}, '${s.name}');">
                        <span class="_2">
                            ${s.name}
                        </span>
                        <br>
                        <span class="_4">
                            ${s.genre.name}
                        </span>
                        <br>
                        <span class="_4">
                            ${s.language.name}
                        </span>
                    </div>
                </c:forEach>>            
            </c:otherwise>
        </c:choose>
    </div>    
</div>