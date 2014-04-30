/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class GumballMachine {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
    State state = soldOutState;
    int count = 0;
    
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }
    
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    void setState(State state) {
        this.state = state;
    }
    
    void releaseBall() {
        System.out.println("Er rolt een kauwgombal door de opening...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
    
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        if (count > 0) {
            return "Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nVoorraad: " + count + " kauwgomballen\nMachine wacht op een kwartje";
        } else{
            return "Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nVoorraad: " + count + " kauwgomballen\nMachine is leeg";
        }
    }
    
    
    
}
