package com.placementschedule.placementschedule;

	import java.util.Date;

	public class PlacementSchedule {
	    private Date scheduleDate;
	    private String qualification;
	    private int year;

	    public PlacementSchedule(Date scheduleDate, String qualification, int year) {
	        this.scheduleDate = scheduleDate;
	        this.qualification = qualification;
	        this.year = year;
	    }

	    public Date getScheduleDate() {
	        return scheduleDate;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public int getYear() {
	        return year;
	    }

	    @Override
	    public String toString() {
	        return "PlacementSchedule{" +
	                "scheduleDate=" + scheduleDate +
	                ", qualification='" + qualification + '\'' +
	                ", year=" + year +
	                '}';
	    }
	}

	

