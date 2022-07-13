/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctor.habittracker;

import java.time.LocalDate;


public class Habit{
	
	
	private int streak;
	private String name;
	private LocalDate lastTracked;
	
	
	public Habit(String name, int streak) {
		this.name=name;
		this.streak=streak;
		this.lastTracked=LocalDate.now();
	}
        
        public Habit(String name, int streak, LocalDate lastTrack) {
		this.name=name;
		this.streak=streak;
		this.lastTracked=lastTrack;
	}
	
	/*
	 * names or renames the habit
	 * @param new habit name
	 * */
	public void setName(String newName) {
		System.out.println(this.name + " renamed to " + newName);
		this.name = newName;
	}
	
	/*
	 * sets the habit's streak to a new value
	 * @param new streak number
	 * */
	public void setStreak(int newStreak) {
		this.streak = newStreak;
		System.out.println("Streak reset to: " + this.streak);
	}
	
	/*
	 * increments the streak by one
	 * */
	private void incStreak() {
		this.streak++;
		System.out.println("Streak incremented to: " + this.streak);
	}
	
	/*
	 * updates Track to be today
	 * */
	public void track() {
		incStreak();
		this.lastTracked = LocalDate.now();
		System.out.println("Changed" + this.name + " habit lastTracked to " + this.lastTracked);
	}
	
	//accessors
	/*
	 * @return current streak
	 * */
	public int getStreak() {
		return this.streak;
	}
	
	/*
	 * @return name of habit
	 * */
	public String getName() {
		return this.name;
	}
	
	public LocalDate getLastTrack() {
		return this.lastTracked;
	}
	
	//methods
	/*
	 * Checks if track is eligible to be done, i.e Hasn't been tracked today.
	 * */
	public boolean checkTrack() {
		return true;
	}
	
}
