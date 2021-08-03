package br.com.zup.consomeviacep.messaging;

import br.com.zup.consomeviacep.domain.Endereco;
import br.com.zup.consomeviacep.repository.DynamoDbRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
@RequiredArgsConstructor
class ConsumidorDeEndereco {

    private final DynamoDbRepository repository;

    @SqsListener(value = "fila_enderecos", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    void publicar(final Endereco endereco) {
        repository.save(endereco);
        log.info(String.format("Endereço %s publicado", endereco));
    }

}
