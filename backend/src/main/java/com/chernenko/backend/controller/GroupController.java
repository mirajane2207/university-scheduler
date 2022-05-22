package com.chernenko.backend.controller;

import com.chernenko.backend.domain.Group;
import com.chernenko.backend.repository.GroupRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @GetMapping
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    @GetMapping("id")
    public Group getById(@PathVariable("id") Group group) {
        return group;
    }

    @PostMapping
    public Group create(@RequestBody Group group) {
        return groupRepository.save(group);
    }

    @PutMapping("{id}")
    public Group update(@PathVariable("id") Group groupFromDB, @RequestBody Group group) {
        BeanUtils.copyProperties(group, groupFromDB, "id");

        return groupRepository.save(groupFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Group group) {
        groupRepository.delete(group);
    }
}
