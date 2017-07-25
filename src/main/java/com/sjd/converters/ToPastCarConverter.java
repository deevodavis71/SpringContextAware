package com.sjd.converters;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.jonpeterson.jackson.module.versioning.VersionedModelConverter;

public class ToPastCarConverter implements VersionedModelConverter
{

	@Override
	public ObjectNode convert (ObjectNode modelData, String modelVersion, String targetModelVersion,
			JsonNodeFactory nodeFactory)
	{
		// TODO Auto-generated method stub
		return modelData;
	}

}
