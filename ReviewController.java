package com.example.ratings.controller;

import com.example.ratings.model.Review;
import com.example.ratings.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    // Show all reviews
    @GetMapping("/review")
    public String reviewForm(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("review", new Review());
        return "review";
    }

    @PostMapping("/review")
    public String saveReview(@ModelAttribute Review review) {
        reviewService.saveReview(review);
        return "redirect:/home";
    }
}
