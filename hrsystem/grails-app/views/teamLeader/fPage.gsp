<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'teamLeader.label', default: 'TeamLeader')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
<div class="mainOption"><g:link controller="Task" class="create" action="create">Create Tasks</g:link></div>
	<div class="mainOption"><g:link controller="TeamLeader" action="showItems" id="Task">Show Tasks</g:link></div>
	<div class="mainOption"><g:link controller="TeamLeader" action="showItems" id="Employee">Show Employees</g:link></div>
	<div class="mainOption"><g:link controller="TeamLeader" action="showItems" id="Team">Show Teams</g:link></div>
	<div class="mainOption"><g:link controller="TeamLeader" action="taskSearch" id="Team">Search Tasks</g:link></div>
</body>
</html>
