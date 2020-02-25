package io.spring.simplecache;

import io.spring.simplecache.Repository.TicketBooking;
import io.spring.simplecache.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
//@EnableCaching
public class SimpleCacheApplication implements CommandLineRunner{

    @Autowired
    TicketBooking tickectBooking;

	public static void main(String[] args) {
		SpringApplication.run(SimpleCacheApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
       List<Ticket> tickets =  Arrays.asList(
                new Ticket("Richa","kl","lk","richa@defd"),
                new Ticket("ggg","kl","lk","richa@defd"));

       tickectBooking.saveAll(tickets);
       System.out.println(tickets);

    }



}
