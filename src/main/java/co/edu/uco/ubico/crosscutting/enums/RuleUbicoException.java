package co.edu.uco.ubico.crosscutting.enums;

public class RuleUbicoException  extends UbicoException{

    private static final long serialVersionUID = 1L;

    public RuleUbicoException(final String userMessage,
                             final String technicalMessage,
                             final Exception rootException) {
        super(userMessage, technicalMessage, rootException, Layer.RULE);
    }
    public static final RuleUbicoException create(final String userMessage,
                                                 final String technicalMessage,
                                                 final Exception rootException){
        return new RuleUbicoException(userMessage,technicalMessage, rootException);
    }

    public static final RuleUbicoException create(final String userMessage){
        return new RuleUbicoException(userMessage, userMessage, new Exception());
    }

    public static final RuleUbicoException create(final String userMessage,
                                                 final String technicalMessage){
        return new RuleUbicoException(userMessage, technicalMessage, new Exception());
    }
}
