package com.company;

public class Processor {

    // Private Data Members
    private String brandProcessor;
    private String model;

    // Class Method(s)
    public String updateModel(String newModel) {
        return newModel;
    }

    // Class Getters and Setters
    public String getBrandProcessor() {
        return brandProcessor;
    }

    public void setBrandProcessor(String brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
