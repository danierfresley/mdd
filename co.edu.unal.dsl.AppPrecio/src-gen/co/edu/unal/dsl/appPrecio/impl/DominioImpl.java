/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio.impl;

import co.edu.unal.dsl.appPrecio.AppPrecioPackage;
import co.edu.unal.dsl.appPrecio.Dominio;
import co.edu.unal.dsl.appPrecio.Entidad;
import co.edu.unal.dsl.appPrecio.Servicio;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dominio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.DominioImpl#getServicios <em>Servicios</em>}</li>
 *   <li>{@link co.edu.unal.dsl.appPrecio.impl.DominioImpl#getEntidades <em>Entidades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DominioImpl extends MinimalEObjectImpl.Container implements Dominio
{
  /**
   * The cached value of the '{@link #getServicios() <em>Servicios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicios()
   * @generated
   * @ordered
   */
  protected EList<Servicio> servicios;

  /**
   * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntidades()
   * @generated
   * @ordered
   */
  protected EList<Entidad> entidades;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DominioImpl()
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
    return AppPrecioPackage.Literals.DOMINIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Servicio> getServicios()
  {
    if (servicios == null)
    {
      servicios = new EObjectContainmentEList<Servicio>(Servicio.class, this, AppPrecioPackage.DOMINIO__SERVICIOS);
    }
    return servicios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entidad> getEntidades()
  {
    if (entidades == null)
    {
      entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, AppPrecioPackage.DOMINIO__ENTIDADES);
    }
    return entidades;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AppPrecioPackage.DOMINIO__SERVICIOS:
        return ((InternalEList<?>)getServicios()).basicRemove(otherEnd, msgs);
      case AppPrecioPackage.DOMINIO__ENTIDADES:
        return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AppPrecioPackage.DOMINIO__SERVICIOS:
        return getServicios();
      case AppPrecioPackage.DOMINIO__ENTIDADES:
        return getEntidades();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppPrecioPackage.DOMINIO__SERVICIOS:
        getServicios().clear();
        getServicios().addAll((Collection<? extends Servicio>)newValue);
        return;
      case AppPrecioPackage.DOMINIO__ENTIDADES:
        getEntidades().clear();
        getEntidades().addAll((Collection<? extends Entidad>)newValue);
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
      case AppPrecioPackage.DOMINIO__SERVICIOS:
        getServicios().clear();
        return;
      case AppPrecioPackage.DOMINIO__ENTIDADES:
        getEntidades().clear();
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
      case AppPrecioPackage.DOMINIO__SERVICIOS:
        return servicios != null && !servicios.isEmpty();
      case AppPrecioPackage.DOMINIO__ENTIDADES:
        return entidades != null && !entidades.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DominioImpl
