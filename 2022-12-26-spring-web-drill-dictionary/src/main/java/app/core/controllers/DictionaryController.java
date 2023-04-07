package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Entry;
import app.core.entities.Example;
import app.core.exceptions.DictionaryException;
import app.core.services.DictionaryService;

@RestController
@RequestMapping("/api/dictionary")
public class DictionaryController {

	@Autowired
	DictionaryService service;

	@PostMapping("/add-entry")
	public Entry addEntry(@RequestBody Entry entry) {
		try {
			return service.addEntry(entry);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping("/get-entry")
	public Entry getEntryById(int entryId) {
		try {
			return service.getEntryById(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/get-entry-examples/{entryId}")
	public List<Example> getAllEntryExamples(@PathVariable int entryId) { 
		return service.getAllEntryExamples(entryId);
	}

	@PutMapping("/update-entry")
	public Entry updateEntry(@RequestBody Entry entry) {
		try {
			return service.updateEntry(entry);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/delete-entry")
	public void deleteEntry(int entryId) {
		try {
			service.deleteEntry(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
