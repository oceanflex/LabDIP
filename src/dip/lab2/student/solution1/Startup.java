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
        WorkerTipCalculator bags = new BagHandlerTipCalculator(ServiceQuality.FAIR, 4);
        WorkerTipCalculator wait = new WaiterTipCalculator(ServiceQuality.GOOD, 45.32);
        
        TipCalculatorService tipService = new TipCalculatorService(bags);
        
        System.out.println(tipService.getTip());
        System.out.println(tipService.getTip(wait));
    }
}
