package uk.sky.kata.fundamentals.inheritance;

public class ManualCar extends Car{

  private int gear = 0;

  private boolean clutchDown = false;

  /**
   * This will replace the method in Car so when an object of ManualCar calls this method, it will use this method as opposed to the one in Car
   */
  @Override
  public void startEngine() {
    System.out.println("Inserting key and turning to start engine");
    System.out.println("Going into gear 1");
    setGear(1);

    //this will do the default behaviour from the parent or super class
    super.startEngine();
  }

  public void moveUpAGear(){
    if (clutchDown){
      gear = gear + 1;
        System.out.println("Moved up to gear " + gear);
    } else {
      System.out.println("Clutch needs to be down first");
    }
  }

  public boolean isClutchDown() {
    return clutchDown;
  }

  public void toggleClutch() {
    this.clutchDown = !clutchDown;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }
}
