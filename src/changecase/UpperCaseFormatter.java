/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecase;

/**
 *
 * @author zsummers
 */
public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String changeCase(String str){
        return str.toUpperCase();
    }
}
