package br.com.zup.consomeviacep.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@DynamoDBTable(tableName = "enderecos")
public class EnderecoEntity implements Serializable {

    private static final long serialVersionUID = 3222890791151805982L;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    @EqualsAndHashCode.Include
    private String id;

    @DynamoDBAttribute
    private String cep;

    @DynamoDBAttribute
    private String logradouro;

    @DynamoDBAttribute
    private String complemento;

    @DynamoDBAttribute
    private String bairro;

    @DynamoDBAttribute
    private String cidade;

    @DynamoDBAttribute
    private String estado;

    @DynamoDBAttribute(attributeName = "codigo_ibge")
    private String codigoIbge;

    @DynamoDBAttribute(attributeName = "codigo_area")
    private String codigoDeArea;

}
