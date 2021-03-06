package com.rhague

class BootStrap {

    def init = { servletContext ->
/*
	//Create 2 managers
	def mgrPeter = new Manager(
	fullName:'Peter Beardsley',
	userName:'pBeardsley',
	password:'beardsley',
	managerEmail:'pbeardsley@supermarket.com',
	office:'d05',
	department:'Gardening'
	).save()

	def mgrHargis = new Manager(
	fullName:'Paul Hargis',
	userName:'pHargis',
	password:'hargis',
	managerEmail:'phargis@supermarket.com',
	office:'d07',
	department:'Games & Toys'
	).save()

	//Create 2 Teams
	def tmGardeners = new Team(
	teamID: 1,
	teamName:'Gardeners',
	numberOfEmployees: 4,
	sectionName:'Flora',
	description:'Care and maintenance team for flora in store'
	).save(failOnError:true)

	def tmGTStock = new Team(
	teamID:6,
	teamName:'Games and Toys Stock Management',
	numberOfEmployees:2,
	sectionName:'Stock Management',
	description:'Stock management team for all games and toys'
	).save()

	//Create 2 Team Leaders
	def tlGarmo = new TeamLeader(
	fullName:'Daniel Garmo',
    	department:'Gardening',
    	employeeID:'Gar01',
    	sectionName:'Flora',
    	officePhone:01142442444,
    	leaderEmail:'dgarmo@supermarket.com',
    	password:'garmo',
    	manager:mgrPeter,
	team:tmGardeners
	).save()


	def tlFrounar = new TeamLeader(
	fullName:'Frank Frounar',
	department:'Games & Toys',
	employeeID:'Fro65',
	sectionName:'Stock Management',
	officePhone:01142442445,
	leaderEmail:'ffrounar@supermarket.com',
	password:'frounar',
	manager:mgrHargis,
	team:tmGTStock
	).save()

	//Create 2 Shifts
	def shMMorning = new Shift(
	timeOfDay:'Morning',
	dayOfWeek:'Monday',
	numberOfHours:4,
	startingTime:07.00
	).save()

	def shTMorning = new Shift(
	timeOfDay:'Morning',
	dayOfWeek:'Tuesday',
	numberOfHours:4,
	startingTime:07.00
	).save()

	//Create 2 Tasks
	def tsRestock = new Task(
	taskID:18,
	taskName:'Restock',
	numberOfPeople:5,
	sectionName:'All Sections',
	department:'All Departments',
	timeRequired:'1 Hour',
	description:'Restock empty spaces, this task is store wide, employees to restock their own section.',
	taskCompleted:false	
	).save()

	def tsWater = new Task(
	taskID:193,
	taskName:'Water Flora',
	numberOfPeople:1,
	sectionName:'Flora',
	department:'Gardening',
	timeRequired:'30 Minutes',
	description:'Ensure all flora are properly watered, watering directions in flora manual',
	taskCompleted:false
	).save()

	//Create 2 Employees
	def emNagel = new Employee(
	fullName:'Erik Nagel',
	dateOfBirth:new Date('19/09/1982'),
	residence:'Sheffield',
	hourlyRate:8.00,
	employeeID:'Nag19',
	dateEmployed:new Date('05/07/2008'),
	taxCode:'e72',
	contract:'Part-time',
	manager:mgrHargis,
	teamleader:tlFrounar,
	shift:[shMMorning,shTMorning],
	task:tsRestock
	).save(failOnError:true)

	def emHillier = new Employee(
	fullName:'Todd Hillier',
	dateOfBirth:new Date('06/02/1951'),
	residence:'Rotherham',
	hourlyRate:12.00,
	employeeID:'Fez01',
	dateEmployed:new Date('06/02/1971'),
	taxCode:'h8',
	contract:'Full-time',
	manager:mgrPeter,
	teamleader:tlGarmo,
	shift:[shMMorning,shTMorning],
	task:tsWater
	).save(failOnError:true)

	emNagel.addToTeam(tmGTStock)
	emHillier.addToTeam(tmGardeners)
	tsWater.addToTeam(tmGardeners)
	tsRestock.addToTeam(tmGTStock)
	tsWater.addToShift(shMMorning)
	tsWater.addToShift(shTMorning)
	tsRestock.addToShift(shMMorning)
	tsRestock.addToShift(shTMorning)
	tmGTStock.addToShift(shMMorning)
	tmGardeners.addToShift(shMMorning)
	tmGTStock.addToShift(shTMorning)
	tmGardeners.addToShift(shTMorning)
	tsWater.addToEmployee(emHillier)
	tsRestock.addToEmployee(emNagel)*/
    }
    def destroy = {
    }
}
