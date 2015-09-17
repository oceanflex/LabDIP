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
public interface WorkerTipCalculator {
    public double getTip();
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    public void setServiceQuality(ServiceQuality sq);
    public double getServiceQuality();
    
}
