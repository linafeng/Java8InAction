package com.company.apollo_query.apollo_query.apollo_query.tb_shipping_order_main.generated;

import com.company.apollo_query.apollo_query.apollo_query.tb_shipping_order_main.TbShippingOrderMain;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation of the {@link
 * com.company.apollo_query.apollo_query.apollo_query.tb_shipping_order_main.TbShippingOrderMain}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedTbShippingOrderMainImpl implements TbShippingOrderMain {
    
    private long id;
    private long trackingId;
    private int sourceId;
    private String platformTrackingId;
    private long retailerId;
    private byte shippingOption;
    private long gridId;
    private int carrierId;
    private int agentId;
    private int stationId;
    private String carrierDriverId;
    private byte shippingState;
    private byte shippingReasonCode;
    private String remarkCode;
    private int cityid;
    private Timestamp acceptAt;
    private Timestamp completeAt;
    private Timestamp updatedAt;
    private Timestamp createdAt;
    
    protected GeneratedTbShippingOrderMainImpl() {
        
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public long getTrackingId() {
        return trackingId;
    }
    
    @Override
    public int getSourceId() {
        return sourceId;
    }
    
    @Override
    public String getPlatformTrackingId() {
        return platformTrackingId;
    }
    
    @Override
    public long getRetailerId() {
        return retailerId;
    }
    
    @Override
    public byte getShippingOption() {
        return shippingOption;
    }
    
    @Override
    public long getGridId() {
        return gridId;
    }
    
    @Override
    public int getCarrierId() {
        return carrierId;
    }
    
    @Override
    public int getAgentId() {
        return agentId;
    }
    
    @Override
    public int getStationId() {
        return stationId;
    }
    
    @Override
    public String getCarrierDriverId() {
        return carrierDriverId;
    }
    
    @Override
    public byte getShippingState() {
        return shippingState;
    }
    
    @Override
    public byte getShippingReasonCode() {
        return shippingReasonCode;
    }
    
    @Override
    public String getRemarkCode() {
        return remarkCode;
    }
    
    @Override
    public int getCityid() {
        return cityid;
    }
    
    @Override
    public Timestamp getAcceptAt() {
        return acceptAt;
    }
    
    @Override
    public Timestamp getCompleteAt() {
        return completeAt;
    }
    
    @Override
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    
    @Override
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    
    @Override
    public TbShippingOrderMain setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setTrackingId(long trackingId) {
        this.trackingId = trackingId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setSourceId(int sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setPlatformTrackingId(String platformTrackingId) {
        this.platformTrackingId = platformTrackingId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setRetailerId(long retailerId) {
        this.retailerId = retailerId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setShippingOption(byte shippingOption) {
        this.shippingOption = shippingOption;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setGridId(long gridId) {
        this.gridId = gridId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setCarrierId(int carrierId) {
        this.carrierId = carrierId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setAgentId(int agentId) {
        this.agentId = agentId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setStationId(int stationId) {
        this.stationId = stationId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setCarrierDriverId(String carrierDriverId) {
        this.carrierDriverId = carrierDriverId;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setShippingState(byte shippingState) {
        this.shippingState = shippingState;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setShippingReasonCode(byte shippingReasonCode) {
        this.shippingReasonCode = shippingReasonCode;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setRemarkCode(String remarkCode) {
        this.remarkCode = remarkCode;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setCityid(int cityid) {
        this.cityid = cityid;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setAcceptAt(Timestamp acceptAt) {
        this.acceptAt = acceptAt;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setCompleteAt(Timestamp completeAt) {
        this.completeAt = completeAt;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @Override
    public TbShippingOrderMain setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("trackingId = " + Objects.toString(getTrackingId()));
        sj.add("sourceId = " + Objects.toString(getSourceId()));
        sj.add("platformTrackingId = " + Objects.toString(getPlatformTrackingId()));
        sj.add("retailerId = " + Objects.toString(getRetailerId()));
        sj.add("shippingOption = " + Objects.toString(getShippingOption()));
        sj.add("gridId = " + Objects.toString(getGridId()));
        sj.add("carrierId = " + Objects.toString(getCarrierId()));
        sj.add("agentId = " + Objects.toString(getAgentId()));
        sj.add("stationId = " + Objects.toString(getStationId()));
        sj.add("carrierDriverId = " + Objects.toString(getCarrierDriverId()));
        sj.add("shippingState = " + Objects.toString(getShippingState()));
        sj.add("shippingReasonCode = " + Objects.toString(getShippingReasonCode()));
        sj.add("remarkCode = " + Objects.toString(getRemarkCode()));
        sj.add("cityid = " + Objects.toString(getCityid()));
        sj.add("acceptAt = " + Objects.toString(getAcceptAt()));
        sj.add("completeAt = " + Objects.toString(getCompleteAt()));
        sj.add("updatedAt = " + Objects.toString(getUpdatedAt()));
        sj.add("createdAt = " + Objects.toString(getCreatedAt()));
        return "TbShippingOrderMainImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof TbShippingOrderMain)) { return false; }
        final TbShippingOrderMain thatTbShippingOrderMain = (TbShippingOrderMain)that;
        if (this.getId() != thatTbShippingOrderMain.getId()) {return false; }
        if (this.getTrackingId() != thatTbShippingOrderMain.getTrackingId()) {return false; }
        if (this.getSourceId() != thatTbShippingOrderMain.getSourceId()) {return false; }
        if (!Objects.equals(this.getPlatformTrackingId(), thatTbShippingOrderMain.getPlatformTrackingId())) {return false; }
        if (this.getRetailerId() != thatTbShippingOrderMain.getRetailerId()) {return false; }
        if (this.getShippingOption() != thatTbShippingOrderMain.getShippingOption()) {return false; }
        if (this.getGridId() != thatTbShippingOrderMain.getGridId()) {return false; }
        if (this.getCarrierId() != thatTbShippingOrderMain.getCarrierId()) {return false; }
        if (this.getAgentId() != thatTbShippingOrderMain.getAgentId()) {return false; }
        if (this.getStationId() != thatTbShippingOrderMain.getStationId()) {return false; }
        if (!Objects.equals(this.getCarrierDriverId(), thatTbShippingOrderMain.getCarrierDriverId())) {return false; }
        if (this.getShippingState() != thatTbShippingOrderMain.getShippingState()) {return false; }
        if (this.getShippingReasonCode() != thatTbShippingOrderMain.getShippingReasonCode()) {return false; }
        if (!Objects.equals(this.getRemarkCode(), thatTbShippingOrderMain.getRemarkCode())) {return false; }
        if (this.getCityid() != thatTbShippingOrderMain.getCityid()) {return false; }
        if (!Objects.equals(this.getAcceptAt(), thatTbShippingOrderMain.getAcceptAt())) {return false; }
        if (!Objects.equals(this.getCompleteAt(), thatTbShippingOrderMain.getCompleteAt())) {return false; }
        if (!Objects.equals(this.getUpdatedAt(), thatTbShippingOrderMain.getUpdatedAt())) {return false; }
        if (!Objects.equals(this.getCreatedAt(), thatTbShippingOrderMain.getCreatedAt())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Long.hashCode(getTrackingId());
        hash = 31 * hash + Integer.hashCode(getSourceId());
        hash = 31 * hash + Objects.hashCode(getPlatformTrackingId());
        hash = 31 * hash + Long.hashCode(getRetailerId());
        hash = 31 * hash + Byte.hashCode(getShippingOption());
        hash = 31 * hash + Long.hashCode(getGridId());
        hash = 31 * hash + Integer.hashCode(getCarrierId());
        hash = 31 * hash + Integer.hashCode(getAgentId());
        hash = 31 * hash + Integer.hashCode(getStationId());
        hash = 31 * hash + Objects.hashCode(getCarrierDriverId());
        hash = 31 * hash + Byte.hashCode(getShippingState());
        hash = 31 * hash + Byte.hashCode(getShippingReasonCode());
        hash = 31 * hash + Objects.hashCode(getRemarkCode());
        hash = 31 * hash + Integer.hashCode(getCityid());
        hash = 31 * hash + Objects.hashCode(getAcceptAt());
        hash = 31 * hash + Objects.hashCode(getCompleteAt());
        hash = 31 * hash + Objects.hashCode(getUpdatedAt());
        hash = 31 * hash + Objects.hashCode(getCreatedAt());
        return hash;
    }
}