package org.myapp.ProbandoMenu;

import java.util.List;

import org.apache.isis.applib.AbstractService;
import org.apache.isis.applib.annotation.Named;

import com.google.common.collect.Lists;

import dom.todo.ToDoItems;











@Named("MenuNuevo")


public class MenuNuevo extends AbstractService
{

	 
	
	
    public String nuevoMenu(@Named("Nombre") String prueba)
    {
        final ToDoItemsFixture menu = new ToDoItemsFixture();
        menu.setContainer(getContainer());
         menu.installFor(prueba);
        return "Example Complatar " + prueba;
    }
	
  
}



