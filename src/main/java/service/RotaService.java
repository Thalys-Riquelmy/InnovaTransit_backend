package service;

import model.Rota;
import repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RotaService {

    @Autowired
    private RotaRepository rotaRepository;

    public List<Rota> findAll() {
        return rotaRepository.findAll();
    }

    public Optional<Rota> findById(Long id) {
        return rotaRepository.findById(id);
    }

    public Rota save(Rota rota) {
        return rotaRepository.save(rota);
    }

    public void deleteById(Long id) {
        rotaRepository.deleteById(id);
    }
}