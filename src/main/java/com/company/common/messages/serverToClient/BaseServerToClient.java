package com.company.common.messages.serverToClient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BaseServerToClient implements Serializable {

    private int Id;
    private String type;
}