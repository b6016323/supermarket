<!doctype html>
<html>
	<head>
	<meta name="layout" content="main"/>
	<title>Manager Login - hrsystem</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
	</head>
	<body>
<a href="#list-manager" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <g:include controller="Manager" action="navMenu"/>
	<div class="mainOption"><g:link controller="TeamLeader" class="create" action="create">Create Team Leader</g:link></div>
	<div class="mainOption"><g:link controller="Team" class="create" action="create">Create Team</g:link></div>
	<div class="mainOption"><g:link controller="Employee" class="create" action="create">Create Employee</g:link></div>
	<div class="mainOption"><g:link controller="Shift" class="create" action="create">Create Shift</g:link></div>
</body>
</html>
