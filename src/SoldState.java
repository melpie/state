/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class SoldState implements State {
    
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wachten a.u.b., de kauwgombal komt eraan");
     }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, je hebt al aan de hendel gedraaid");
    }

    @Override
    public void turnCrank() {
        System.out.println("Tweemaal draaien levert je geen extra kauwgombal op!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oeps, er zijn geen kauwgomballen meer");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
    
}
