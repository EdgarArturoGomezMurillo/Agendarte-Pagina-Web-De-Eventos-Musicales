
package com.co.dao;

import com.co.pojo.usuario;
import org.springframework.data.repository.CrudRepository;


public interface usuarioDAO extends CrudRepository <usuario,Integer> {
    
}
