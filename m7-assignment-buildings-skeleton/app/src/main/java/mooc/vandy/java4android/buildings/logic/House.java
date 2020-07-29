package mooc.vandy.java4android.buildings.logic;

import java.security.acl.Owner;
import java.util.Objects;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    // Constructors
    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
    }
    public House(int length, int width, int lotLength, int lotWidth, String Owner){
      this(length, width, lotLength, lotWidth);
      this.mOwner = Owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String Owner, boolean
            pool){
        this(length, width, lotLength, lotWidth, Owner);
        this.mPool = pool;
    }

    // Getter Methods
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }

    // Setter Methods
    public void setOwner(String Owner){
        this.mOwner = Owner;
    }
     public void setPool(boolean pool){
        this.mPool = pool;
     }

    @Override
    public String toString() {
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House secondhouse = (House) o;
        if(secondhouse.calcBuildingArea() == this.calcBuildingArea() && secondhouse.hasPool() == this.hasPool()){
            return true;
        }
        return false;
    }

}
