package com.spring.token;

import com.spring.model.Review;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by egulocak on 6.07.2020.
 */
public interface Validation {
     Boolean isvalidate(Token token);
    Boolean isValidateAction(Review review,String email,String password);

    String generatetoken();
    }
