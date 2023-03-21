package com.company.common.messages.CLIToServer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BaseCLIToServer implements Serializable {

    private String type;
    private List<Integer> requestIds;

    public BaseCLIToServer(String type) {
        this.type = type;
    }
}