package com.olson1998.messaging.domain.model;

import static com.olson1998.messaging.domain.service.Base64Utils.decode;

public class InboundMsg {

    private String id;

    private String fingerPrint;

    private String entity;

    private Claim claim;

    private String payload;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public InboundMsg(String id, String fingerPrint, String entity, Claim claim, String payload) {
        this.id = id;
        this.fingerPrint = fingerPrint;
        this.entity = entity;
        this.claim = claim;
        this.payload = decode(payload);
    }

    public InboundMsg() {
    }
}
