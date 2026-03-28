import java.util.ArrayList;

public class ClimbingClub {
    /** The list of climbs completed by members of the club.
    * Guaranteed not to be null. Contains only non-null references.
    */
    
    private ArrayList<ClimbInfo> climbList;
    
    /** Creates a new ClimbingClub object. */
    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }
    
    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
    * @param peakName the name of the mountain peak climbed
    * @param climbTime the number of minutes taken to complete the climb
    */
    public void addClimb(String peakName, int climbTime) { /* to be implemented in part (1) with ClimbInfo objects in alphabetical order by name */
        ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);
        int insertIndex = 0;
        while (insertIndex < climbList.size()) {
            ClimbInfo current = climbList.get(insertIndex);
            int cmp = current.getName().compareToIgnoreCase(peakName);
            if (cmp > 0) {
                break;
            }
            insertIndex++;
        }
        climbList.add(insertIndex, newClimb);
    }
    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames() { /* implementation shown in directions file */
      return -1;
    }

    public String toString() {
        String returner = "";
        for (ClimbInfo climb : climbList) {
            returner += climb.getName() + " (" + climb.getTime() + " min)\n";
        }
        return returner;
    }
}