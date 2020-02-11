package easy;

import java.util.Arrays;

class Interval{
	int start;
	int end;
	Interval() {
		start =0;
		end =0;
	}
	Interval(int s,int e) {
		start =s;
		end =e;
	}
}
public class MeetingRooms {
	public static void main(String[] args) {
		
        Interval itInterval1 = new Interval(0,30);
        Interval itInterval2 = new Interval(5,10);
        Interval itInterval3 = new Interval(15,20);
        Interval[] intervals = {itInterval1,itInterval2,itInterval3};
        System.out.println(canAttendMeetings(intervals));
        
        Interval itInterval11 = new Interval(7,10);
        Interval itInterval12 = new Interval(2,4);
       
        Interval[] intervals2 = {itInterval11,itInterval12};
        System.out.println(canAttendMeetings(intervals2));
	}
	public static boolean canAttendMeetings(Interval[] intervals) {
	
	    for(Interval i:intervals) {
	    	System.out.println(i.start+" "+i.end);
	    }
	    int[] starts = new int[intervals.length];
	    int[] end = new int[intervals.length];
	    
	    for(int i=0;i<intervals.length;i++) {
	    	starts[i] = intervals[i].start;
	    	end[i] = intervals[i].end;
	    }
	    Arrays.sort(starts);
	    Arrays.sort(end);
	    
	    for(int i=0;i<starts.length-1;i++) {
	    	if(starts[i+1] < end[i]) {
	    		return false;
	    	}
	    }
		return true;	
	}
}
