package com.rhague

class TeamLeaderController {

    def scaffold = TeamLeader
	def login(){}
	def validate(){
		def user = TeamLeader.findByUserName(params.userName)
		if(user && user.password == params.password)
		{
			session.user = user
			render view:'home'
		}
		else
		{
			flash.message = "Username or password invalid."
			render view:'login'
		}
	}
	def logout(){
		session.user = null
		redirect(uri:'/')
	}
}
