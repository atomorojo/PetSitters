package PetSitters.repository;
import java.util.List;

import PetSitters.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends MongoRepository<User, String> {

        public User findByFirstName(String firstName);
        public List<User> findByLastName(String lastName);

    }

