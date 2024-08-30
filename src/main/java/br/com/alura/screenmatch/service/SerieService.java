package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SerieService {

    private SerieRepository repositorio;

    public SerieService(SerieRepository repositorio){
        this.repositorio = repositorio;
    }
}
