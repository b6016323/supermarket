<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'manager.label', default: 'Manager')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-manager" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <g:include controller="Manager" action="navMenu"/>
	
<!--  this shows the managers
        <div id="list-manager" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${managerList}" />

            <div class="pagination">
                <g:paginate total="${managerCount ?: 0}" />
            </div>
        </div>-->
    </body>
</html>
