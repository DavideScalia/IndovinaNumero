/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.IndovinaNumero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	//ci servirà creare qualche variabile per far funzionare il gioco
	//imposto un numero massimo di tentativi
	private int Tmax = 8;
	//i numeri da uno a 100, final indica che è una costante 
	private final int Nmax = 100;
	//una variabile che tenga traccia di quanti tentativi abbiamo fatti 
	private int NTentativiFatti;
	private int NumeroSegreto;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="NuovaPartita"
    private Button NuovaPartita; // Value injected by FXMLLoader

    @FXML // fx:id="Prova"
    private Button Prova; // Value injected by FXMLLoader

    @FXML // fx:id="txtNmax"
    private TextField txtNmax; // Value injected by FXMLLoader

    @FXML // fx:id="txtProva"
    private TextField txtProva; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisultato"
    private TextArea txtRisultato; // Value injected by FXMLLoader

    @FXML // fx:id="txtTMax"
    private TextField txtTMax; // Value injected by FXMLLoader

    @FXML // fx:id="txtTentativiRImasti"
    private TextField txtTentativiRImasti; // Value injected by FXMLLoader

    @FXML
    void doNuovaPartita(ActionEvent event) {
    	//inizializzare variabili del gioco 
    	this.NTentativiFatti = 0;
    	//restituisce un numero casuale tra 0 e 99, 1 escluso
    	this.NumeroSegreto = (int)(Math.random()*this.Nmax) + 1;
    	
    	

    }

    @FXML
    void doProva(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert NuovaPartita != null : "fx:id=\"NuovaPartita\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Prova != null : "fx:id=\"Prova\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNmax != null : "fx:id=\"txtNmax\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtProva != null : "fx:id=\"txtProva\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTMax != null : "fx:id=\"txtTMax\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTentativiRImasti != null : "fx:id=\"txtTentativiRImasti\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
