package spitter.db;

import spitter.domain.Spitter;

import java.util.List;

/**
 * Created by 程浩 on 2020/11/25
 */
public interface SpitterRepository {
    long count();

    Spitter save(Spitter spitter);

    Spitter findOne(int id);

    Spitter findByUsername(String username);

    List<Spitter> findAll();
}
