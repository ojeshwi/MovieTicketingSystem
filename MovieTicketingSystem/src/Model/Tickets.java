package Model;

import java.util.ArrayList;

public class Tickets {
    ArrayList<Seats> seat;

    public Tickets(ArrayList<Seats> seat, ArrayList<User> user, ArrayList<Movie> movie) {
        this.seat = seat;
        this.user = user;
        this.movie = movie;
    }

    ArrayList<User> user;

    public ArrayList<Seats> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seats> seat) {
        this.seat = seat;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Movie> getMovie() {
        return movie;
    }

    public void setMovie(ArrayList<Movie> movie) {
        this.movie = movie;
    }

    ArrayList<Movie> movie;

    public void getTickets() {

        ArrayList<Seats> seatArrayList = this.getSeat();

        for(Seats singleSeat: seatArrayList) {
            System.out.println("Occupied seat: " + singleSeat.getSeatNumber());

        }

    }
}