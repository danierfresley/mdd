/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getInterfaz <em>Interfaz</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getServicio <em>Servicio</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getTecnologia <em>Tecnologia</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getCamposEntradas <em>Campos Entradas</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getBotones <em>Botones</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getBotonesOpcionItem <em>Botones Opcion Item</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getArreglos <em>Arreglos</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getListado <em>Listado</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.Componente#getLista <em>Lista</em>}</li>
 * </ul>
 *
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente()
 * @model
 * @generated
 */
public interface Componente extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interfaz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaz</em>' reference.
   * @see #setInterfaz(Interfaz)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Interfaz()
   * @model
   * @generated
   */
  Interfaz getInterfaz();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getInterfaz <em>Interfaz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interfaz</em>' reference.
   * @see #getInterfaz()
   * @generated
   */
  void setInterfaz(Interfaz value);

  /**
   * Returns the value of the '<em><b>Servicio</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servicio</em>' reference.
   * @see #setServicio(Servicio)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Servicio()
   * @model
   * @generated
   */
  Servicio getServicio();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getServicio <em>Servicio</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servicio</em>' reference.
   * @see #getServicio()
   * @generated
   */
  void setServicio(Servicio value);

  /**
   * Returns the value of the '<em><b>Tecnologia</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tecnologia</em>' reference.
   * @see #setTecnologia(Tecnologia)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Tecnologia()
   * @model
   * @generated
   */
  Tecnologia getTecnologia();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getTecnologia <em>Tecnologia</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tecnologia</em>' reference.
   * @see #getTecnologia()
   * @generated
   */
  void setTecnologia(Tecnologia value);

  /**
   * Returns the value of the '<em><b>Titulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Titulo</em>' attribute.
   * @see #setTitulo(String)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Titulo()
   * @model
   * @generated
   */
  String getTitulo();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getTitulo <em>Titulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Titulo</em>' attribute.
   * @see #getTitulo()
   * @generated
   */
  void setTitulo(String value);

  /**
   * Returns the value of the '<em><b>Campos Entradas</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.CampoEntrada}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Campos Entradas</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_CamposEntradas()
   * @model containment="true"
   * @generated
   */
  EList<CampoEntrada> getCamposEntradas();

  /**
   * Returns the value of the '<em><b>Botones</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.Boton}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Botones</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Botones()
   * @model containment="true"
   * @generated
   */
  EList<Boton> getBotones();

  /**
   * Returns the value of the '<em><b>Botones Opcion Item</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.BotonOpcionItem}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Botones Opcion Item</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_BotonesOpcionItem()
   * @model containment="true"
   * @generated
   */
  EList<BotonOpcionItem> getBotonesOpcionItem();

  /**
   * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.MetodoComponente}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metodos</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Metodos()
   * @model containment="true"
   * @generated
   */
  EList<MetodoComponente> getMetodos();

  /**
   * Returns the value of the '<em><b>Arreglos</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.Arreglo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arreglos</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Arreglos()
   * @model containment="true"
   * @generated
   */
  EList<Arreglo> getArreglos();

  /**
   * Returns the value of the '<em><b>Listado</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.unal.dsl.appPrecio.Listado}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listado</em>' containment reference list.
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Listado()
   * @model containment="true"
   * @generated
   */
  EList<Listado> getListado();

  /**
   * Returns the value of the '<em><b>Lista</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lista</em>' containment reference.
   * @see #setLista(Lista)
   * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage#getComponente_Lista()
   * @model containment="true"
   * @generated
   */
  Lista getLista();

  /**
   * Sets the value of the '{@link co.edu.unal.dsl.appPrecio.Componente#getLista <em>Lista</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lista</em>' containment reference.
   * @see #getLista()
   * @generated
   */
  void setLista(Lista value);

} // Componente