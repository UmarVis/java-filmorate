package ru.yandex.practicum.filmorate.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.filmorate.model.Mpa;
import ru.yandex.practicum.filmorate.storage.film.dao.MpaDao;

import java.util.Collection;

@Service
public class MpaService {
    private MpaDao mpaDao;

    public MpaService(MpaDao mpaDao) {
        this.mpaDao = mpaDao;
    }

    public Collection<Mpa> getAll() {
        return mpaDao.getAll();
    }


    public Mpa getId(int id) {
        return mpaDao.getId(id);
    }
}
