
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")

public class usuario implements Serializable {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Integer telefono;
    private String correo;
    private String password; 
   
         
}