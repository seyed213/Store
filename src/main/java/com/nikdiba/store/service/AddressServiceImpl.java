package com.nikdiba.store.service;

import com.nikdiba.store.Mapper.AddressMapper;
import com.nikdiba.store.apiModel.Address.CreateAddressRequest;
import com.nikdiba.store.apiModel.Address.CreateAddressResponse;
import com.nikdiba.store.apiModel.Address.UpdateAddressRequest;
import com.nikdiba.store.apiModel.Address.UpdateAddressResponse;
import com.nikdiba.store.apiModel.ApiResponse;
import com.nikdiba.store.entity.Address;
import com.nikdiba.store.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;


    @Override
    public CreateAddressResponse create(CreateAddressRequest request) {

        Address address = AddressMapper.Instance.map(request);
        Address cratedAddress = addressRepository.save(address);

        CreateAddressResponse response = AddressMapper.Instance.map(cratedAddress);


        return response;
    }

    @Override
    public UpdateAddressResponse update(UpdateAddressRequest request) {

        Address address = AddressMapper.Instance.map(request);

        Address updatedAddress = addressRepository.save(address);

        UpdateAddressResponse response = AddressMapper.Instance.updateMap(updatedAddress);

        return response;

    }


}
