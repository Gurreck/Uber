/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class ProyectoEstructurasController implements Initializable {

    @FXML
    private JFXComboBox<?> cmbTipoAlgoritmo;
    @FXML
    private JFXButton btnCalcularRuta;
    @FXML
    private Label lblCostoViaje;
    @FXML
    private JFXButton btnInicioRecorrido;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCalcularRutaOnAction(ActionEvent event) {
    }

    @FXML
    private void btnInicioRecorridoOnAction(ActionEvent event) {
    }
    
}
