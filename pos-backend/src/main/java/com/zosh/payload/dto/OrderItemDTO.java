package com.zosh.payload.dto;

import com.zosh.modal.Order;
import com.zosh.modal.Product;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long id;

    private Integer quantity;

    private Double price;

    private ProductDTO product;

    private Long productId;

    private Long orderId;
}
