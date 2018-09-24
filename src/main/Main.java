
package main;
import views.Views;
import models.Models;
import controllers.Controllers;


public class Main {

   
    public static void main(String[] args) {
        Views viewbloc = new Views();
        Models modelbloc = new Models();
        Controllers controllerbloc = new Controllers(viewbloc, modelbloc);

    }
    
}
