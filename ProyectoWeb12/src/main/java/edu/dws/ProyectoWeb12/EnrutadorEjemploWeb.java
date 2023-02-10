package edu.dws.ProyectoWeb12;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.dws.ProyectoWeb12.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ProyectoWeb12.web.WebConfiguracionContexto;



public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	   @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class<?>[] { AplicacionConfiguracionContexto.class };
	    }

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class<?>[] { WebConfiguracionContexto.class };
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }

}
