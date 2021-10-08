/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users.main;


import user.entities.participant;
import user.services.participantcontroller;

/**
 *
 * @author HP
 */
public class Users {
    public static void main(String[] args) {
    
    participantcontroller ps = new participantcontroller();
    participant p = new participant("12345678","farouk", "felfel","12345678","nabeul","farouk@gmail.com","0000","farouk09","gorando");
    //ps.ajouterPersonne1(p);
    System.out.println(ps.getParticipant());
    
}
}
