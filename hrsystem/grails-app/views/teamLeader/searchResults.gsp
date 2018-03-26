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
	<h2>Task Search Results</h2>
	<p>Searched for tasks matching <em>${params.taskName}</em>.  Found ${tasks.size()} employees.
	<table>
	<g:each var="task" in="${tasks}">
		<tr><td><g:link controller="Task" action="show" id="${task.id}">${task.taskName}</g:link></td></tr>
	</g:each>
	</table>
	<g:link action='taskSearch'>New Search</g:link>
    </body>
</html>
