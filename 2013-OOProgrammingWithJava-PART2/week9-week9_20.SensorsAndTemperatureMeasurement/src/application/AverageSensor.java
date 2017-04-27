/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sameerkhan
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> reading;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.reading = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    @Override
    public boolean isOn() {
        boolean allON = false;
        
        for(Sensor i : this.sensors) {
            if(i.isOn()) {
                allON = true;
            } else {
                allON = false;
            }
        }
        
        return allON;
    }

    @Override
    public void on() {
        for(Sensor i : this.sensors) {
            i.on();
        }
    }

    @Override
    public void off() {
        for(Sensor i : this.sensors) {
            i.off();
        }
    }

    @Override
    public int measure() {
        if(this.sensors.size() == 0 || this.isOn() == false) {
            throw new IllegalStateException();
        }
        
        int count = 0; 
        int ave = 0; 
        int sum = 0;
        
        for(Sensor i : this.sensors) {
            count++;
            sum += i.measure();
        }
        
        ave = sum/count;
        this.reading.add(ave);
        
        return ave;
    }
    
    public List<Integer> readings() {
        return this.reading;
    }
    
}
