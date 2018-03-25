<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'manager.label', default: 'Manager')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
<div class="mainOption"><g:link controller="TeamLeader" class="create" action="registration">Create Team Leader</g:link></div>
	<div class="mainOption"><g:link controller="Team" class="create" action="create">Create Team</g:link></div>
	<div class="mainOption"><g:link controller="Employee" class="create" action="create">Create Employee</g:link></div>
	<div class="mainOption"><g:link controller="Shift" class="create" action="create">Create Shift</g:link></div>
	<div class="mainOption"><g:link controller="Team" class="view" action="view">View Teams</g:link></div>
</body>
</html>
