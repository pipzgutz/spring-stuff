package springstuff.mongodb.gridfs.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import springstuff.mongodb.gridfs.model.Student;

/**
 *
 * @author Philip Mark Gutierrez
 * @since August 30, 2016
 * @version 1.0.0
 */
public interface StudentDao extends MongoRepository<Student, String> {
    Student findByName(String name);
}
