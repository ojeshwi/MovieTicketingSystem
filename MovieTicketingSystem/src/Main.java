import Model.Movie;
import Model.Seats;
import Model.Tickets;
import Model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 6, "Action, Drama", "Ram", "Karun Joher", "12 ", 650);
        moviesList.add(m1);
        Movie m2 = new Movie(2,7, "Action", "Yash", "Michael Jodan", "11", 599);
        moviesList.add(m2);
        Movie m3 = new Movie(3,8, "Romance", "After Ever Happy", "Tom", "12", 500);
        moviesList.add(m3);

        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Shreebisha", 19,"shreebisha23stha@gmail.com");
        users.add(u1);
        User u2 = new User("Shiyam", 18, "shiyam98shortie@gmail.com");
        users.add(u2);

        ArrayList<Seats> seats = new ArrayList<>();
        Seats s1 = new Seats("Center", 4);
        seats.add(s1);
        Seats s2 = new Seats("FrontSeat", 5);
        seats.add(s2);

        Tickets t1 = new Tickets(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m3.getMovies("2pm");
    }
}