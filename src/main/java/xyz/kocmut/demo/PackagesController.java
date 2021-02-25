package xyz.kocmut.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@RestController
@RequestMapping("/packages")
public class PackagesController {

    @GetMapping
    Collection<String> get() {
        return Collections.singleton("Hi");
    }

    @GetMapping("/{id}")
    String getById(@PathVariable int id, @RequestParam Optional<Integer> year) {
        return String.format("Hi %d %d",id, year.orElseGet(() -> 24));
    }

    @PostMapping
    void save(@RequestBody String pkg){
        System.out.println(pkg);
    }

}
