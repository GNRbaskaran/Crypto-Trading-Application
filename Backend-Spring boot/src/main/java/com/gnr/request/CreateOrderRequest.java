package com.gnr.request;

import com.gnr.domain.OrderType;

import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
