package com.anbruvic.repository;

import com.anbruvic.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}