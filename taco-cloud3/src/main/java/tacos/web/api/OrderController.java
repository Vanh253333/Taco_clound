package tacos.web.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.criteria.Order;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "/order", produces = "application/json")
@CrossOrigin(origins = "*")
public class OrderController {

}
