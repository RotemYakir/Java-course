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
@RequestMapping("/dictionary")
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
	public Entry getEntry(int entryId) {
		try {
			return service.getEntry(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update")
	public Entry updateEntry(@RequestBody Entry entry) {
		try {
			return service.updateEntry(entry);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/delete")
	public void deleteEntry(int entryId) {
		try {
			service.deleteEntry(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/get-examples/{entryId}")
	public List<Example> getEntryExamples(@PathVariable int entryId) {
		return service.getEntryExamples(entryId);
	}

}
