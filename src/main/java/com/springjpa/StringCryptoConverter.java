package com.springjpa;

import javax.persistence.Converter;

//import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Converter
public class StringCryptoConverter extends AbstractCryptoConverter<String> {

    public StringCryptoConverter() {
        this(new CipherInitializer());
    }

    public StringCryptoConverter(CipherInitializer cipherInitializer) {
        super(cipherInitializer);
    }

    @Override
    boolean isNotNullOrEmpty(String attribute) {
        return isNotNullOrEmpty(attribute);
    }

    @Override
    String stringToEntityAttribute(String dbData) {
        return dbData;
    }

    @Override
    String entityAttributeToString(String attribute) {
        return attribute;
    }
}
