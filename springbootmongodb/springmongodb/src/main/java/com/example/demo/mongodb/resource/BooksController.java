package com.example.demo.mongodb.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mongodb.model.Books;
import com.example.demo.mongodb.repository.BooksRepository;

@RestController
public class BooksController {
	@Autowired
	private BooksRepository repository;
	
    @PostMapping("/addBooks")
	public String saveBooks(@RequestBody Books books) {
	repository.save(books);
		return "added book with id:" +books.getId();
		
	}
    @GetMapping("/findAllBooks")
    public List<Books> getBooks(){
    		return repository.findAll();
    	}
    @GetMapping("/findAllBooks/{id}")
    public Optional<Books> getBooks(@PathVariable int id){
    		return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBooks(@PathVariable int id) {
        repository.deleteById(id);
        return "book deleted with id :"+id;
} 
}
   

