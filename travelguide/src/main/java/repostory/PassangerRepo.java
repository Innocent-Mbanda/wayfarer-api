package repostory;

import model.PassangerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassangerRepo extends MongoRepository<PassangerModel,String> {

}
