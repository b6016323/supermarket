package com.rhague

class Shift {
    String timeOfDay
    String dayOfWeek
    int numberOfHours
    double startingTime
    static constraints = {
        timeOfDay nullable:flase, blank:false
        dayOfWeek nullable:flase, blank:false, inList:["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
        numberOfHours nullable:flase, blank:false, max:24
        startingTime nullable:flase, blank:false, range:0..24
    }
}
