package fr.qxmlmoodle.exception;

/** Class ImportElementError error concern element. */
    /** Default constructor. */
        super(ImportErrorType.ELEMENT);
    }
    public ImportElementError(final int line, final String elementName,
        super(ImportErrorType.ELEMENT, line , "",
    }
    public ImportElementError(final int line, final String elementName) {
        super(ImportErrorType.ELEMENT, line , "",
    }

}