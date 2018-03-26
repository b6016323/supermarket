package com.rhague

class TeamLeaderController {

    def scaffold = TeamLeader
	def login(){}
	def validate(){
		def user = TeamLeader.findByLeaderEmail(params.email)
		if(user && user.leaderEmail == params.email)
		{
			session.user = user
			render view:'index'
		}
		else
		{
			flash.message = "Email invalid."
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
		render "<li><a href='${createLink(action:'taskSearch',controller:'Team Leader')}'>Task Search</a></li>"
	}
	def frontLoggedIn()
	{
		def currUser = session.user
		if(currUser.getClass() == TeamLeader)
		{
			render view:'fPage'
		}
		else
		{
			if(session.user.getClass() == Manager)
			{
			render "You must be a Team Leader to access this area"
			}
			else
			{
			render view:'login'
			}
		}
	}

	def showItems()
	{
		def theName = 'com.rhague.'+params.id
		Class classToGet = grailsApplication.getDomainClass(theName).clazz

		List itemsInClass
		itemsInClass = classToGet.list()
		
		render(view:'listView',model:[itemsToShow:itemsInClass])
	}
	def taskSearch(){
	
		}
		def searchResults(){
			def taskProps = Task.metaClass.properties*.name
			def tasks = Task.withCriteria{
				params.each{field,value->
						if(taskProps.grep(field)&&value){
							ilike(field,value)
						}
				}
			}
			return [tasks:tasks]
		}
}
