/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.uber;

import com.jfoenix.controls.JFXButton;

/**
 *
 * @author Daniel
 */
public class Vertice {
    JFXButton cabeza;
    JFXButton v1;
    JFXButton v2;
    JFXButton v3;
    JFXButton v4;
    int vp1;
    int vp2;
    int vp3;
    int vp4;
    public Vertice(JFXButton cabeza,JFXButton v1,JFXButton v2,JFXButton v3,JFXButton v4,int vp1, int vp2, int vp3, int vp4){
        this.cabeza=cabeza;
        this.v1= v1;
        this.v2=v2;
        this.v3=v3;
        this.v4=v4;
        this.vp1=vp1;
        this.vp2=vp2;
        this.vp3=vp3;
        this.vp4=vp4;
    }
}
