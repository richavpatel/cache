package io.spring.simplecache.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
    public class Ticket  {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Integer ticketId;
        private String passengerName;
        private String sourceStation;
        private String destStation;
        private String email;

        public Ticket() {
        }

        public Ticket( String passengerName, String sourceStation, String destStation, String email) {
            this.passengerName = passengerName;
            this.sourceStation = sourceStation;
            this.destStation = destStation;
            this.email = email;
        }

        public Integer getTicketId() {
            return ticketId;
        }
        public void setTicketId(Integer ticketId) {
            this.ticketId = ticketId;
        }
        public String getPassengerName() {
            return passengerName;
        }
        public void setPassengerName(String passengerName) {
            this.passengerName = passengerName;
        }

        public String getSourceStation() {
            return sourceStation;
        }
        public void setSourceStation(String sourceStation) {
            this.sourceStation = sourceStation;
        }
        public String getDestStation() {
            return destStation;
        }
        public void setDestStation(String destStation) {
            this.destStation = destStation;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
        @Override
        public String toString() {
            return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName
                    + ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
        }

}
