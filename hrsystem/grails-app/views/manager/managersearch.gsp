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
	<formset>
	<legend>Employee search</legend>
	<table>
		<g:form action="searchResults">
		<tr><td>Name</td><td><g:textField name="fullName"/></td></tr>
		<tr><td>Employee ID</td><td><g:textField name="employeeID"/></td></tr>
		<tr><td>Tax Code</td><td><g:textField name="taxCode"/></td></tr>
		<tr><td>Query:</td><td><g:radioGroup name="qType" labels="['And','Or']" values="['and','or']" value="and">${it.radio} ${it.label}</g:radioGroup></td></tr>
		<tr><td/><td><g:submitButton name="search" value="Search Employees"/></td></tr>
		</g:form>
	</table>
	</formset>
    </body>
</html>
