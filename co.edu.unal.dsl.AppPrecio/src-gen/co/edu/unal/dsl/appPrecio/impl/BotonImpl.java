/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio.impl;

import co.edu.unal.dsl.appPrecio.AppPrecioPackage;
import co.edu.unal.dsl.appPrecio.Boton;
import co.edu.unal.dsl.appPrecio.Evento;
import co.edu.unal.dsl.appPrecio.MetodoComponente;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonImpl#getContenido <em>Contenido</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonImpl#getEvento <em>Evento</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonImpl#getMetodo <em>Metodo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotonImpl extends MinimalEObjectImpl.Container implements Boton
{
  /**
   * The default value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContenido()
   * @generated
   * @ordered
   */
  protected static final String CONTENIDO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContenido()
   * @generated
   * @ordered
   */
  protected String contenido = CONTENIDO_EDEFAULT;

  /**
   * The default value of the '{@link #getEvento() <em>Evento</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvento()
   * @generated
   * @ordered
   */
  protected static final Evento EVENTO_EDEFAULT = Evento.CLIC;

  /**
   * The cached value of the '{@link #getEvento() <em>Evento</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvento()
   * @generated
   * @ordered
   */
  protected Evento evento = EVENTO_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetodo() <em>Metodo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetodo()
   * @generated
   * @ordered
   */
  protected MetodoComponente metodo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BotonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AppPrecioPackage.Literals.BOTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContenido()
  {
    return contenido;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContenido(String newContenido)
  {
    String oldContenido = contenido;
    contenido = newContenido;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON__CONTENIDO, oldContenido, contenido));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Evento getEvento()
  {
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEvento(Evento newEvento)
  {
    Evento oldEvento = evento;
    evento = newEvento == null ? EVENTO_EDEFAULT : newEvento;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON__EVENTO, oldEvento, evento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetodoComponente getMetodo()
  {
    if (metodo != null && metodo.eIsProxy())
    {
      InternalEObject oldMetodo = (InternalEObject)metodo;
      metodo = (MetodoComponente)eResolveProxy(oldMetodo);
      if (metodo != oldMetodo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPrecioPackage.BOTON__METODO, oldMetodo, metodo));
      }
    }
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetodoComponente basicGetMetodo()
  {
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetodo(MetodoComponente newMetodo)
  {
    MetodoComponente oldMetodo = metodo;
    metodo = newMetodo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON__METODO, oldMetodo, metodo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AppPrecioPackage.BOTON__CONTENIDO:
        return getContenido();
      case AppPrecioPackage.BOTON__EVENTO:
        return getEvento();
      case AppPrecioPackage.BOTON__METODO:
        if (resolve) return getMetodo();
        return basicGetMetodo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppPrecioPackage.BOTON__CONTENIDO:
        setContenido((String)newValue);
        return;
      case AppPrecioPackage.BOTON__EVENTO:
        setEvento((Evento)newValue);
        return;
      case AppPrecioPackage.BOTON__METODO:
        setMetodo((MetodoComponente)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AppPrecioPackage.BOTON__CONTENIDO:
        setContenido(CONTENIDO_EDEFAULT);
        return;
      case AppPrecioPackage.BOTON__EVENTO:
        setEvento(EVENTO_EDEFAULT);
        return;
      case AppPrecioPackage.BOTON__METODO:
        setMetodo((MetodoComponente)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AppPrecioPackage.BOTON__CONTENIDO:
        return CONTENIDO_EDEFAULT == null ? contenido != null : !CONTENIDO_EDEFAULT.equals(contenido);
      case AppPrecioPackage.BOTON__EVENTO:
        return evento != EVENTO_EDEFAULT;
      case AppPrecioPackage.BOTON__METODO:
        return metodo != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (contenido: ");
    result.append(contenido);
    result.append(", evento: ");
    result.append(evento);
    result.append(')');
    return result.toString();
  }

} //BotonImpl
