package fr.qxmlmoodle.exception;

/** Class ImportValidityError error concern XML validity. */
    /** Default constructor. */
        super(ImportErrorType.VALIDITY);
    }
    public ImportValidityError(final int line, final String tag) {
        super(ImportErrorType.VALIDITY, line, tag,
    }
    public ImportValidityError(final int line, final String tag,
        super(ImportErrorType.VALIDITY, line , tag, desc);
    }

}