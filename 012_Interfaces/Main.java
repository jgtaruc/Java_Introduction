interface Animal {
    public boolean feed(boolean timeToEat);
    public void groom();
    public void pet();
}

class Dog implements Animal {
    public boolean feed(boolean timeToEat) {
      // pour food into bowl
      return true;
    }
    public void groom() {
      // brush well
    }
    public void pet() {
      // pet cautiously
    }
}

class Gorilla implements Animal {
    boolean feed(boolean timeToEat) {
        // give banana
        return true;
    }
    public void groom() {
        // be careful
    }
    public void pet() {
        // be extra careful
    }
}