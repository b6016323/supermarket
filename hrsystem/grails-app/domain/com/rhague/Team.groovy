package com.rhague

class Team {
    ID teamID
    String teamName
    int numberOfEmployees
    Section sectionName
    Section description
    static constraints = {
        teamID nullable:false, blank:false, unique:true
        teamName nullable:false, blank:false
        numberOfEmployees nullable:false, blank:false
        sectionName nullable:false, blank:false
        description nullable:false, blank:false, widget:'textarea'
    }
}
