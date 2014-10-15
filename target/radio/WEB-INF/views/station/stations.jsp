<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script type="text/javascript">eval(${js});</script>
<div class="_7">    
    <div class="row">
        <c:choose>
            <c:when test="${stations.size() > 0}">
                <a class="btn btn-primary btn-lg btn-block" onclick="moreStations();">
                    <spring:message code="text6"/>
                </a>
                <br/>
                <c:forEach items="${stations}" var="s">
                    <div class="col-lg-4 alert alert-success text-center _6" onclick="playStation('${s.urlStreaming}', 'play', ${s.type.id}, '${s.name}');">
                        <span class="_2">
                            ${s.name}
                        </span>
                        <br/>
                        <span class="_4">
                            ${s.genre.name}
                        </span>
                        -
                        <span class="_4">
                            ${s.language.name}
                        </span>
                    </div>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <a class="btn btn-success btn-lg btn-block" onclick="backTopStations();">
                    <spring:message code="text17"/>
                </a>
                <br>    
                <div class="alert alert-info">
                    <spring:message code="text4" />
                </div>   
            </c:otherwise>    
        </c:choose>
    </div>
</div>