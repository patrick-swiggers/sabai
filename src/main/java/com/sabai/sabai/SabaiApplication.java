package com.sabai.sabai;

import com.sabai.sabai.data.entity.Guest;
import com.sabai.sabai.data.entity.Reservation;
import com.sabai.sabai.data.entity.Room;
import com.sabai.sabai.data.repository.GuestRepository;
import com.sabai.sabai.data.repository.ReservationRepository;
import com.sabai.sabai.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SabaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SabaiApplication.class, args);
	}


}
