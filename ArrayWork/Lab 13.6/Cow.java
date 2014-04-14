public class Cow extends Critter {
  private int age;
  private int flowerseaten;
  public Cow(Color color) {
    super(color);
    age = 0;
    flowerseaten = 0;
  }
  
  public void processActors(ArrayList<Actor> actors) {
    if(actors.size() != 0) {
      for(Actor other : actors) {
        if(other instanceof Flower) {
          other.removeSelfFromGrid();
          flowerseaten ++;
        } else if (other instanceOf MosquitoEgg) {
          other.removeSelfFromGrid();
        }
        
      }
      
    }
    age ++;
  }
  
  public Location selectMoveLocation(ArrayList<Location> locs) {
    if(age % 3 == 1) {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }
    else
      return null;
  }
}
