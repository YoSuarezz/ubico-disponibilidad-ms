package co.edu.uco.ubico.crosscutting.enums;

public class RepositoryUbicoException extends UbicoException {

        private static final long serialVersionUID = 1L;

        public RepositoryUbicoException(final String userMessage,
                                        final String technicalMessage,
                                        final Exception rootException) {
            super(userMessage, technicalMessage, rootException, Layer.REPOSITORY);
        }
        public static final RepositoryUbicoException create(final String userMessage,
                                                            final String technicalMessage,
                                                            final Exception rootException){
            return new RepositoryUbicoException(userMessage,technicalMessage, rootException);
        }

        public static final RepositoryUbicoException create(final String userMessage){
            return new RepositoryUbicoException(userMessage, userMessage, new Exception());
        }

        public static final RepositoryUbicoException create(final String userMessage,
                                                            final String technicalMessage){
            return new RepositoryUbicoException(userMessage, technicalMessage, new Exception());
        }
}
