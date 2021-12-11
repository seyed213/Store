package com.nikdiba.store.service;

import com.nikdiba.store.apiModel.Address.CreateAddressRequest;
import com.nikdiba.store.apiModel.Address.CreateAddressResponse;
import com.nikdiba.store.apiModel.Address.UpdateAddressRequest;
import com.nikdiba.store.apiModel.Address.UpdateAddressResponse;

public interface AddressService {

    CreateAddressResponse create(CreateAddressRequest request);

    UpdateAddressResponse update(UpdateAddressRequest request);
}
