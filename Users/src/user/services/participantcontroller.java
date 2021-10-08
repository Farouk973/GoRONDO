/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.services;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
//import edu.esprit.entities.Personne;
//import edu.esprit.utils.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import user.entities.participant;
import user.util.MyConnection;
/**
 *
 * @author HP
 */
public class participantcontroller {
    private Connection cnx;
    public participantcontroller (){
        cnx = MyConnection.getMyCnx().getConnection();
    }
    
    
    public void ajouterPersonne (participant p){
        try {
            String req = "INSERT INTO participant (cin,nom,prenom,numtel,adress,mail,mdp,username,date_nai,id_group) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement(req);
            pst.setString(1, p.getCin());
            pst.setString(2, p.getNom());
            pst.setString(3, p.getPrenom());
            pst.setString(4, p.getNumtel());
            pst.setString(5, p.getAdress());
            pst.setString(6, p.getMail());
            pst.setString(7, p.getMdp());
            pst.setString(8, p.getUsername());
            pst.setString(9, p.getDate_nai());
            pst.setString(10, p.getId_group());
            pst.executeUpdate();
            System.out.println("Participant added !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public List<participant> getParticipant(){
        List<participant> participant = new ArrayList<>();
        try {
            String req = "Select * from participant";
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                participant p = new participant(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8),rs.getString(10));
                participant.add(p);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return participant;
    }
    
}
