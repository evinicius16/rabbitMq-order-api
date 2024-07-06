package com.application.order.api.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPrdido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {
}
