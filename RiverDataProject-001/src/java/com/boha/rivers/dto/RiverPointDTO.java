/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boha.rivers.dto;

import com.boha.rivers.data.RiverPoint;
import java.io.Serializable;

/**
 *
 * @author aubreyM
 */
public class RiverPointDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer riverPointID;
    private double latitude;
    private double longitude;
    private Integer distance;
    private int iprivID;
    private RiverPartDTO riverPart;

    public RiverPointDTO() {
    }

    public RiverPointDTO(Integer riverPointID) {
        this.riverPointID = riverPointID;
    }

    public RiverPointDTO(RiverPoint a) {
        this.riverPointID = a.getRiverPointID();
        this.latitude = a.getLatitude();
        this.longitude = a.getLongitude();
        this.iprivID = a.getIprivID();
        this.riverPart = new RiverPartDTO(a.getRiverPart());
    }

    public Integer getRiverPointID() {
        return riverPointID;
    }

    public void setRiverPointID(Integer riverPointID) {
        this.riverPointID = riverPointID;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getIprivID() {
        return iprivID;
    }

    public void setIprivID(int iprivID) {
        this.iprivID = iprivID;
    }

    public RiverPartDTO getRiverPart() {
        return riverPart;
    }

    public void setRiverPart(RiverPartDTO riverPart) {
        this.riverPart = riverPart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (riverPointID != null ? riverPointID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RiverPointDTO)) {
            return false;
        }
        RiverPointDTO other = (RiverPointDTO) object;
        if ((this.riverPointID == null && other.riverPointID != null) || (this.riverPointID != null && !this.riverPointID.equals(other.riverPointID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.boha.rivers.data.RiverPoint[ riverPointID=" + riverPointID + " ]";
    }

}
