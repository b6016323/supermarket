<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'teamLeader.label', default: 'TeamLeader')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-teamLeader" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <g:include controller="TeamLeader" action="navMenu"/>
<f:table collection="${itemsToShow}" />
</table>
    </body>
</html>
