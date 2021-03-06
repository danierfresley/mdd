/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodo Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getMetodoServicio <em>Metodo Servicio</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoComponente()
 * @model
 * @generated
 */
public interface MetodoComponente extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoComponente_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Metodo Servicio</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metodo Servicio</em>' reference.
   * @see #setMetodoServicio(MetodoServicio)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoComponente_MetodoServicio()
   * @model
   * @generated
   */
  MetodoServicio getMetodoServicio();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getMetodoServicio <em>Metodo Servicio</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metodo Servicio</em>' reference.
   * @see #getMetodoServicio()
   * @generated
   */
  void setMetodoServicio(MetodoServicio value);

  /**
   * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mensaje</em>' attribute.
   * @see #setMensaje(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoComponente_Mensaje()
   * @model
   * @generated
   */
  String getMensaje();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoComponente#getMensaje <em>Mensaje</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mensaje</em>' attribute.
   * @see #getMensaje()
   * @generated
   */
  void setMensaje(String value);

} // MetodoComponente
