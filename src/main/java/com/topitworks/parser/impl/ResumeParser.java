package com.topitworks.parser.impl;

import com.topitworks.parser.Parser;

import java.io.File;

public class ResumeParser implements Parser {

    /**
     * The main purpose of this method is to parse unstructured data (resume file) to structured data (JSON).
     * This method accepts the resume file as java.io.File object, parse them and return a JSON string
     * which represents resume information
     *
     * @param resume resume file in DOC, DOCX or PDF extension
     * @return JSON string represents resume information. Refer the suggested structure here
     */
    @Override
    public String parse(File resume) {
        return null;
    }
}
