package es.sistra.clientcert.front;

import java.io.Serializable;

/**
 * Constants globals.
 */
public class Constants implements Serializable 
{
	/**
     * Atributo de contexto donde se guarda el lenguaje por defecto.
     */
    public static final String DEFAULT_LANG_KEY 	= "es.sistra.clientcert.front.DEFAULT_LANG";
    public static final String DEFAULT_LANG 		= "ca";	
    
    /**
	 * Atributo de request donde se guarda mensaje para fail
	 */
	public static String MESSAGE_KEY = "mensaje";
	
	/**
     * Atributo de sesion donde se guarda el idioma de la sesion de pagos
     */
	public static final String DATOS_SESION_IDIOMA_KEY 			= "es.sistra.clientcert.front.DATOS_SESION_IDIOMA_KEY";
			
	/**
	 * Atributo de request donde se guarda la url de soporte
	 */
	public static String URL_SOPORTE_INCIDENCIAS = "urlSoporteIncidencias";
	/**
	 * Atributo de request donde se guarda el telefono de soporte
	 */
	public static String TELEFONO_INCIDENCIAS = "telefonoIncidencias";
	
	/**
	 * Atributo de request donde se guarda la informacion del Organismo
	 */
	public static String ORGANISMO_INFO_KEY = "informacionOrganismo";
	
	/**
	 * Atributo de request donde se guarda el nombre del Organismo
	 */
	public static String ORGANISMO_NAME = "nombreOrganismo";
	
	/**
	 * Atributo de request donde se guarda la url del logo del Organismo
	 */
	public static String ORGANISMO_LOGO = "logoOrganismo";

	/**
	 * Atributo de request donde se guarda la url del Organismo
	 */
	public static String ORGANISMO_URL = "urlOrganismo";
	
		
	
}
