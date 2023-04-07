package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Entry;
import app.core.entities.Example;
import app.core.exceptions.DictionaryException;
import app.core.repositories.EntryRepository;
import app.core.repositories.ExampleRepository;

@Service
@Transactional
public class DictionaryService {

	@Autowired
	EntryRepository entryRepository;
	@Autowired
	ExampleRepository exampleRepository;

	public Entry addEntry(Entry entry) throws DictionaryException {
		if(entryRepository.existsById(entry.getId())){
			throw new DictionaryException("failed to add the entry - id: " + entry.getId()+ "already exists");
		}else {
			return this.entryRepository.save(entry);
		}
	}

	public Entry getEntry(int entryId) throws DictionaryException {
		Optional<Entry> opt = this.entryRepository.findById(entryId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new DictionaryException("failed to get the entry - couldn't find by id: " + entryId);
		}
	}

	public Entry updateEntry(Entry entry) throws DictionaryException {
		if(entryRepository.existsById(entry.getId())) {
			return this.entryRepository.save(entry);
		}else {
			throw new DictionaryException("failed to update - couldn't find by id: "+entry.getId());
		}
	}

	public void deleteEntry(int entryId) throws DictionaryException {
		if (this.entryRepository.existsById(entryId)) {
			this.entryRepository.deleteById(entryId);
		} else {
			throw new DictionaryException("failed to delete - couldn't find by id: " + entryId);
		}
	}
	
	public List<Example> getEntryExamples(int entryId){
		return this.exampleRepository.findByEntryId(entryId);
	}

}
