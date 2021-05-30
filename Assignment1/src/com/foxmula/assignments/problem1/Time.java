package com.foxmula.assignments.problem1;

class Time {
	private int hour;
	private int minute;
	private int seconds;

	/*
	 * if we don't want to initialize the values at the time of abject creation, we
	 * can make setter methods for all values.
	 */
	Time(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSeconds() {
		return this.seconds;
	}

	void add(Time objTime) {
		int addSeconds = this.getSeconds() + objTime.getSeconds();
		int addMinute = this.getMinute() + objTime.getMinute();
		int addHour = this.getHour() + objTime.getHour();

		if (addSeconds > 60) {
			addMinute += addSeconds / 60;
			addSeconds = addSeconds % 60;
		}
		if (addMinute > 60) {
			addHour += addMinute / 60;
			addMinute = addMinute % 60;
		}

		System.out.println("Added Time is: " + addHour + "H " + addMinute + "M " + addSeconds + "S");
	}
}

