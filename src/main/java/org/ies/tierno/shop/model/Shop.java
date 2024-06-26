package org.ies.tierno.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private String name;
    private Map<String, Product> productsById;
    private TreeSet<Customer> customers;

}
