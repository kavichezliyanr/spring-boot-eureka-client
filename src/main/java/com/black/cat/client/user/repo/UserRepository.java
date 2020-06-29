/**
 * 
 */
package com.black.cat.client.user.repo;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.black.cat.client.user.entity.UserDocument;

/**
 *
 */
@Repository
public interface UserRepository extends CrudRepository<UserDocument, ObjectId> {

}
