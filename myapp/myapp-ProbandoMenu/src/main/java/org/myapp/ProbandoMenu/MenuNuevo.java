package org.myapp.ProbandoMenu;

import java.util.List;

import org.apache.isis.applib.AbstractService;
import org.apache.isis.applib.annotation.Named;

import com.google.common.collect.Lists;

import dom.todo.ToDoItems;











@Named("MenuNuevo")

// muchachines bueno para que les agregue el menu siempre tiene que tener un submenu
//asi solito no te deja porque.... nose..eso lo que estoy viendo ahora. por ahora le subo esto
// bueno aca utilice las clase AbstractService que estan en fixture por lo que si le dan f3 a AbstractService
//van a encontrar un par de metodos(get y set) que es solo para el nombre del menu ... pero despues ahi otra clase
//abstracta que es la de AbstractFixture que si vamos a ToDoItemsFixture nos paramos sobr ella hacemos F3 nos llevara ahi.. que es lo que estoy analizando ahora.

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



