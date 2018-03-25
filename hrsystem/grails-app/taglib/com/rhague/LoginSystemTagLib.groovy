package com.rhague

class LoginSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	def loginToggle = {
		out << "<div style='margin:10px 0 30px;' class='printed'>"
		if(request.getSession(false) && session.user)
		{
			out <<"<span>"
			out <<"Signed in: ${session.user}"
			out <<"</span><span>"
			out <<"<a href='${createLink(controller:'Manager',action:'logout')}'>"
			out <<"Logout</a></span>"
		}
		else
		{
			out <<"<span>"
			out <<"<a href='${createLink(controller:'Manager',action:'login')}'>"
			out <<"Login</a></span>"
		}
		out <<	 "</div></br>"
	}
}
