package com.aws.repo;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Abhishek Kumar
 */
@Configuration
public class S3Repository {
    private AmazonS3 s3Client;

    public S3Repository(AmazonS3 s3Client) {
        this.s3Client = s3Client;
    }

    public List listAllBuckets() {
        List bucketNames = new ArrayList<String>();
        for (Bucket bucket : s3Client.listBuckets()) {
            bucketNames.add(bucket.getName() + "-->" + bucket.getCreationDate());
        }
        return bucketNames;
    }
}
