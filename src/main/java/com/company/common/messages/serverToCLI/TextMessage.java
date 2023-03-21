package com.company.common.messages.serverToCLI;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class TextMessage extends BaseServerToCLI{

    private String text;
}
