package com.olson1998.messaging.domain.model;

import static com.olson1998.messaging.domain.model.Status.ERROR;
import static com.olson1998.messaging.domain.service.Base64Utils.encode;

public class OutboundMsg {

    private String id;

    private String fingerPrint;

    private Status status;

    private String header;

    private String payload;

    public OutboundMsg(String id, String fingerPrint, Status status, String header, String payload) {
        this.id = id;
        this.fingerPrint = fingerPrint;
        this.status = status;
        this.header = header;
        this.payload = encode(payload);
    }

    public OutboundMsg(String id, String fingerPrint, Status status, String payload) {
        this.id = id;
        this.fingerPrint = fingerPrint;
        this.status = status;
        this.payload = encode(payload);
    }

    public OutboundMsg(String id, String fingerPrint, Throwable error) {
        this.id = id;
        this.fingerPrint = fingerPrint;
        this.status = ERROR;
        this.header = error.getClass().getName();
        this.payload = encode(error.getMessage())
    }

    public OutboundMsg() {
    }
}
