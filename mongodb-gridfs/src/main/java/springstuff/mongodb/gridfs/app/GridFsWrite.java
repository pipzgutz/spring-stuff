package springstuff.mongodb.gridfs.app;

import com.mongodb.gridfs.GridFSFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class GridFsWrite {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext config
                = new AnnotationConfigApplicationContext(DaoConfig.class);
        GridFsTemplate gridOperations
                = config.getBean(GridFsTemplate.class);
        StudentDao studentDao = config.getBean(StudentDao.class);

        Student student = Student.builder()
                .id(ObjectId.get())
                .name("Mikay")
                .build();
        
        File file = getFile("heyyyy.png");

        try (InputStream is = new FileInputStream(file)) {
            GridFSFile store = gridOperations.store(is, file.getName(), "image/png");
            student.setPictureId((ObjectId) store.getId());
        }

        studentDao.save(student);
    }

    private static File getFile(String file) {
        ClassLoader loader = GridFsWrite.class.getClassLoader();
        return new File(loader.getResource(file).getFile());
    }
}
