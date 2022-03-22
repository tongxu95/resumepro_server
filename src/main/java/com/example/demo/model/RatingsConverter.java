package com.example.demo.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RatingsConverter implements AttributeConverter<List<Double>, String> {

	private static final String SPLIT_CHAR = ",";
	
	@Override
	public String convertToDatabaseColumn(List<Double> ratingList) {
		List<String> ratingsListStr = (ratingList != null) ? ratingList.stream().map(rating -> rating.toString()).collect(Collectors.toList()) : null;
		return ratingsListStr != null ? String.join(SPLIT_CHAR, ratingsListStr) : "";
	}

	@Override
	public List<Double> convertToEntityAttribute(String ratings) {
		List<String> ratingListStr = (ratings != null) ? Arrays.asList(ratings.split(SPLIT_CHAR)) : null;
		return (ratingListStr != null) ? ratingListStr.stream().map(rating -> Double.valueOf(rating)).collect(Collectors.toList()) : null;
	}

}
