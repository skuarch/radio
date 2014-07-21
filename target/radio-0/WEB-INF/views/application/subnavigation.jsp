<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="col-lg-12">
    <div class="navbar navbar-default alert-info" role="navigation">        
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><spring:message code="text14"/></a>
        </div>        
        <div class="collapse navbar-collapse navbar-ex1-collapse">

            <form class="navbar-form navbar-right" onsubmit="return cancelFormSubmission();" action="#">
                <div class="form-group">
                    <input id="searchField" type="text" placeholder="<spring:message code="text12"/>" class="form-control input-lg">
                </div>
                <input type="button" class="btn btn-success btn-lg" value="<spring:message code="text13"/>" onclick="search();" />
            </form>

        </div>
    </div>
</div>