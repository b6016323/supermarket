<!doctype html>
<html>
	<head>
	<meta name="layout" content="main"/>
	<title>Manager Login - hrsystem</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
	</head>
	<body>
	<g:if test="${flash.message}">
	<div class="message">${flash.message}</div>
	</g:if>
	<g:form action="validate">
	<!--<input type="hidden" name="cName" value="${cName}">
	<input type="hidden" name="aName" value="${aName}">-->
	<table>
	<tr class="prop">
		<td class="userName">
			<label for="userName">Username:</label>
		</td>
		<td class="forminput">
			<input type="text" id="userName" name="userName" value="">
		</td>
	</tr>
	<tr class="prop">
		<td class="password">
			<label for="password">Password:</label>
		</td>
		<td class="forminput">
			<input type="password" id="password" name="password" value="">
		</td>
	</tr>
	<tr class="prop">
		<td class="forminput">
			<input type="submit" value="login">
		</td>
	</tr>
	</table>
	</g:form>
</body>
</html>
