/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class NoQuarterState implements State {
    
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Je hebt een kwartje ingeworpen");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Je hebt geen kwartje ingeworpen");
    }

    @Override
    public void turnCrank() {
        System.out.println("Je draait maar er is geen kwartje");
    }

    @Override
    public void dispense() {
        System.out.println("Je moet eerst betalen");
    }   
    
}
