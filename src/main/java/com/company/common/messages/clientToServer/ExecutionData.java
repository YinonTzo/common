package com.company.common.messages.clientToServer;

import com.company.common.statuses.ExecutionStatus;
import lombok.*;

import java.io.Serializable;
import java.util.Base64;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExecutionData implements Serializable {

    private int messageId;
    private ExecutionStatus status;
    private String result = "";

    public ExecutionData(int messageId) {
        this.messageId = messageId;
    }

    public ExecutionData(int messageId, ExecutionStatus status) {
        this.messageId = messageId;
        this.status = status;
    }

    private String getResultAsString() {
        String decodedResult;
        try {
            decodedResult = new String(Base64.getDecoder().decode(result));
        } catch (IllegalArgumentException e) {
            decodedResult = result;
        }
        return decodedResult;
    }

    @Override
    public String toString() {
        return "ExecutionData{" +
                "id=" + messageId +
                ", status=" + status +
                ", result='" + getResultAsString() +
                '}';
    }
}