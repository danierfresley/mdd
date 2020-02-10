/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio.impl;

import co.edu.unal.dsl.appPrecio.AppPrecioPackage;
import co.edu.unal.dsl.appPrecio.BotonOpcionItem;
import co.edu.unal.dsl.appPrecio.Color;
import co.edu.unal.dsl.appPrecio.Evento;
import co.edu.unal.dsl.appPrecio.MetodoComponente;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boton Opcion Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonOpcionItemImpl#getContenido <em>Contenido</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonOpcionItemImpl#getEvento <em>Evento</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonOpcionItemImpl#getColor <em>Color</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.BotonOpcionItemImpl#getMetodo <em>Metodo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotonOpcionItemImpl extends MinimalEObjectImpl.Container implements BotonOpcionItem
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
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final Color COLOR_EDEFAULT = Color.COLOR1;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color = COLOR_EDEFAULT;

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
  protected BotonOpcionItemImpl()
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
    return AppPrecioPackage.Literals.BOTON_OPCION_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON_OPCION_ITEM__CONTENIDO, oldContenido, contenido));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON_OPCION_ITEM__EVENTO, oldEvento, evento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON_OPCION_ITEM__COLOR, oldColor, color));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPrecioPackage.BOTON_OPCION_ITEM__METODO, oldMetodo, metodo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AppPrecioPackage.BOTON_OPCION_ITEM__METODO, oldMetodo, metodo));
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
      case AppPrecioPackage.BOTON_OPCION_ITEM__CONTENIDO:
        return getContenido();
      case AppPrecioPackage.BOTON_OPCION_ITEM__EVENTO:
        return getEvento();
      case AppPrecioPackage.BOTON_OPCION_ITEM__COLOR:
        return getColor();
      case AppPrecioPackage.BOTON_OPCION_ITEM__METODO:
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
      case AppPrecioPackage.BOTON_OPCION_ITEM__CONTENIDO:
        setContenido((String)newValue);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__EVENTO:
        setEvento((Evento)newValue);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__COLOR:
        setColor((Color)newValue);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__METODO:
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
      case AppPrecioPackage.BOTON_OPCION_ITEM__CONTENIDO:
        setContenido(CONTENIDO_EDEFAULT);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__EVENTO:
        setEvento(EVENTO_EDEFAULT);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case AppPrecioPackage.BOTON_OPCION_ITEM__METODO:
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
      case AppPrecioPackage.BOTON_OPCION_ITEM__CONTENIDO:
        return CONTENIDO_EDEFAULT == null ? contenido != null : !CONTENIDO_EDEFAULT.equals(contenido);
      case AppPrecioPackage.BOTON_OPCION_ITEM__EVENTO:
        return evento != EVENTO_EDEFAULT;
      case AppPrecioPackage.BOTON_OPCION_ITEM__COLOR:
        return color != COLOR_EDEFAULT;
      case AppPrecioPackage.BOTON_OPCION_ITEM__METODO:
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
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //BotonOpcionItemImpl
