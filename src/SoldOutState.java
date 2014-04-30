/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class SoldOutState implements State {
    
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Je kunt geen kwartje inwerpen, de machine is leeg");
     }

    @Override
    public void ejectQuarter() {
        System.out.println("Je kunt niet uitwerpen, je hebt nog geen kwartje ingeworpen");
    }

    @Override
    public void turnCrank() {
        System.out.println("Je draait, maar er zijn geen kauwgomballen");
    }

    @Override
    public void dispense() {
        System.out.println("Geen kauwgomballen afgegeven");
    }
    
}
