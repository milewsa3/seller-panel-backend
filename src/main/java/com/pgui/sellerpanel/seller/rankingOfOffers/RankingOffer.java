package com.pgui.sellerpanel.seller.rankingOfOffers;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class RankingOffer {
    @Id
    @GeneratedValue
    Long id;

    String fullItemName;

    String imgUrl;

    Long numberOfSales;

    Long profit;

    String currency;

    Long numberOfUnitsSold;

    Long numberOfUniqueViews;
}
