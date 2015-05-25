/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.boha.rivers.dto;

import com.boha.rivers.data.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class RiverDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer riverID;
    private String riverName;
    private List<RiverPartDTO> riverPartList;

    public RiverDTO() {
    }

    public RiverDTO(River a) {
        this.riverID = a.getRiverID();
        this.riverName = a.getRiverName();
    }

    public Integer getRiverID() {
        return riverID;
    }

    public void setRiverID(Integer riverID) {
        this.riverID = riverID;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public List<RiverPartDTO> getRiverPartList() {
        return riverPartList;
    }

    public void setRiverPartList(List<RiverPartDTO> riverPartList) {
        this.riverPartList = riverPartList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (riverID != null ? riverID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RiverDTO)) {
            return false;
        }
        RiverDTO other = (RiverDTO) object;
        if ((this.riverID == null && other.riverID != null) || (this.riverID != null && !this.riverID.equals(other.riverID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.boha.rivers.data.River[ riverID=" + riverID + " ]";
    }
    
}
