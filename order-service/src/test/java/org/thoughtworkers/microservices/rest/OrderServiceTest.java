package org.thoughtworkers.microservices.rest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderServiceTest {
    @Test
    public void shouldReturnOrderInformation() {
        OrderService orderService = new OrderService();
        Order order = orderService.getOrder(1);
        assertThat(order.getId(), is(1l));
        assertThat(order.getBuyerName(), is("Jeff Xiong"));
    }
}
