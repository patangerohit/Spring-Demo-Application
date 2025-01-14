package com.example.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringBoot.dto.student;
import com.example.SpringBoot.entity.studentEntity;
import com.example.SpringBoot.repo.studentRepo;

@Service
public class studentService {
	
	@Autowired
    private ModelMapper modelMapper;

    public student convertToDTO(studentEntity user) {
        return modelMapper.map(user, student.class);
    }

    public studentEntity convertToEntity(student userDTO) {
        return modelMapper.map(userDTO, studentEntity.class);
    }

	@Autowired
	studentRepo repo;
	public void add(student s) {
		repo.save(convertToEntity(s));
	}
	
	public Optional<studentEntity> find(long id) {
		return repo.findById(id);
	}

	public List<studentEntity> getAll() {
		return repo.findAll();
		}

}
