package org.semanticweb.owlapi.migration_3_5_to_4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Migration {
    String[] value();
}
