<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">eval(${js});</script>
<c:forEach items="${stations}" var="s">
    <a class="btn btn-warning btn-block btn-sm" href="javascript:;" onclick="playStation('${s.urlStreaming}', 'play', ${s.type.id},'${s.name}');">    
        ${s.name}
    </a>
</c:forEach>