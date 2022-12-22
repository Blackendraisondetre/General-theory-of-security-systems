package com.example.amogus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    static List<Integer> flights = new ArrayList<Integer>();

    Controller(){
        flights.add(1);
        flights.add(2);
        flights.add(3);
        flights.add(4);
        flights.add(5);
    }

    @GetMapping("/flights")
    public List<Integer> GetAllFlight(){
        return flights;
    }

    //RequestBody
    @GetMapping("/flights/{id}")
    public List<Integer> GetByIdFlight(@PathVariable Integer id){
        return Collections.singletonList(flights.get(id));
    }

    @DeleteMapping("/del/{id}")
    public HttpStatus DeleteByIdFlight(@PathVariable Integer id){
        flights.remove(id);
        return HttpStatus.NO_CONTENT;
    }

    @PostMapping("/add/{id}")
    public List<Integer> PostFlight(@PathVariable Integer id){
        flights.add(id);
        return flights;
    }

}
