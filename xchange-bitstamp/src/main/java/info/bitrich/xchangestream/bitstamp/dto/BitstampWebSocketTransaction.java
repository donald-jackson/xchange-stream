package info.bitrich.xchangestream.bitstamp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.bitstamp.dto.marketdata.BitstampTransaction;

import java.math.BigDecimal;

public class BitstampWebSocketTransaction extends BitstampTransaction {
    public BitstampWebSocketTransaction(@JsonProperty("microtimestamp") BigDecimal microtimestamp, @JsonProperty("id") long tid, @JsonProperty("price") BigDecimal price,
                                        @JsonProperty("amount") BigDecimal amount, @JsonProperty("order_type") int type) {

        super(microtimestamp.longValue() / 1000, tid, price, amount, type);
    }
}
