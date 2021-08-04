package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarEmpleado extends PageObject {

    public static final Target INP_EMPLOYEE_LIST = Target.the("INGRESAR_EMPLEADO").located(By.id("menu_pim_viewEmployeeList"));
    public static final Target INP_CHECK_BOX = Target.the("Eliminar_Empleado").located(By.id("ohrmList_chkSelectRecord_41"));
    public static final Target INP_BORRAR = Target.the("Borrar_Empleado").located(By.id("btnDelete"));
    public static final Target INP_OK_BORRAR = Target.the("OK_BORRAR").located(By.id("dialogDeleteBtn"));

}
