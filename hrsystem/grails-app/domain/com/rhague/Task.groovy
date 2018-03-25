package com.rhague

class Task {
    int taskID
    String taskName
    int numberOfPeople
    String sectionName
    String department
    String timeRequired
    String description
    boolean taskCompleted
    static hasMany = [employee:Employee,shift:Shift,team:Team]
    static belongsTo = [Employee, Team, Shift]

    String toString()
    {
	return "$taskID - $department - $taskName"
    }

    static constraints = {
        taskID nullable:false, blank:false, unique:true
        taskName nullable:false, blank:false
        numberOfPeople nullable:false, blank:false, min:0
        sectionName nullable:false, blank:false
        department nullable:false, blank:false
        timeRequired nullable:false, blank:false
        description nullable:false, blank:false
        taskCompleted nullable:false, blank:false
    }
}
