package com.example.ratings.controller;

import com.example.ratings.model.Vehicle;
import com.example.ratings.service.VehicleService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/vehicle")
    public String vehicleForm(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle"; // should match vehicle.html
    }

    @PostMapping("/vehicle")
    public String saveVehicle(@ModelAttribute Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return "redirect:/vehicle"; // or "redirect:/home" if you prefer
    }
}
