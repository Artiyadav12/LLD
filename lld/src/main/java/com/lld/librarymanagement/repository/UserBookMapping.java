package com.lld.librarymanagement.repository;

import com.lld.librarymanagement.entity.CheckOut;
import com.lld.librarymanagement.entity.UserBookMappingIds;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserBookMapping extends CrudRepository<CheckOut, UserBookMappingIds> {


}
