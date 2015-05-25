/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.boha.rivers.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@Table(name = "riverPart")
@NamedQueries({
    @NamedQuery(name = "RiverPart.findByRiverPartID", query = "SELECT r FROM RiverPart r WHERE r.riverPartID = :riverPartID"),
    @NamedQuery(name = "RiverPart.findByRiverName", query = "SELECT r FROM RiverPart r WHERE r.riverName = :riverName"),
    @NamedQuery(name = "RiverPart.findByFNode", query = "SELECT r FROM RiverPart r WHERE r.fNode = :fNode"),
    @NamedQuery(name = "RiverPart.findByRiverPartList", 
            query = "SELECT r FROM RiverPart r WHERE r.riverPartID in :list order by r.riverName, r.distanceToMouth"),
    @NamedQuery(name = "RiverPart.findRiversByRiverPartList", 
            query = "SELECT distinct r.river FROM RiverPart r WHERE r.riverPartID in :list order by r.riverName"),
    @NamedQuery(name = "RiverPart.findByIprivID", 
            query = "SELECT r FROM RiverPart r WHERE r.iprivID = :iprivID")
})
public class RiverPart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "riverPartID")
    private Integer riverPartID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "riverName")
    private String riverName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fNode")
    private int fNode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tNode")
    private int tNode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iprivID")
    private int iprivID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "distanceToMouth")
    private double distanceToMouth;
    @JoinColumn(name = "riverID", referencedColumnName = "riverID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private River river;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "riverPart", fetch = FetchType.LAZY)
    private List<RiverPoint> riverPointList;

    public RiverPart() {
    }

    public RiverPart(Integer riverPartID) {
        this.riverPartID = riverPartID;
    }

    public RiverPart(Integer riverPartID, String riverName, int fNode, int tNode, int iprivID, double distanceToMouth) {
        this.riverPartID = riverPartID;
        this.riverName = riverName;
        this.fNode = fNode;
        this.tNode = tNode;
        this.iprivID = iprivID;
        this.distanceToMouth = distanceToMouth;
    }

    public River getRiver() {
        return river;
    }

    public void setRiver(River river) {
        this.river = river;
    }

    public Integer getRiverPartID() {
        return riverPartID;
    }

    public void setRiverPartID(Integer riverPartID) {
        this.riverPartID = riverPartID;
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public int getFNode() {
        return fNode;
    }

    public void setFNode(int fNode) {
        this.fNode = fNode;
    }

    public int getTNode() {
        return tNode;
    }

    public void setTNode(int tNode) {
        this.tNode = tNode;
    }

    public int getIprivID() {
        return iprivID;
    }

    public void setIprivID(int iprivID) {
        this.iprivID = iprivID;
    }

    public double getDistanceToMouth() {
        return distanceToMouth;
    }

    public void setDistanceToMouth(double distanceToMouth) {
        this.distanceToMouth = distanceToMouth;
    }

   

    public List<RiverPoint> getRiverPointList() {
        return riverPointList;
    }

    public void setRiverPointList(List<RiverPoint> riverPointList) {
        this.riverPointList = riverPointList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (riverPartID != null ? riverPartID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RiverPart)) {
            return false;
        }
        RiverPart other = (RiverPart) object;
        if ((this.riverPartID == null && other.riverPartID != null) || (this.riverPartID != null && !this.riverPartID.equals(other.riverPartID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.boha.rivers.data.RiverPart[ riverPartID=" + riverPartID + " ]";
    }
    
}
