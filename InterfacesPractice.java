// Create a gorilla class which implements the Animal interface.

interface Animal {
    bool feed(bool timeToEat);
    void groom();
    void pet();
}

class Giraffe implements Animal {
    bool feed(bool timeToEat) {
      // point to the trees
      return true;
    }
    void groom() {
      // get a ladder
      // brush well
    }
    void pet() {
      // get a ladder
      // pet cautiously
    }
}

class Tiger implements Animal {
    bool feed(bool timeToEat) {
      // toss raw meat into cage
      return true
    }
    void groom() {
      // tranquilize
      // brush well
    }
    void pet() {
      // DO NOT PET
    }
}

class Gorilla implements Animal {
    bool feed(bool timeToEat) {
      // bamboo shoots and fruit salad
      return true
    }
    void groom() {
      // hose down
      // brush well
    }
    void pet() {
      // only pet with adult supervision
    }
}
