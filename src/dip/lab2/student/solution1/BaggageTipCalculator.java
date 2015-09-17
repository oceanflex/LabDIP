/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author zsummers
 */
public class BaggageTipCalculator implements WorkerTipCalculator {
    private ServiceQuality sq;
    private final double MIN_BILL = 0.00;
    private double maxBill = 100.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + maxBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double baseTipPerBag = 0.75;
    private int bagCount;
    
    public BaggageTipCalculator(ServiceQuality q, int bags) {
        this.setServiceQuality(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }
    
    @Override
    public void setServiceQuality(ServiceQuality sq){
        this.sq = sq;
    }
    @Override
    public ServiceQuality getServiceQuality() {
        return this.sq;
    }

    public void setMaxBill(double maxBill) {
        this.maxBill = maxBill;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(sq) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }
    
    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }
    
    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
}
