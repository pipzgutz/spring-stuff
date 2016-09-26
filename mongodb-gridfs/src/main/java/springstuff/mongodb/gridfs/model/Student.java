package springstuff.mongodb.gridfs.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Philip Mark Gutierrez
 * @since August 30, 2016
 * @version 1.0.0
 */
@Builder
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private ObjectId id;
    private String name;
    private ObjectId pictureId;
}
