package com.rhague

class Shift {
    String timeOfDay
    String dayOfWeek
    int numberOfHours
    double startingTime
    static hasMany = [task:Task,team:Team]
    static belongsTo = [Team,Task,Employee]
    String toString()
    {
	return "$dayOfWeek : $timeOfDay"
    }
    static constraints = {
        timeOfDay nullable:false, blank:false
        dayOfWeek nullable:false, blank:false, inList:["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
        numberOfHours nullable:false, blank:false, max:24
        startingTime nullable:false, blank:false, min:0d, max:24d
    }
}
