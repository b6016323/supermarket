<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket hrsystem</title>
</head>
<body>
    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Supermarket hrsystem</h1>
<!--remove this section when advanced is done-->
            <div id="controllers" role="navigation">
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
<!--end of removed section-->
        </section>
    </div>

</body>
</html>
