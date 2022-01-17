package com.pgui.sellerpanel.seller.orders;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class OrderCounts {
    Long notSendCount;

    Long unpaidCount;

    Long returnsCount;
}
