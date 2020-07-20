package org.soyphea.repo;

import java.util.List;
import org.soyphea.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "task",path = "task")
public interface TaskRepository extends PagingAndSortingRepository<Task,Long> {

}
