package com.company.common.messages.serverToClient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PayloadServerToClient extends BaseServerToClient {

    private byte[] payload = new byte[0];
    private String arguments;

    private String payloadAsByteArrayToString() {
        return new String(payload);
    }

    @Override
    public String toString() {
        return super.toString() + "PayloadServerToClient{" +
                "payload=" + payloadAsByteArrayToString() +
                ", arguments='" + arguments + '\'' +
                '}';
    }
}