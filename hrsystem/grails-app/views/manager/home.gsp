<!doctype html>
<html>
	<head>
	<meta name="layout" content="main"/>
	<title>Manager Login - hrsystem</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
	</head>
	<body>
<div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
<li><g:loginToggle/></li>
            </ul>
        </div>
	<g:if test="$session.user.getClass() == 'Manager'">
		<div class="mainOption"><g:link controller="TeamLeader" class="create" action="create">Create Team Leader</g:link></div>
	</g:if>
</body>
</html>
