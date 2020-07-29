package mooc.vandy.java4android.buildings.logic;

import java.util.Objects;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       private String mBusinessName;
       private int mParkingSpaces;
       private static int sTotalOffices = 0;
    // TODO - Put your code here.
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
      this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                   int parkingSpaces){
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }

    @Override
    public String toString() {
        String result = "Business: ";
        if(this.getBusinessName()==null) result += "unoccupied ";
        else
            result += this.getBusinessName();
        if(this.getParkingSpaces() !=0) result += "; has " + this.getParkingSpaces() + " parking spaces ";
        return result+ " (total offices: " + sTotalOffices + ")";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office thatoffice = (Office) o;
        if(this.calcBuildingArea() == thatoffice.calcBuildingArea() && this.mParkingSpaces == thatoffice.mParkingSpaces){
            return true;
        }
        return false;
    }

}
