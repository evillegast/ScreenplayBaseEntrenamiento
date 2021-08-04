package userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearEmpleado extends PageObject {

    public static final Target INP_PIM = Target.the("INGRESAR PIM").located(By.id("menu_pim_viewPimModule"));
    public static final Target ADD_EMPLOYEE = Target.the("ADD").located(By.id("menu_pim_addEmployee"));
    public static final Target FIRTS_NAME = Target.the("").located(By.id("firstName"));
    public static final Target MIDDLE_NAME = Target.the("").located(By.id("middleName"));
    public static final Target LASTNAME = Target.the("").located(By.id("lastName"));
    public static final Target BTN_SAVE = Target.the("").located(By.id("btnSave"));
    public static final Target BTN_EDIT = Target.the("").located(By.id("btnSave"));
    public static final Target INP_LICENCIA = Target.the("").located(By.id("personal_txtLicenNo"));
    public static final Target BTN_CALENDARIO = Target.the("").located(By.id("personal_txtLicExpDate"));
    public static final Target BTN_GENERO = Target.the("").located(By.id("personal_optGender_1"));
    public static final Target BTN_PAIS = Target.the("").located(By.id("personal_cmbNation"));








}
