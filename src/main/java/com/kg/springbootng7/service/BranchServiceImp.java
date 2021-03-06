package com.kg.springbootng7.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.kg.springbootng7.entity.Branch;
import com.kg.springbootng7.repository.BranchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BranchServiceImp implements BranchService {

    @Autowired
    BranchRepository branchRepository;

    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public List<Branch> getBranchs() {
        return (List<Branch>) branchRepository.findAll();
    }

    public Branch findByBranchId(Long id) {
        return branchRepository.findById(id).get();
    }

    public Branch updateBranch(Long id,Branch branch) {
        Branch t = branchRepository.getOne(id);
        t.setBranchname(branch.getBranchname());
        return branchRepository.save(t);
    }

    public void deleteBranchById(Long id) {
        branchRepository.deleteById(id);
    }

}
