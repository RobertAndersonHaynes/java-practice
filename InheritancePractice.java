//  Create a house front door class which inherits from the Door class and open it. Assume the house door has a locked doorknob and it swings into the house.

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

    public void open () {
      insertKey();
      super.open();
    }
}
