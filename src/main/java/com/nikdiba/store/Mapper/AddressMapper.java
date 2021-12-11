package com.nikdiba.store.Mapper;

import com.nikdiba.store.apiModel.Address.CreateAddressRequest;
import com.nikdiba.store.apiModel.Address.CreateAddressResponse;
import com.nikdiba.store.apiModel.Address.UpdateAddressRequest;
import com.nikdiba.store.apiModel.Address.UpdateAddressResponse;
import com.nikdiba.store.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper Instance = Mappers.getMapper(AddressMapper.class);

    Address map(CreateAddressRequest request);

    CreateAddressResponse map(Address address);

    Address map(UpdateAddressRequest request);

    UpdateAddressResponse updateMap(Address address);

}
