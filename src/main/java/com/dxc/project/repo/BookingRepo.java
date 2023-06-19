package com.dxc.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.project.model.Booking;


@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
