<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<div class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="color:white">
                <strong>
                    <spring:message code="text10"/>
                </strong>
            </a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="#"><spring:message code="text11"/></a></li> 
                <li><a href="index.html?lang=es" ><spring:message code="text18"/></a></li> 
                <li><a href="index.html?lang=en" ><spring:message code="text19"/></a></li> 
            </ul>
        </div>
    </div>
</div>