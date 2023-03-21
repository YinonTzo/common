package com.company.common.messages.serverToCLI;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BaseServerToCLI implements Serializable {

    private String type;
}
