
/**
 * 
 * The Interface PositionIF holds an enumeration with the possible Directions 
 * 			and turnings given the initial Direction.
 *
 */


public interface PositionIF {

		  
		 public enum Direction {

		  N {
		   @Override
		   public Direction right() {
		    return E;
		   }
		   @Override
		   public Direction left() {
		    return W;
		   }
		  },

		  E {
		   @Override
		   public Direction right() {
		    return S;
		   }
		   @Override
		   public Direction left() {
		    return N;
		   }
		  },

		  S {
		   @Override
		   public Direction right() {
		    return W;
		   }
		   @Override
		   public Direction left() {
		    return E;
		   }
		  },

		  W {
		   @Override
		   public Direction right() {
		    return N;
		   }
		   @Override
		   public Direction left() {
		    return S;
		   }
		  };

		  public abstract Direction right();

		  public abstract Direction left();
		  
		 }
		 
		 public Direction getDirection();
		 
		 @Override
		 public String toString();
}
