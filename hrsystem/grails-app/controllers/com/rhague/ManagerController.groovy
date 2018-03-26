package com.rhague

class ManagerController {

    def scaffold = Manager
	def login(){}
	def validate(){
		def user = Manager.findByUserName(params.userName)
		if(user && user.password == params.password)
		{
			session.user = user
			render view:'index'
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
	def navMenu(){
		render view:'nav'
	}
	def additionalNavItems(){
		render "<li><a href='${createLink(action:'registration',controller:'Manager')}'>Registration</a></li><li><a href='${createLink(action:'assignments',controller:'Manager')}'>Assignments</a></li>"
	}
	def registration()
	{
		render view:'registration'
	}
	def assignments()
	{
		render view:'teamassignment'
	}
	def frontLoggedIn()
	{
		def currUser = session.user
		if(session.user.getClass() == Manager)
		{
			render view:'fPage'
		}
		else
		{
			if(currUser.getClass() == TeamLeader)
			{
			render "You must be a Manager to access this area"
			}
			else
			{
			render view:'login'
			}
		}
	}
	def assignToTeam()
	{
		def empToAssign = Employee.findByEmployeeID(params.Employee)
		def teamToAssign = Team.findByTeamID(params.Team.toInteger())
		teamToAssign.addToEmployee(empToAssign).save(flush:true)
		empToAssign.addToTeam(teamToAssign).save(flush:true)
		render view:'teamassignment'
	}
}
