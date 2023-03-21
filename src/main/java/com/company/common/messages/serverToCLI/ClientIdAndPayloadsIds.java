package com.company.common.messages.serverToCLI;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ClientIdAndPayloadsIds extends BaseServerToCLI{

    private Map<String, String> clientAndPayloads = new HashMap<>();
}
