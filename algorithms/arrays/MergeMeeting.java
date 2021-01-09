package algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeMeeting {
  static List<Meeting> meetingList = new ArrayList(Arrays.asList(new Meeting(2, 3), Arrays.asList(6, 9)));

  public static void main(String[] args) {
    mergeMeetings(meetingList);
  }

  private static List<Meeting> mergeMeetings(List<Meeting> meetings) {
    List<Meeting> sortedList = new ArrayList<>();

    for (Meeting meeting : meetings) {
      Meeting m = new Meeting(meeting.getStartTime(), meeting.getEndTime());
      sortedList.add(m);
    }

    Collections.sort(sortedList, (o1, o2) -> o1.getStartTime() - o2.getStartTime());

    List<Meeting> mergedMeetings = new ArrayList<>();
    mergedMeetings.add(sortedList.get(0));

    for (Meeting currentMeeting : sortedList) {
      Meeting lastMerged = mergedMeetings.get(mergedMeetings.size() - 1);

      if (currentMeeting.getStartTime() <= lastMerged.getEndTime()) {
        lastMerged.setEndTime(Math.max(currentMeeting.getEndTime(), lastMerged.getEndTime()));
      } else {
        mergedMeetings.add(currentMeeting);
      }
    }
    return mergedMeetings;
  }
}

class Meeting {
  private int startTime;
  private int endTime;

  public Meeting(int startTime, int endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public int getEndTime() {
    return endTime;
  }

  public void setEndTime(int endTime) {
    this.endTime = endTime;
  }
}
