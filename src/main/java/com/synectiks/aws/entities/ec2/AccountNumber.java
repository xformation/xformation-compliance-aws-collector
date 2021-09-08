package com.synectiks.aws.entities.ec2;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountNumber {
	INT, STRING;

	@JsonValue
	public String toValue() {
		switch (this) {
		case INT:
			return "int";
		case STRING:
			return "string";
		}
		return null;
	}

	@JsonCreator
	public static AccountNumber forValue(String value) throws IOException {
		if (value.equals("int"))
			return INT;
		if (value.equals("string"))
			return STRING;
		throw new IOException("Cannot deserialize AccountNumber");
	}
}
