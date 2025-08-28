package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator{
    private Map<CustomerType, DiscountPolicy> policies = new HashMap<>();

    public void registrarPolitica(CustomerType type, DiscountPolicy policy){
        policies.put(type, policy);
    }
    
    public double apply(double amount, CustomerType type){
        DiscountPolicy policy = policies.get(type);
        return policy.apply(amount);
    }
}
