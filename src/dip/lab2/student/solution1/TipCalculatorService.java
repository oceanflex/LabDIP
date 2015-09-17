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
public class TipCalculatorService {
    private WorkerTipCalculator worker;
    
    /**
     *
     * @param worker
     */
    public TipCalculatorService(WorkerTipCalculator worker){
        this.worker = worker;
    }
    
    public void setWorker(WorkerTipCalculator worker){
        this.worker = worker;
    }
    
    public double getTip(){
        return worker.getTip();
    }
    
    public double getTip(WorkerTipCalculator worker){
        return worker.getTip();
    }
}
