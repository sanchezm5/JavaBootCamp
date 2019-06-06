package com.company.interfaces;

public interface Auditable {

    public void runAudit();
    public void sendReportToState();

    // Method written in both interfaces
    public void sameMethod();
}
