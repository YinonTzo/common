package com.company.common.messages.serverToCLI;

import com.company.common.statuses.ClientAndServerStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class ClientsAndStatuses extends BaseServerToCLI{

    private Map<Integer, ClientAndServerStatus> clientsAndStatuses;
}
