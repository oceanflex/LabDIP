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
public class WiaterTipCalculator implements WorkerTipCalculator {
    private ServiceQuality sq;
    
    
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
        return 0;
    }
}
