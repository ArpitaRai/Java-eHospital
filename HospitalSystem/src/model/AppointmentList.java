/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpitarai
 */
public class AppointmentList {
    private ArrayList <Appointment> appointment;
        
    public AppointmentList(){
        this.appointment= new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(ArrayList<Appointment> appointment) {
        this.appointment = appointment;
    }
    
    public Appointment addAppointment(){
    Appointment appointmentAdd = new Appointment();
    appointment.add(appointmentAdd);
    return appointmentAdd; 
    }

    public void deleteAppointment(Appointment selectedAppointment) {
        appointment.remove(selectedAppointment);
       
    }
}
