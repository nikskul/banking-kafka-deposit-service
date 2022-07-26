package com.nikskul.kafkabanking.request;

import java.math.BigDecimal;
import java.util.Objects;

public record DepositRequest(String username, BigDecimal value) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DepositRequest) obj;
        return Objects.equals(this.username, that.username) &&
               Objects.equals(this.value, that.value);
    }

    @Override
    public String toString() {
        return "DepositRequest[" +
               "username=" + username + ", " +
               "value=" + value + ']';
    }


}
