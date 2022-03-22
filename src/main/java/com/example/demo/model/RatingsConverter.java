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
		if (ratingList != null) {
			List<String> ratingsListStr = ratingList.stream().map(rating -> rating.toString()).collect(Collectors.toList());
			return String.join(SPLIT_CHAR, ratingsListStr);
		}
		return "";
	}

	@Override
	public List<Double> convertToEntityAttribute(String ratings) {
		if (! ratings.equals("")) {
			List<String> ratingListStr = Arrays.asList(ratings.split(SPLIT_CHAR));
			return ratingListStr.stream().map(rating -> Double.valueOf(rating)).collect(Collectors.toList());
		}
		return null;
	}

}
