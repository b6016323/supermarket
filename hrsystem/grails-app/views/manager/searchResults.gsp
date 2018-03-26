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
	<h2>Employee Search Results</h2>
	<p>Searched for employees matching <em>${params.fullName}</em>.  Found ${employees.size()} employees.
	<table>
	<g:each var="employee" in="${employees}">
		<tr><td><g:link controller="Employee" action="show" id="${employee.id}">${employee.fullName}</g:link></td></tr>
	</g:each>
	</table>
	<g:link action='managersearch'>New Search</g:link>
    </body>
</html>
