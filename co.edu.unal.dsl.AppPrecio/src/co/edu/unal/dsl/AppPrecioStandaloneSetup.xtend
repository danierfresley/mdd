/*
 * generated by Xtext 2.19.0
 */
package co.edu.unal.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AppPrecioStandaloneSetup extends AppPrecioStandaloneSetupGenerated {

	def static void doSetup() {
		new AppPrecioStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
