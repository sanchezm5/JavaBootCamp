package com.company;

// TeamLead is the derived class (child) of the base class (parent)
// TeamLead will inherit from Developer
public class TeamLead extends Developer {

    // Constructor
    public TeamLead() {
        super();
        System.out.println("TeamLead constructor");
    }

    public TeamLead(String name) {
        super(name);
        System.out.println("Team LEad constructor with name");
    }

    public void planProject() {

    }

    public void assignWork() {
        // this method call comes from the Developer class
        givesEstimate();
    }
}
