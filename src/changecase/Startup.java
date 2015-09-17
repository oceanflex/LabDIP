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
public class Startup {
    public static void main(String[] args) {
        TextFormatter formatter = new TitleCaseFormatter();
        FormatService service = new FormatService(formatter);
        String result = service.changeCase("Hello World.");
        System.out.println(result);
    }
}
