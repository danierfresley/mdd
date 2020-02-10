/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipos Arreglo Listado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.TiposArregloListado#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.TiposArregloListado#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getTiposArregloListado()
 * @model
 * @generated
 */
public interface TiposArregloListado extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getTiposArregloListado_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.TiposArregloListado#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' reference.
   * @see #setTipo(Entidad)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getTiposArregloListado_Tipo()
   * @model
   * @generated
   */
  Entidad getTipo();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.TiposArregloListado#getTipo <em>Tipo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' reference.
   * @see #getTipo()
   * @generated
   */
  void setTipo(Entidad value);

} // TiposArregloListado