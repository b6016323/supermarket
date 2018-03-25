<!doctype html>
<html>
	<head>
	<meta name="layout" content="main"/>
<g:set var="entityName" value="${message(code: 'employee.label', default: 'Employee')}" />
	<title>Manager Login - hrsystem</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
	</head>
	<body>
<a href="#list-manager" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <g:include controller="Manager" action="navMenu"/>
	Team assignment
	<g:form name="teamAssignment" action="assignToTeam">
	Assign <g:select name="Employee" from="${com.rhague.Employee.list()}" optionKey="employeeID"/>
	To <g:select name="Team" from="${com.rhague.Team.list()}" optionKey="teamID"/>
	<input type="submit" value="Assign to Team">
	</g:form>
</body>
</html>
