package springstuff.mongodb.gridfs.app;

import com.mongodb.gridfs.GridFSDBFile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import springstuff.mongodb.gridfs.config.DaoConfig;
import springstuff.mongodb.gridfs.dao.StudentDao;
import springstuff.mongodb.gridfs.model.Student;

/**
 *
 * @author Philip Mark Gutierrez
 * @since August 30, 2016
 * @version 1.0.0
 */
public class GridFsRead {

    public static void main(String[] args) throws Exception {
        try (AnnotationConfigApplicationContext config
                = new AnnotationConfigApplicationContext(DaoConfig.class)) {
            GridFsTemplate gridOperations
                    = config.getBean(GridFsTemplate.class);

            StudentDao studentDao = config.getBean(StudentDao.class);
            Student mikay = studentDao.findByName("Mikay");

            GridFSDBFile picture = gridOperations.findOne(
                    new Query().addCriteria(Criteria.where("_id").is(mikay.getPictureId())));

            picture.writeTo(System.getProperty("user.home") + "/" + "mikay.png");
        }
    }
}
