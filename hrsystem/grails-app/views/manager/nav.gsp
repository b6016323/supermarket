<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'manager.label', default: 'Manager')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/manager/')}"><g:message code="default.home.label"/></a></li>
		<li><g:loginToggle/></li>
            </ul>
        </div>
    </body>
</html>
