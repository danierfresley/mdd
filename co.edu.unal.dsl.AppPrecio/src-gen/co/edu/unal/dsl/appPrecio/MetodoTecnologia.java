/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodo Tecnologia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getLlave <em>Llave</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoTecnologia()
 * @model
 * @generated
 */
public interface MetodoTecnologia extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoTecnologia_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Llave</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Llave</em>' reference.
   * @see #setLlave(LLave)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoTecnologia_Llave()
   * @model
   * @generated
   */
  LLave getLlave();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getLlave <em>Llave</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Llave</em>' reference.
   * @see #getLlave()
   * @generated
   */
  void setLlave(LLave value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' reference.
   * @see #setValor(TiposArregloListado)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getMetodoTecnologia_Valor()
   * @model
   * @generated
   */
  TiposArregloListado getValor();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia#getValor <em>Valor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' reference.
   * @see #getValor()
   * @generated
   */
  void setValor(TiposArregloListado value);

} // MetodoTecnologia
