/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 91030418
 */
public class IceCreamQueue {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // queue object
        Queue<Integer> customer = new LinkedList<>();
    
        
        
    // iiner class
        class inner {

            // timer task
            TimerTask task = new TimerTask(){
                public void run() {
                    //customer being served
                    for (int i = 0; i<customer.size(); i++)
                        if (i < 1) {
                            System.out.println("Customer is being served...");
                            customer.remove();
                            System.out.println("Number of customers: " +customer.size());
                        }
                        else if(i == 1){
                            System.out.println("Customer is being served...");
                            customer.remove();
                            System.out.println("All customers have been served.");
                        }
                        else if (i == 0) {
                            System.out.println("There are no customers left.");
                            System.exit(0); 
                        }
                }
            };
        }
            Timer timer = new Timer("Timer");
     
            long delay = 4000L;
            long period = 4000L;
            timer.scheduleAtFixedRate(task, delay, period);
    }
    
}
