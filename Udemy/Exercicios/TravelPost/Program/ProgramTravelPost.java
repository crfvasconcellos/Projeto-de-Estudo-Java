package TravelPost.Program;

import TravelPost.Entities.Comment;
import TravelPost.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramTravelPost {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow That's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Travelingo to New Zeland",12,"I'm going to visit this wanderful country!");

        p1.addComment(c1);
        p1.addComment(c2);


        System.out.println(p1);


    }
}
