package com.company;

public class OpticalDrive {

    // Private Data Member(s)
    private String driveType;
    private String brandOptDrive;
    private boolean isExternal;

    // Class Method(s)
    public boolean changeIsExternal() {
        return false;
    }

    // Class Getters and Setters
    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getBrandOptDrive() {
        return brandOptDrive;
    }

    public void setBrandOptDrive(String brandOptDrive) {
        this.brandOptDrive = brandOptDrive;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }
}
