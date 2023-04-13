package com.company.common.messages.serverToCLI;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SendPayload extends BaseServerToCLI {

    private Map<Long, String> clientIdToAck = new HashMap<>();
}
