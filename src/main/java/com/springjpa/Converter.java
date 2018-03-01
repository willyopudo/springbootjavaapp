package com.springjpa;

public @interface Converter {

	Class<StringCryptoConverter> converter();

}
