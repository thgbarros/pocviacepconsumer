package br.com.zup.consomeviacep.repository;

import br.com.zup.consomeviacep.domain.Endereco;
import br.com.zup.consomeviacep.mapper.EnderecoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Repository
@RequiredArgsConstructor
public class DynamoDbRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public void save(final Endereco endereco) {
        final EnderecoEntity enderecoEntity = EnderecoMapper.INSTANCE.mapFrom(endereco);
        dynamoDBMapper.save(enderecoEntity);
    }

}
