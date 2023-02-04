package crudlover.api.services;

import crudlover.api.entities.Car;
import crudlover.api.entities.CarUpdateRequest;
import crudlover.api.repositories.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository repository;

    public void insertData(Car car) {
        repository.save(car);
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }

    public Car updateData(Long id, CarUpdateRequest car) {
        try {
            Car entity = repository.findById(id).get();
            System.out.println(entity);

            entity.setFabricante(car.getFabricante());
            entity.setModelo(car.getModelo());
            entity.setValor(car.getValor());

            repository.save(entity);

            return entity;
        }catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There's no car registered with this id!");
        }
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }
}
