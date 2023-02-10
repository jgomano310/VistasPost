package edu.dws.ProyectoWeb12.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ProyectoWeb12.clases.Alumno;


@Controller
public class ControladorSegunda {

	  protected final Log logger = LogFactory.getLog(getClass());
	  
	  List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	  Map<String, Object> miAlumno = new HashMap<String,Object>();
      
      
	    
	    @RequestMapping(value="/segunda")
	    public ModelAndView MuestraAlumnos() {
	    	
	         
	       
	        
	         Alumno alumno = new Alumno("javier", "gomez");
	         Alumno alumno2 = new Alumno("javier", "gomez2");
	        
	        
	         listaAlumnos.add(alumno);
	         listaAlumnos.add(alumno2);
	         
	         miAlumno.put("listaAlumnos", listaAlumnos);
	        return new ModelAndView("segunda", "miAlumno", miAlumno);
	        
	       
	
}
	    //devuelvo un string ya que directamente así con el req. mapping va directamente a la vista.
	    @RequestMapping(value="Formulario")
	    public String Navegacion(Model modelo) {
	    	
	    	logger.info("se dirije al formulario");
	    	
	    	Alumno alumno = new Alumno();
	    	
	    	modelo.addAttribute("alumnoModelo", alumno);
	    	
	    	
			return "Formulario";
	    	
	    }
	    
	    @RequestMapping(value="/guardarAlumno",method = RequestMethod.POST)
	    public ModelAndView guardarAlumno(@ModelAttribute("alumnoModelo") Alumno alumnoModelo) {
	    	
	    	logger.info("guardando alumno");
	    	
	    	listaAlumnos.add(alumnoModelo);
	    	
	    	miAlumno.put("listaAlumnos", miAlumno);
	    	
	    	
	    	
			return new ModelAndView("Formulario", "miAlumno",miAlumno);
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
}
