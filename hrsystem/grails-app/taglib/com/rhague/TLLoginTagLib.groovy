package com.rhague

class TLLoginTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	def TLloginToggle = {
		if(request.getSession(false) && session.user && session.user.getClass() == TeamLeader)
		{
			out <<g.include(action:'additionalNavItems',controller:'TeamLeader')
			out <<"<li><span class='signedInNotification'>Signed in: ${session.user}"
			out <<"<a href='${createLink(controller:'TeamLeader',action:'logout')}'>Logout</a></span></li>"
		}
		else
		{
			if(request.getSession(false) && session.user && session.user.getClass() == Manager)
			{
				out <<""
			}
			else
			{
				out <<"<a href='${createLink(controller:'TeamLeader',action:'login')}'>Login</a>"
			}
		}
	}
}
