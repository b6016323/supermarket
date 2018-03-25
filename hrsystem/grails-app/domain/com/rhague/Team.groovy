package com.rhague

class Team {
    int teamID
    String teamName
    int numberOfEmployees
    String sectionName
    String description
    static hasMany = [shift:Shift,task:Task,employee:Employee]
    //static hasOne = [teamleader:TeamLeader]
    String toString()
    {
	return "$teamID - $teamName"
    }

    static constraints = {
        teamID nullable:false, blank:false, unique:true
        teamName nullable:false, blank:false
        numberOfEmployees nullable:false, blank:false
        sectionName nullable:false, blank:false
        description nullable:false, blank:false, widget:'textarea'
    }
}
