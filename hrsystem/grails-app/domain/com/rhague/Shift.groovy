package com.rhague

class Shift {
    String timeOfDay
    String dayOfWeek
    int numberOfHours
    double startingTime
    static hasMany = [employee:Employee,task:Task,team:Team]
    static belongsTo = [Team,Task]
    static constraints = {
        timeOfDay nullable:false, blank:false
        dayOfWeek nullable:false, blank:false, inList:["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
        numberOfHours nullable:false, blank:false, max:24
        startingTime nullable:false, blank:false, range:0..24
    }
}
