package fr.qxmlmoodle.exception;

/** Class ImportError error concern import. */
    /** Attribute type the type of the error. */
    private final transient ImportErrorType type;
    /** Attribute line the line of the error. */
    /** Attribute tag the tag of the error. */
    /** Attribute description the description the error. */
    /** Default constructor. */
        this.type = ImportErrorType.OTHER;
    }
    public ImportError(final ImportErrorType typeValue) {
        this.type = typeValue;
    }
    public ImportError(final ImportErrorType typeValue, final int lineValue,
        this.type = typeValue;
        this.line = lineValue;
        this.tag = tagValue;
    }
    public ImportError(final ImportErrorType typeValue, final int lineValue,
        this.type = typeValue;
        this.line = lineValue;
        this.tag = tagValue;
        this.description = desc;
    }

    /** @return the type. */
    }

}