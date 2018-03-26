package com.rhague

class LoginSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	def loginToggle = {
		if(request.getSession(false) && session.user && session.user.getClass() == Manager)
		{
			out <<g.include(action:'additionalNavItems',controller:'Manager')
			out <<"<li><span class='signedInNotification'>Signed in: ${session.user}"
			out <<"<a href='${createLink(controller:'Manager',action:'logout')}'>Logout</a></span></li>"
		}
		else
		{
			if(request.getSession(false) && session.user && session.user.getClass() == TeamLeader)
			{
				out <<""
			}
			else
			{
				out <<"<a href='${createLink(controller:'Manager',action:'login')}'>Login</a>"
			}
		}
	}
}
