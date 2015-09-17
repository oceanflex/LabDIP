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
public class WaiterTipCalculator implements WorkerTipCalculator {
    private ServiceQuality sq;

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    private final double MIN_BILL = 0.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill;
    
    public WaiterTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }
    
    @Override
    public void setServiceQuality(ServiceQuality sq){
        this.sq = sq;
    }
    @Override
    public ServiceQuality getServiceQuality() {
        return this.sq;
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(sq) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }
    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
}
