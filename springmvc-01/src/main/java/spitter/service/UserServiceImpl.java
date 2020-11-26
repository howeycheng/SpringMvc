package spitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spitter.db.SpitterRepository;
import spitter.domain.Spitter;

import java.util.List;

/**
 * @author howey
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private SpitterRepository spitterRepository;

    public List<Spitter> findAll() {
        return spitterRepository.findAll();
    }

    public void saveUser(Spitter book) {

    }

    public Spitter findOne(int id) {
        return spitterRepository.findOne(id);
    }

    public void delete(long id) {

    }

    public List<Spitter> findByName(String name) {
        return null;
    }
}
