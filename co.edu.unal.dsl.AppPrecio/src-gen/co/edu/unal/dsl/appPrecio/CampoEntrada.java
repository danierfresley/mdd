/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campo Entrada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getContenido <em>Contenido</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getModelo <em>Modelo</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getCampo <em>Campo</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getCampoEntrada()
 * @model
 * @generated
 */
public interface CampoEntrada extends EObject
{
  /**
   * Returns the value of the '<em><b>Contenido</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contenido</em>' attribute.
   * @see #setContenido(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getCampoEntrada_Contenido()
   * @model
   * @generated
   */
  String getContenido();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getContenido <em>Contenido</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contenido</em>' attribute.
   * @see #getContenido()
   * @generated
   */
  void setContenido(String value);

  /**
   * Returns the value of the '<em><b>Modelo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelo</em>' reference.
   * @see #setModelo(Listado)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getCampoEntrada_Modelo()
   * @model
   * @generated
   */
  Listado getModelo();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getModelo <em>Modelo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelo</em>' reference.
   * @see #getModelo()
   * @generated
   */
  void setModelo(Listado value);

  /**
   * Returns the value of the '<em><b>Campo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Campo</em>' reference.
   * @see #setCampo(Propiedad)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getCampoEntrada_Campo()
   * @model
   * @generated
   */
  Propiedad getCampo();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.CampoEntrada#getCampo <em>Campo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Campo</em>' reference.
   * @see #getCampo()
   * @generated
   */
  void setCampo(Propiedad value);

} // CampoEntrada
