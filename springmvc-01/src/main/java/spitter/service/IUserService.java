package spitter.service;

import spitter.domain.Spitter;

import java.util.List;

/**
 * @author howey
 */
public interface IUserService {
    public List<Spitter> findAll();

    public void saveUser(Spitter book);

    public Spitter findOne(int id);

    public void delete(long id);

    public List<Spitter> findByName(String name);
}
