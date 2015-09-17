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
public class Startup {
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
//    ServiceQuality sq = ServiceQuality.FAIR;
    public static void main(String[] args) {
        WorkerTipCalculator bags = new BaggageTipCalculator(WorkerTipCalculator.ServiceQuality.FAIR, 4);
        WorkerTipCalculator wait = new WaiterTipCalculator(WorkerTipCalculator.ServiceQuality.GOOD, 45.32);
        
    }
}
