/**
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.appPrecio.util;

import co.edu.unal.dsl.appPrecio.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.unal.dsl.appPrecio.AppPrecioPackage
 * @generated
 */
public class AppPrecioAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppPrecioPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppPrecioAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AppPrecioPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppPrecioSwitch<Adapter> modelSwitch =
    new AppPrecioSwitch<Adapter>()
    {
      @Override
      public Adapter caseAppPrecio(AppPrecio object)
      {
        return createAppPrecioAdapter();
      }
      @Override
      public Adapter caseDominio(Dominio object)
      {
        return createDominioAdapter();
      }
      @Override
      public Adapter caseArquitectura(Arquitectura object)
      {
        return createArquitecturaAdapter();
      }
      @Override
      public Adapter caseTecnologia(Tecnologia object)
      {
        return createTecnologiaAdapter();
      }
      @Override
      public Adapter caseServicio(Servicio object)
      {
        return createServicioAdapter();
      }
      @Override
      public Adapter caseMetodoComponente(MetodoComponente object)
      {
        return createMetodoComponenteAdapter();
      }
      @Override
      public Adapter caseMetodoServicio(MetodoServicio object)
      {
        return createMetodoServicioAdapter();
      }
      @Override
      public Adapter caseMetodoTecnologia(MetodoTecnologia object)
      {
        return createMetodoTecnologiaAdapter();
      }
      @Override
      public Adapter caseEntidad(Entidad object)
      {
        return createEntidadAdapter();
      }
      @Override
      public Adapter caseInterfaz(Interfaz object)
      {
        return createInterfazAdapter();
      }
      @Override
      public Adapter casePropiedad(Propiedad object)
      {
        return createPropiedadAdapter();
      }
      @Override
      public Adapter caseComponente(Componente object)
      {
        return createComponenteAdapter();
      }
      @Override
      public Adapter caseCampoEntrada(CampoEntrada object)
      {
        return createCampoEntradaAdapter();
      }
      @Override
      public Adapter caseBoton(Boton object)
      {
        return createBotonAdapter();
      }
      @Override
      public Adapter caseBotonOpcionItem(BotonOpcionItem object)
      {
        return createBotonOpcionItemAdapter();
      }
      @Override
      public Adapter caseLista(Lista object)
      {
        return createListaAdapter();
      }
      @Override
      public Adapter caseTipos(Tipos object)
      {
        return createTiposAdapter();
      }
      @Override
      public Adapter caseLLave(LLave object)
      {
        return createLLaveAdapter();
      }
      @Override
      public Adapter caseArreglo(Arreglo object)
      {
        return createArregloAdapter();
      }
      @Override
      public Adapter caseListado(Listado object)
      {
        return createListadoAdapter();
      }
      @Override
      public Adapter caseTiposArregloListado(TiposArregloListado object)
      {
        return createTiposArregloListadoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.AppPrecio <em>App Precio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.AppPrecio
   * @generated
   */
  public Adapter createAppPrecioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Dominio <em>Dominio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Dominio
   * @generated
   */
  public Adapter createDominioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Arquitectura <em>Arquitectura</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Arquitectura
   * @generated
   */
  public Adapter createArquitecturaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Tecnologia <em>Tecnologia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Tecnologia
   * @generated
   */
  public Adapter createTecnologiaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Servicio <em>Servicio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Servicio
   * @generated
   */
  public Adapter createServicioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.MetodoComponente <em>Metodo Componente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.MetodoComponente
   * @generated
   */
  public Adapter createMetodoComponenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.MetodoServicio <em>Metodo Servicio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.MetodoServicio
   * @generated
   */
  public Adapter createMetodoServicioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.MetodoTecnologia <em>Metodo Tecnologia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.MetodoTecnologia
   * @generated
   */
  public Adapter createMetodoTecnologiaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Entidad <em>Entidad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Entidad
   * @generated
   */
  public Adapter createEntidadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Interfaz <em>Interfaz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Interfaz
   * @generated
   */
  public Adapter createInterfazAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Propiedad <em>Propiedad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Propiedad
   * @generated
   */
  public Adapter createPropiedadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Componente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Componente
   * @generated
   */
  public Adapter createComponenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.CampoEntrada <em>Campo Entrada</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.CampoEntrada
   * @generated
   */
  public Adapter createCampoEntradaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Boton <em>Boton</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Boton
   * @generated
   */
  public Adapter createBotonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.BotonOpcionItem <em>Boton Opcion Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.BotonOpcionItem
   * @generated
   */
  public Adapter createBotonOpcionItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Lista <em>Lista</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Lista
   * @generated
   */
  public Adapter createListaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Tipos <em>Tipos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Tipos
   * @generated
   */
  public Adapter createTiposAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.LLave <em>LLave</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.LLave
   * @generated
   */
  public Adapter createLLaveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Arreglo <em>Arreglo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Arreglo
   * @generated
   */
  public Adapter createArregloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.Listado <em>Listado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.Listado
   * @generated
   */
  public Adapter createListadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.unal.dsl.appPrecio.TiposArregloListado <em>Tipos Arreglo Listado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.unal.dsl.appPrecio.TiposArregloListado
   * @generated
   */
  public Adapter createTiposArregloListadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AppPrecioAdapterFactory
