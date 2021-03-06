package com.krzykrucz.transfers.domain.account;

import com.krzykrucz.transfers.domain.common.AggregateId;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class AccountIdentifier implements AggregateId {

    private final UUID uuid;

    public static AccountIdentifier generate() {
        return new AccountIdentifier(UUID.randomUUID());
    }

}
