package com.rhague

class LoginSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	def loginToggle = {
		out << ""
		if(request.getSession(false) && session.user)
		{
			out <<g.include(action:'additionalNavItems',controller:'Manager')
			out <<"<li><span class='signedInNotification'>Signed in: ${session.user}"
			out <<"<a href='${createLink(controller:'Manager',action:'logout')}'>Logout</a></span></li>"
		}
		else
		{
			out <<"<a href='${createLink(controller:'Manager',action:'login')}'>Login</a>"
		}
		out <<	 ""
	}
}
