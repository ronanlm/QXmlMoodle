package fr.qxmlmoodle.exception;

/** Class ImportIOError error concern Input/Output. */
    /** Default constructor. */
        super(ImportErrorType.IO);
    }
    public ImportIOError(final int line, final String tag) {
        super(ImportErrorType.IO, line, tag,
    }
    public ImportIOError(final int line, final String tag, final String desc) {
        super(ImportErrorType.IO, line, tag, desc);
    }
}