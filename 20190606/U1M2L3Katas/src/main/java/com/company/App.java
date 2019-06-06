package com.company;

public class App {

    // TV: Create a method called createTV which takes in no arguments and returns a TV object with the below values:
    // - manufacturer - "Zenith" - model - "U2121H" - screenSize - 83 - channel - "NBC" - volume - 55 - powered - false
    public static TV createTV() {
        return new TV("Zenith", "U2121H", 83, "NBC", 55, false);
    }

    // Radio: Create a method called createRadio which takes in no arguments and returns a Radio object with the
    // below values: - manufacturer - "Sony" - model - "V32" - numSpeaker - 2 - station - "WUNV" - volume - 30 - powered - true
    public static Radio createRadio() {
        return new Radio("Sony", "V32", 2, "WUNV", 30, true);
    }

    // Microwave: Create a method called createMicrowave which takes in no arguments and returns a Microwave object
    // with the below values: - manufacturer - "Haier" - model - "X1200w" - secondsLeft - 45 - time - "12:00" - running - false
    public static Microwave createMicrowave() {
        return new Microwave("Haier", "X1200w", 45, "12:00", false);
    }

    // CoffeeMaker: Create a method called createCoffeeMaker which takes in no arguments and returns a CoffeeMaker object
    // with the below values: - manufacturer - "Sunbeam" - model - "C12" - carafeSize - 12 - cupsLeft - 8 - powered - true
    public static CoffeeMaker createCoffeeMaker() {
        return new CoffeeMaker("Sunbeam", "C12", 12, 8, true);
    }

    // Car: Create a method called createCar which takes in no arguments and returns a Car object with the below values:
    // - make - "Honda" - model - "Accord" - type - "Sedan" - color - "Blue" - engine - "2.6L V6" - transmission - "CVT"
    // - numDoors - 4 - mpg - 31.7 - milesDriven - 25218
    public static Car createCar() {
        return new Car("Honda", "Accord", "Sedan", "Blue", "2.6L V6", "CVT", 4, 31.7, 25218);
    }

    // ComputerMouse: Create a method called createComputerMouse which takes in no arguments and returns a ComputerMouse
    // object with the below values: - manufacturer - "Razer" - model - "Naga" - xPosition - 960 - yPosition - 540 -
    // lastClickedLocation - [0,0]
    public static ComputerMouse createComputerMouse() {
        int[] array = {0, 0};
        return new ComputerMouse("Razer", "Naga", 960, 540, array);
    }
}
