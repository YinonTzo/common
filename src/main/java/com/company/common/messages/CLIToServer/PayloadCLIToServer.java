package com.company.common.messages.CLIToServer;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class PayloadCLIToServer extends BaseCLIToServer {

    private byte[] payload = new byte[0];
    private String arguments;

    public PayloadCLIToServer(String type) {
        super(type);
    }

    public String messageToString() {
        return new String(payload);
    }

    @Override
    public String toString() {
        return super.toString() + "PayloadCLIToServer{" +
                "payload=" + messageToString() +
                ", arguments='" + arguments + '\'' +
                '}';
    }
}
