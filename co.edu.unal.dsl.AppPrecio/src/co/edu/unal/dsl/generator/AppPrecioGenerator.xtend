/*
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import co.edu.unal.dsl.appPrecio.Componente
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import co.edu.unal.dsl.appPrecio.CampoEntrada
import co.edu.unal.dsl.appPrecio.Boton
import co.edu.unal.dsl.appPrecio.BotonOpcionItem
import org.apache.log4j.config.PropertyGetter.PropertyCallback

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AppPrecioGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			
		for(e : resource.allContents.toIterable.filter(Componente)) {
			
			fsa.generateFile("/"+e.fullyQualifiedName.toString("/").toLowerCase+"/"+
				e.fullyQualifiedName.toString("/").toLowerCase +".module.ts",
				e.compileModule)
			
			fsa.generateFile("/"+e.fullyQualifiedName.toString("/").toLowerCase+"/"+
				e.fullyQualifiedName.toString("/").toLowerCase +".page.html",
				e.compileHtml)
				
			fsa.generateFile("/"+e.fullyQualifiedName.toString("/").toLowerCase+"/"+
				e.fullyQualifiedName.toString("/").toLowerCase +".page.ts",
				e.compileComponent)
			
			fsa.generateFile("/"+e.fullyQualifiedName.toString("/").toLowerCase+"/"+
				e.fullyQualifiedName.toString("/").toLowerCase +".page.scss",
				e.compileSCSS)
				
			fsa.generateFile("/"+e.servicio.fullyQualifiedName.toString("/").toLowerCase+"/"+
				e.servicio.fullyQualifiedName.toString("/").toLowerCase +".service.ts",
				e.compileService)
			
		}
			
	}
	
	
	def CharSequence compileModule(Componente c)'''
		import { NgModule } from '@angular/core';
		import { CommonModule } from '@angular/common';
		import { IonicModule } from '@ionic/angular';
		import { FormsModule } from '@angular/forms';
		import { RouterModule } from '@angular/router';
		
		import { «c.name.toFirstUpper»Page } from './«c.name.toLowerCase».page';
		
		@NgModule({
		  imports: [
		    CommonModule,
		    FormsModule,
		    IonicModule,
		    RouterModule.forChild([
		      {
		        path: '',
		        component: «c.name.toFirstUpper»Page
		      }
		    ])
		  ],
		  declarations: [«c.name.toFirstUpper»Page]
		})
		export class «c.name.toFirstUpper»PageModule {}
	'''
	
	def CharSequence compileHtml(Componente c)'''
			<ion-header>
			  <ion-toolbar color="primary">
			    <ion-title>
			      «c.titulo»
			    </ion-title>
			  </ion-toolbar>
			</ion-header>
			
			<ion-content>
			
			«FOR ce : c.camposEntradas»
				«ce.compileCamposEntrada»
			«ENDFOR»
			
			«FOR cb : c.botones»
				«cb.compileBotones»
			«ENDFOR»
			
			
			  <ion-list #«c.lista.name»>
			    
			    <ion-list-header>
			      <ion-label>«c.lista.contenido»</ion-label>
			    </ion-list-header>
			
			    <ion-item-sliding *ngFor="let item of «c.arreglos.get(0).name»">
				
			      <ion-item>
			        <ion-label class="ion-text-wrap">
			          «FOR p : c.interfaz.propiedades»
			          	«IF p.name.equals("almacen")» <h2>{{ item.«p.name»}}</h2>  «ENDIF»
			          «ENDFOR»
			          «FOR p : c.interfaz.propiedades»
				        «IF p.name.equals("producto")»
				        <h1>{{ item.«p.name» | uppercase }}</h1> 
				        «ENDIF»
				      «ENDFOR»
				      «FOR p : c.interfaz.propiedades»
				      	  «IF p.name.equals("precio")»
				      	  <ion-text color="primary">
				      	  <p>{{ item.«p.name» | currency:'USD':'$':'1.0'}}</p>
				      	  </ion-text>
				          «ENDIF»
				      «ENDFOR»
				      «FOR p : c.interfaz.propiedades»
				      	  «IF p.name.equals("modifica")»
				      	  <p>{{ item.«p.name» | date:'short' }}</p>
				          «ENDIF»
				      «ENDFOR»
			        </ion-label>
			      </ion-item>
			
			      <ion-item-options>
					«FOR cboi : c.botonesOpcionItem»
						«cboi.compileBotonesOpcionItem»
					«ENDFOR»
			      </ion-item-options>
			
			    </ion-item-sliding>
			
			  </ion-list>
			
			</ion-content>
	'''
	
	def CharSequence compileCamposEntrada(CampoEntrada ce)'''
		 <ion-item>
		    <ion-label position="fixed">«ce.contenido»</ion-label>
		    <ion-input [(ngModel)]=«ce.modelo.name».«ce.campo.name»></ion-input>
		  </ion-item>
	'''
	
	def CharSequence compileBotones(Boton b)'''
		  <ion-button expand="full" («b.evento»)="«b.metodo.name»()">«b.contenido»</ion-button>
	'''
	
	def CharSequence compileBotonesOpcionItem(BotonOpcionItem b)'''
		<ion-item-option color="«b.color»" («b.evento»)="«b.metodo.name»(item)">«b.contenido»</ion-item-option>
	'''
	
	def CharSequence compileComponent(Componente c)'''
		import { Component, ViewChild } from '@angular/core';
		import { StorageService, Item } from '../services/storage.service';
		import { Platform, ToastController, IonList } from '@ionic/angular';
		
		@Component({
		  selector: 'app-«c.name.toLowerCase»',
		  templateUrl: '«c.name.toLowerCase».page.html',
		  styleUrls: ['«c.name.toLowerCase».page.scss'],
		})
		
		export class «c.name.toLowerCase»Page {
			
		  «FOR a : c.arreglos»
		 	«IF a.name.equals("items")» 
		  		«a.name»: «c.interfaz.name»[] = [];
		  	«ENDIF»
		  «ENDFOR»
		  
		  «FOR l : c.listado»
			  «IF l.name.equals("newItem")»
		  	  	«l.name»: «c.interfaz.name» = <«c.interfaz.name»>{};
		  	  «ENDIF»
	  	  «ENDFOR»

		  @ViewChild('«c.lista.name.toLowerCase»', {static: true}) mylist: IonList;
		  
		  constructor(private «c.servicio.name.toLowerCase»Service: StorageService, private plt: Platform, private toastController: ToastController) {
		      this.plt.ready().then(()=>{
		      	«FOR m : c.metodos»
		      		«IF m.name.equals("loadItems")»
		      			this.«m.name»();
		      		«ENDIF»
		        «ENDFOR»
		      });
		    }
		    
		    /** Create */
		    «FOR m : c.metodos»
		    	«IF m.name.equals("addItem")»
			      «m.name»() {
			      		«FOR l : c.listado»
			      			«IF l.name.equals("newItem")»
			      				«FOR p : c.interfaz.propiedades»
			      					«IF p.name.equals("modifica")»
			      					this.«l.name».«p.name» = Date.now();
			        				«ENDIF»	
			        			«ENDFOR»
			        		«ENDIF»
			        	«ENDFOR»
			        	«FOR l : c.listado»
			        		«IF l.name.equals("newItem")»
			        			«FOR p : c.interfaz.propiedades»
			        				«IF p.name.equals("id")»
			        				this.«l.name».«p.name» = Date.now();
			        				«ENDIF»
			        			«ENDFOR»
			        		«ENDIF»
			        	«ENDFOR»
				      	«FOR l : c.listado»
				      		«IF l.name.equals("newItem")»
				      			«FOR sm : c.servicio.metodos»
				      				«IF sm.name.equals("add")»
						      		this.«c.servicio.name.toLowerCase»Service.«sm.name»(this.«l.name»).then(item =>{
						      		this.«l.name» = <«c.interfaz.name»>{};
						      		«ENDIF»
						      	«ENDFOR»
				        	«ENDIF»
				        «ENDFOR»
			          				this.showToast('«m.mensaje»');
			          	«FOR me : c.metodos»
				          «IF me.name.equals("loadItems")»
	  				          this.«me.name»();
	  				        });
	  				      }
	  	  				  «ENDIF»
	  	  				«ENDFOR»
		      	  «ENDIF»
		      «ENDFOR»
		      
		      /** Read */
		      «FOR m : c.metodos»
		      	«IF m.name.equals("loadItems")»
		        	«m.name»() {	
		        		
				    «FOR sm : c.servicio.metodos»
				      	«IF sm.name.equals("getAll")»
					          this.«c.servicio.name.toLowerCase»Service.«sm.name»().then(items => {
					    «ENDIF»
					«ENDFOR»
					
			   		«FOR a : c.arreglos»
					   	«IF a.name.equals("items")»
					            this.«a.name» = items;
					          });
					        }
						«ENDIF»
				   «ENDFOR»
				   
				  «ENDIF»   
			   «ENDFOR»	
			   
			   
			   /** update */
   			   «FOR m : c.metodos»
   			   	   «IF m.name.equals("updateItem")»
   			     	   «m.name»(item: «c.interfaz.name») {	 
   			     	   «FOR p : c.interfaz.propiedades»
		   			   		«IF p.name.equals("almacen")»
					       item.«p.name» = `UPDATED: ${item.«p.name»}`;
					       	«ENDIF»
					       	«IF p.name.equals("modifica")»
					       item.«p.name» = Date.now();
					       	«ENDIF»
					   «ENDFOR»
					   «FOR sm : c.servicio.metodos»
					   		«IF sm.name.equals("update")»
					       this.«c.servicio.name.toLowerCase»Service.«sm.name»(item).then(item =>{
					       	«ENDIF»
					   «ENDFOR»
					   «IF m.name.equals("updateItem")»
   				         this.showToast('«m.mensaje»');
   				         this.mylist.closeSlidingItems();
   				         «ENDIF»
   			     		«FOR me : c.metodos» 
   			     			«IF me.name.equals("loadItems")»
	   			     			this.«me.name»();
						         });
					          }
				       		«ENDIF»
				       	«ENDFOR»
   			     	«ENDIF»
   			   «ENDFOR»
   			   
   			   
   			   
   			   /** Delete */
   			    «FOR m : c.metodos»
   			     	«IF m.name.equals("deleteItem")»
   			     		«m.name»(item: «c.interfaz.name»){
   					     «FOR sm : c.servicio.metodos»
   					     	«IF sm.name.equals("delete")»
   					       this.«c.servicio.name.toLowerCase»Service.«sm.name»(item.id).then(item =>{
   					       	«ENDIF»
   					     «ENDFOR»
   				     	«IF m.name.equals("deleteItem")»
   				         this.showToast('«m.mensaje»');
   				         this.mylist.closeSlidingItems();
   				         «ENDIF»
   				         «FOR me : c.metodos»
		   				    «IF me.name.equals("loadItems")»
						         this.«me.name»();
							       });
						     }
						     «ENDIF»
						 «ENDFOR»
   			   		«ENDIF»
   			   	«ENDFOR»
   			   
			   
			     /** Helper */
			     async showToast(msg) {
			       const toast = await this.toastController.create({
			         message: msg,
			         duration: 2000
			       });
			       toast.present();
			   
			     }
			   
		}
	'''
	
	def CharSequence compileSCSS(Componente c)'''
		
	'''
	
	def CharSequence compileService(Componente c)'''
		import { Injectable } from '@angular/core';
		import { Storage } from '@ionic/storage';
		
		export interface «c.interfaz.name» {
			«FOR p : c.interfaz.propiedades»
				«IF p.name.equals("id")»
					«p.name»: number,
		  		«ENDIF»
		  		«IF p.name.equals("almacen")»
		  			«p.name»: string,
		  		«ENDIF»
		  		«IF p.name.equals("producto")»
		  			«p.name»: string,
		  		«ENDIF»
		  		«IF p.name.equals("precio")»
		  			«p.name»: number,
		  		«ENDIF»
				«IF p.name.equals("modifica")»
				«p.name»: number
		  		«ENDIF»
		  «ENDFOR»
		}
		
		const ITEMS_KEY = '«c.tecnologia.llave.name»';
		
		@Injectable({
		  providedIn: 'root'
		})
		
		export class «c.servicio.name.toFirstUpper»Service {
			
			constructor(private «c.servicio.name»: Storage) { }
			
			/** Create */
			«FOR m : c.servicio.metodos»
			  «IF m.name.equals("add")» «m.name»(item: «c.interfaz.name»): Promise<any> {
			    return this.«c.servicio.name».get(ITEMS_KEY).then((items: «c.interfaz.name»[]) => {
			      if (items) {
			        items.push(item);
			        return this.«c.servicio.name».set(ITEMS_KEY, items);
			      }else {
			        return this.«c.servicio.name».set(ITEMS_KEY, [item]);
			      }
			    });
			  }
			  «ENDIF»
			 «ENDFOR»
			 
			 /** Read */
			 «FOR m : c.servicio.metodos»			 
			   «IF m.name.equals("getAll")» «m.name»(): Promise<«c.interfaz.name»[]> {
			     return this.«c.servicio.name».get(ITEMS_KEY);
			   }
			   «ENDIF»
			 «ENDFOR»
			 
			 /** Update */
			 «FOR m : c.servicio.metodos»
			   «IF m.name.equals("update")»
			   «m.name»(item: «c.interfaz.name»): Promise<any> {
			     return this.«c.servicio.name».get(ITEMS_KEY).then((items: «c.interfaz.name»[]) => {
			       
			       if (!items || items.length == 0) {
			         return null;
			       }
			       
				«FOR a : c.arreglos»
			       «IF a.name.equals("newItems")»let «a.name»: «c.interfaz.name»[] = [];

					       for (let i of items) {
					         if (i.id == item.id) {
					           «a.name».push(item);
					         } else {
					           «a.name».push(i);
					         }
					       }
		
					       return this.«c.interfaz.name».set(ITEMS_KEY, «a.name»);
		
					     });
					   }
			   		«ENDIF»
			    «ENDFOR»
			   «ENDIF»
			  «ENDFOR»

			  
			  /** Delete */
			  «FOR m : c.servicio.metodos»
			    «IF m.name.equals("delete")»

			    «m.name»(id: number): Promise<«c.interfaz.name»> {
			    
			      return this.«c.servicio.name».get(ITEMS_KEY).then((items: «c.interfaz.name»[]) =>{
			        if (!items || items.length == 0) {
			          return null;
			        }
			  
			        let toKepp: «c.interfaz.name»[] = [];
			  
			        for (let i of items) {
			          «FOR p : c.interfaz.propiedades»
			          «IF p.name.equals("id")»if (i.«p.name» != id) {«ENDIF»
			          «ENDFOR»
			            toKepp.push(i);
			          }
			        }
			  
			        return this.«c.servicio.name».set(ITEMS_KEY, toKepp);
			  
			      });
			    }
			    «ENDIF»
			   «ENDFOR»
			  
			  
			  
			
		}
		
	'''
	
}
