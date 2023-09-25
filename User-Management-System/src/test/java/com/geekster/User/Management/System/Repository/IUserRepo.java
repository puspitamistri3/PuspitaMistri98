package com.geekster.User.Management.System.Repository;

import com.geekster.User.Management.System.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {

}
