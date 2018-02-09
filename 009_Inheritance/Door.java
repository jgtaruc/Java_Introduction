/*
Create a house front door class which inherits from the Door class and open it. 
Assume the house door has a locked doorknob and it swings into the house. 
Hint: Your code should use the super keyword.
*/
public class Door {
    public void open ()
    {
        push();
    }
}

class BankVaultDoor extends Door {

    public void open () {
        enterCombination();
        pull;
    }

}

class HouseFrontDoor extends Door {
    // Your code goes here
    public void open () {
        insertKeyAndTurnKnob();
        super.push();
    }
}