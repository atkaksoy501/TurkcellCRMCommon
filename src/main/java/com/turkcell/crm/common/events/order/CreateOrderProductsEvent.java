package com.turkcell.crm.common.events.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateOrderProductsEvent {

    private List<Integer> productIds;

    private int accountId;
}
