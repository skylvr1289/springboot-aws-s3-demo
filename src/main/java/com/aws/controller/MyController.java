package com.aws.controller;

import com.aws.repo.S3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Author: Abhishek Kumar
 */

@RequestMapping("/api")
@RestController
public class MyController {

    @Autowired
    S3Repository s3Repo;

    @GetMapping(value = "/v1/ping")
    @ResponseBody
    String getHealth() {
        return "Up and running";
    }

    @GetMapping(value = "/v1/buckets")
    @ResponseBody
    List<String> getBuckets() {
        return s3Repo.listAllBuckets();
    }
}
