package com.pgui.sellerpanel.seller.orders;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Order {

    @GeneratedValue
    @Id
    Long id;

    String itemFullName;

    String imgUrl;

    Long price;

    String currency;

    String boughtBy;

    String address;

    String telephone;

    String deliveryCompany;
}
