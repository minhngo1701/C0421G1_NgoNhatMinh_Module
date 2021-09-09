package com.codegym.add_card.dto;

import com.codegym.add_card.model.bean.Product;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto,Integer> products = new HashMap<>();

    public CartDto() {
    }

    public CartDto(Map<ProductDto, Integer> products) {
        this.products = products;
    }

    public Map<ProductDto, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<ProductDto, Integer> products) {
        this.products = products;
    }

    private boolean checkItemInCart(ProductDto productDto){ //kiểm tra sp có trong giỏ hàng hay chưa
        for (Map.Entry<ProductDto, Integer> entry : products.entrySet()) {
            if(entry.getKey().getId().equals(productDto.getId())){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<ProductDto, Integer> selectItemInCart(ProductDto productDto){ // kiểm tra sp có trùng với sp trong giỏ hàng không
        for (Map.Entry<ProductDto, Integer> entry : products.entrySet()) {
            if(entry.getKey().getId().equals(productDto.getId())){
                return entry;
            }
        }
        return null;
    }

    public void subProduct(ProductDto productDto){ //trừ sp trong giỏ hàng
            Map.Entry<ProductDto, Integer> itemEntry = selectItemInCart(productDto);
            Integer newQuantity = itemEntry.getValue() - 1;
            products.replace(itemEntry.getKey(),newQuantity);

    }
    public void addProduct(ProductDto productDto){ //thêm sp vào giỏ hàng
        if (!checkItemInCart(productDto)){
            products.put(productDto, 1);
        }else {
            Map.Entry<ProductDto, Integer> itemEntry = selectItemInCart(productDto);
            Integer newQuantity = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public Integer countProductQuantity(){ // đếm số lượng sản phẩm đó hiện có trong giỏ hàng
        Integer productQuantity = 0;
        for (Map.Entry<ProductDto, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity(){ // đếm số lượng sp có trong giỏ hàng
        return products.size();
    }

    public Float countTotalPayment(){ // tính tổng số tiền cần phải thanh toán
        float payment = 0;
        for (Map.Entry<ProductDto, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }

    public void removeProduct(ProductDto productDto) {
        products.remove(productDto);
    }

    public void clearAll() {
        products.clear();
    }
}
