/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Boton#getContenido <em>Contenido</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Boton#getEvento <em>Evento</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Boton#getMetodo <em>Metodo</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getBoton()
 * @model
 * @generated
 */
public interface Boton extends EObject
{
  /**
   * Returns the value of the '<em><b>Contenido</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contenido</em>' attribute.
   * @see #setContenido(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getBoton_Contenido()
   * @model
   * @generated
   */
  String getContenido();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Boton#getContenido <em>Contenido</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contenido</em>' attribute.
   * @see #getContenido()
   * @generated
   */
  void setContenido(String value);

  /**
   * Returns the value of the '<em><b>Evento</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.unal.dsl.appPrecio.Evento}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evento</em>' attribute.
   * @see co.edu.unal.dsl.appPrecio.Evento
   * @see #setEvento(Evento)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getBoton_Evento()
   * @model
   * @generated
   */
  Evento getEvento();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Boton#getEvento <em>Evento</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evento</em>' attribute.
   * @see co.edu.unal.dsl.appPrecio.Evento
   * @see #getEvento()
   * @generated
   */
  void setEvento(Evento value);

  /**
   * Returns the value of the '<em><b>Metodo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metodo</em>' reference.
   * @see #setMetodo(MetodoComponente)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getBoton_Metodo()
   * @model
   * @generated
   */
  MetodoComponente getMetodo();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Boton#getMetodo <em>Metodo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metodo</em>' reference.
   * @see #getMetodo()
   * @generated
   */
  void setMetodo(MetodoComponente value);

} // Boton
