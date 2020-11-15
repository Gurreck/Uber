/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.una.uber.Vertice;

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
    @FXML
    private JFXButton btAvCal8;
    @FXML
    private JFXButton btAvCal2;
    @FXML
    private JFXButton btAvCal3;
    @FXML
    private JFXButton btCorreo1;
    @FXML
    private JFXButton btValle1;
    @FXML
    private JFXButton btAvGon4;
    @FXML
    private JFXButton btAvGon3;
    @FXML
    private JFXButton btAvGon2;
    @FXML
    private JFXButton btAvGon1;
    @FXML
    private JFXButton btAvCal1;
    @FXML
    private JFXButton btCalle42;
    @FXML
    private JFXButton btCalle62;
    @FXML
    private JFXButton btCalle81;
    @FXML
    private JFXButton btCalle82;
    @FXML
    private JFXButton btCalle101;
    @FXML
    private JFXButton btCalle102;
    @FXML
    private JFXButton btCalle61;
    @FXML
    private JFXButton btCon61;
    @FXML
    private JFXButton btInter1;
    @FXML
    private JFXButton btAvCal10;
    @FXML
    private JFXButton btAvCal9;
    @FXML
    private JFXButton btAvCal7;
    @FXML
    private JFXButton btAvCal6;
    @FXML
    private JFXButton btAvCal5;
    @FXML
    private JFXButton btAvCal4;
    @FXML
    private JFXButton btCalle41;
    @FXML
    private JFXButton btCalle43;
    @FXML
    private JFXButton btCalle44;
    @FXML
    private JFXButton btCalle64;
    @FXML
    private JFXButton btCalle87;
    @FXML
    private JFXButton btCalle86;
    @FXML
    private JFXButton btCalle85;
    @FXML
    private JFXButton btCalle83;
    @FXML
    private JFXButton btCalle63;
    @FXML
    private JFXButton btCorreo3;
    @FXML
    private JFXButton btCorreo2;
    @FXML
    private JFXButton btAvCentral1;
    @FXML
    private JFXButton btnVilla2;
    @FXML
    private JFXButton btInter6;
    @FXML
    private JFXButton btValle3;
    @FXML
    private JFXButton btCorreo4;
    @FXML
    private JFXButton btValle2;
    @FXML
    private JFXButton btAvCentral5;
    @FXML
    private JFXButton btMc1;
    @FXML
    private JFXButton btCorreo5;
    @FXML
    private JFXButton btAvCentral4;
    @FXML
    private JFXButton btAvCentral3;
    @FXML
    private JFXButton btnVilla3;
    @FXML
    private JFXButton btAvCentral2;
    @FXML
    private JFXButton btCalle45;
    @FXML
    private JFXButton btCalle88;
    @FXML
    private JFXButton btCalle65;
    @FXML
    private JFXButton btMc2;
    @FXML
    private JFXButton btMc3;
    @FXML
    private JFXButton btInter4;
    @FXML
    private JFXButton btInter3;
    @FXML
    private JFXButton btCalle46;
    @FXML
    private JFXButton btCalle47;
    @FXML
    private JFXButton btInter2;
    @FXML
    private JFXButton btAv7;
    @FXML
    private JFXButton btGuacamaya;
    @FXML
    private JFXButton btCalle67;
    @FXML
    private JFXButton btCalle66;
    @FXML
    private JFXButton btMc4;
    @FXML
    private JFXButton btAvCentral6;
    @FXML
    private JFXButton btInter5;
    @FXML
    private JFXButton btnVilla1;
    @FXML
    private JFXButton btNacional2;
    @FXML
    private JFXButton btNacional1;
    @FXML
    private JFXButton btCalle84;
    @FXML
    private JFXButton btnVilla4;
    List<Vertice> vertices=new ArrayList();
    /**
     * Initializes the controller class.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       vertices.add(new Vertice(btInter1,btAvCal10,btInter2,null,null,20,40,0,0));
    }    

    @FXML
    private void btnCalcularRutaOnAction(ActionEvent event) {
    }

    @FXML
    private void btnInicioRecorridoOnAction(ActionEvent event) {
    }
    
}
