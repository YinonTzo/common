package com.company.common.messages.serverToCLI;

import com.company.common.messages.clientToServer.ExecutionData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class CommandResults extends BaseServerToCLI {

    private Map<Integer, List<ExecutionData>> payloadIdToResult = new HashMap<>();
}
