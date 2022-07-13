/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ctor.habittracker;

import java.util.ArrayList;
import java.time.LocalDate;
import java.io.Serializable;

/**
 *
 * @author C-Tor
 */
public class Habittracker {
    
    //initialize: set up list/array
    
    GUI gui;
    ArrayList<Habit> habits;
    private Habit currentHabit;
    
    public Habittracker(GUI parentGUI) {
        gui = parentGUI;
        habits = new ArrayList<Habit>();
        
        
        
        //temp, until more habit functionality
        //createHabit("test habit", 2);
        //currentHabit=habits.get(0);
    }
    
    public void initHabits() {
        currentHabit=habits.get(0);
    }
    
    //attempt track
    public boolean attemptTrack() {
        System.out.println("Last track: " + currentHabit.getLastTrack());
        System.out.println("Today: " + LocalDate.now());
        if (!(currentHabit.getLastTrack().equals(LocalDate.now()) ) ) {
            currentHabit.track();
            return true;
        } else {
            System.out.println("Cannot track, already tracked today");
            return false;
        }
    }
    
    public boolean checkTracked() {
        if (!(currentHabit.getLastTrack().equals(LocalDate.now()) ) ) {
            return true;
        } else {
            return false;
        }
    }
    
    //create habit
    public void createHabit(String name, int streak) {
        habits.add(new Habit(name, streak));
    }
    
    //serve data (to GUI)
    public int getHabitStreak() {return currentHabit.getStreak();}
    public String getHabitName() {return currentHabit.getName();}
    
    //check date if same
    
    //read state
    
    //save state
    
    
}
