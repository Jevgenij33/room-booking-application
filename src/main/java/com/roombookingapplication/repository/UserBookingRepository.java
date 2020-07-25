package com.roombookingapplication.repository;

import com.roombookingapplication.entity.UserBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBookingRepository extends JpaRepository<UserBooking, Integer> {
}
