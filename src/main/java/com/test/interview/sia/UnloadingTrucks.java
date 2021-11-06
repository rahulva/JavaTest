package com.test.interview.sia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class UnloadingTrucks {
	public static Boolean canUnloadAll(Collection<UnloadingTime> unloadingTimes) {
		if (unloadingTimes.size() == 1) {
			return true;
		}
		
//		Iterator<UnloadingTime> iterator = unloadingTimes.iterator();
//		while(iterator.hasNext()) {
//			long val = (iterator.next().getEnd().getTime()
//					- iterator.next().getStart().getTime());
//			if (val <= -1) {
//				return false;
//			}
//		}
		
		
		ArrayList<UnloadingTime> unloadingTimesList = (ArrayList<UnloadingTime>) unloadingTimes;

		for (int i = 0; i <= (unloadingTimesList.size() - 1); i++) {
			long val = (unloadingTimesList.get(0).getEnd().getTime()
					- unloadingTimesList.get(i++).getStart().getTime());
			if (val <= -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

		ArrayList<UnloadingTime> unloadingTimes = new ArrayList<UnloadingTime>();
		unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 19:00"), sdf.parse("03/04/2019 20:30")));
		unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 22:10"), sdf.parse("03/04/2019 22:30")));
		unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 20:30"), sdf.parse("03/04/2019 22:00")));

		System.out.println(UnloadingTrucks.canUnloadAll(unloadingTimes));
	}
}

class UnloadingTime {
	private Date start, end;

	public UnloadingTime(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return this.start;
	}

	public Date getEnd() {
		return this.end;
	}
}