/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicas.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fer_g
 */
/**
 * En esta clase se gestiona la autenticaci�n y permisos del usuario
 *
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;
    private FacesContext facesContext;
    
    
    	public String verificar() throws Exception {
                if(username.isBlank() || username.isEmpty()){
                    FacesContext.getCurrentInstance().
                        addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Ingrese un usuario y contraseña válido"));
                    return "login";
                }
                if(password.isBlank() || password.isEmpty()){
                    FacesContext.getCurrentInstance().
                        addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Ingrese un usuario y contraseña válido"));
                    return "login";
                }
                
                return "consultas";
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
