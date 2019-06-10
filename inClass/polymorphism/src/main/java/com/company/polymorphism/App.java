package com.company.polymorphism;

public class App {

    public static void main(String[] args) {
        // Use Intellisense to show all the methods and features that you'd expect
        // to see on these objects.
        Developer dev = new Developer();
        TeamLead lead = new TeamLead();
        Architect arch = new Architect();


        // This doesn't work: (dev2.planSprint()) b/c Developer doesn't have a planSprint() method
        Developer dev2 = new TeamLead();
        // You cannot use methods of a child class for a parent class, unless you Type-Cast it
        // This is one way to type-cast
        ((TeamLead)dev2).planSprint();
        
        // This doesn't work b/c Developer doesn't have an evaluateVendor() method
        // dev3.evaluateVendor();
        Developer dev3 = new Architect(); // here dev does not have access to the architect methods because it is a parent of architect
        Architect tempArch = (Architect)dev3; // thus we use type-casting again
        tempArch.evaluateVendor(); // now it has access to the architect methods
        tempArch.planSprint(); // and it still has access to teamlead methods because architect inherits all of teamleads methods



        // This causes a problem b/c TeamLead has more features than Developer so the
        // compiler can't do this conversion for us
        // lead2 = dev2;
        TeamLead lead2;

        // This works b/c the dev2 reference is pointing to a TeamLead.  We constructed
        // a TeamLead object, we just happened to point at it with a Developer reference.
        // Here we have to cast (i.e. tell the compiler how to treat he type of dev2) dev2
        // into a TeamLead type...and everything just works! Note: this is the other way to type-cast
        lead2 = (TeamLead)dev2;
        lead2.planSprint();

        // Interface examples
        SchoolRecord record = new SchoolRecord(); // has access to all methods from Auditable and Storable

        // This works because we can use an interface reference to point to an instance of a class
        // that implements that interface
        Auditable auditableRecord = record; // This will give auditableRecord access to only the auditable methods
        Storable storableRecord = record; // This will give storableRecord access to only the storable methods

    }
}
