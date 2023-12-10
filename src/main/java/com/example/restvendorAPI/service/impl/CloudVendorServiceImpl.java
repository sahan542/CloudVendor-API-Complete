package com.example.restvendorAPI.service.impl;

import com.example.restvendorAPI.model.CloudVendor;
import com.example.restvendorAPI.repository.CloudVendorRepository;
import com.example.restvendorAPI.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }



    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Created";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        //more logic
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully Deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
