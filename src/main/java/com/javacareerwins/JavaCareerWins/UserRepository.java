package com.javacareerwins.JavaCareerWins;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {

    Flux<User> findByFirstName(String firstName);
}
