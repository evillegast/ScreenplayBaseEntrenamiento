package models;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Usuario implements Interaction {

    String usuario;
    String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) { this.usuario = usuario;}

    public String getPassword() { return password;}

    public void setPassword(String password) {this.password = password; }

    @Override
    public <T extends Actor> void performAs(T actor) {


    }
}







