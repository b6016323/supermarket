package com.rhague

class ManagerController {

    def scaffold = Manager
	def login(){}
	def validate(){
		def user = Manager.findByUserName(params.userName)
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
