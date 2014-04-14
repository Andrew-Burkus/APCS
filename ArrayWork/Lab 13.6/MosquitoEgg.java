public class MosquitoEgg extends Actor {
  private int lifespan;
  
  public MosquitoEgg() {
    lifespan = 0;
  }
  
  public void act() {
    if(lifespan == 6) {
      Mosquito mos = new Mosquito();
      mos.putSelfInGrid(getGrid(), getLocation());
      removeSelfFromGrid();
    }
    lifespan ++;
  }
}
