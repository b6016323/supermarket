<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'manager.label', default: 'TeamLeader')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-manager" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <g:include controller="TeamLeader" action="navMenu"/>
	<formset>
	<legend>Task search</legend>
	<table>
		<g:form action="searchResults">
		<tr><td>Name</td><td><g:textField name="taskName"/></td></tr>
		<tr><td>Employee ID</td><td><g:textField name="sectionName"/></td></tr>
		<tr><td>Tax Code</td><td><g:textField name="numberOfPeople"/></td></tr>
		<tr><td/><td><g:submitButton name="search" value="Search Tasks"/></td></tr>
		</g:form>
	</table>
	</formset>
    </body>
</html>
