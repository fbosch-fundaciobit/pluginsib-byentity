package es.apb.login.negocio.exception;

/**
 * 
 * Excepcion al interpretar respuesta Clave.
 * 
 * @author rsanz
 * 
 */
@SuppressWarnings("serial")
public final class ErrorRespuestaClaveException extends
		ServiceRollbackException {

	/** Url origen. */
	private String urlOrigen;
	
	/**
	 * Constructor GenerarPeticionClaveException.
	 * 
	 * @param cause
	 *            Causa
	 */
	public ErrorRespuestaClaveException(final Throwable cause, final String urlRetorno) {
		super(cause.getMessage(), cause);
		this.urlOrigen = urlRetorno;
	}

	/**
	 * Constructor GenerarPeticionClaveException.
	 * 
	 * @param cause
	 *            Causa
	 */
	public ErrorRespuestaClaveException(final String cause, final String urlRetorno) {
		super(cause);
		this.urlOrigen = urlRetorno;
	}

	public String getUrlOrigen() {
		return urlOrigen;
	}

}
