class PvrMovies {

    public static int getMoviePriceByName(String movieName) {
        if (movieName == "Avatar") {
            return 300;
        }
        if (movieName == "Avengers: Endgame") {
            return 350;
        }
        if (movieName == "Inception") {
            return 280;
        }
        if (movieName ==  "Titanic") {
            return 250;
        }
        if (movieName == "The Dark Knight") {
            return 320;
        }
        if (movieName == "Interstellar") {
            return 300;
        }
        if (movieName == "Joker") {
            return 290;
        }
        if (movieName == "Frozen II") {
            return 260;
        }
        if (movieName == "Spider-Man: No Way Home") {
            return 340;
        }
        if (movieName == "Black Panther") {
            return 310;
        }
        if (movieName == "Jurassic World"){
            return 330;
        }
        if (movieName == "The Lion King") {
            return 270;
        }
        if (movieName == "Toy Story 4") {
            return 260;
        }
        if (movieName == "The Incredibles 2") {
            return 280;
        }
        if (movieName == "Star Wars: The Force Awakens") {
            return 350;
        }
        if (movieName == "Finding Dory") {
            return 270;
        }
        if (movieName == "Zootopia") {
            return 250;
        }
        if (movieName == "The Avengers") {
            return 320;
        }
        if (movieName == "Beauty and the Beast") {
            return 300;
        }
        if (movieName == "Iron Man 3") {
            return 330;
        } else {
            System.out.println(movieName + " not found");
            return 0;
        }
    }
}