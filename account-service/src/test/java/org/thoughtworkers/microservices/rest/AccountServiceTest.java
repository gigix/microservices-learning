package org.thoughtworkers.microservices.rest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountServiceTest {
    @Test
    public void shouldReturnAccountObject() {
        AccountService accountService = new AccountService();
        Account account = accountService.getAccount(1);
        assertThat(account.getId(), is(1L));
        assertThat(account.getFullName(), is("Jeff Xiong"));
    }
}
