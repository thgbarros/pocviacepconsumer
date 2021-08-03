package br.com.zup.consomeviacep.mapper;

import br.com.zup.consomeviacep.domain.Endereco;
import br.com.zup.consomeviacep.repository.EnderecoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoMapper {

    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    @Mapping(target = "id", ignore = true)
    EnderecoEntity mapFrom(final Endereco endereco);

}
