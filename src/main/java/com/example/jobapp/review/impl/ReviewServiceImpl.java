package com.example.jobapp.review.impl;

import org.springframework.stereotype.Service;

import com.example.jobapp.review.ReviewRepository;
import com.example.jobapp.review.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
}
