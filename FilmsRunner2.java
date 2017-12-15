package oop.homeWork5_6.film;

import java.util.ArrayList;

public class FilmsRunner2 {

    public static void main(String[] args) {
        ArrayList<String> t1Actors = new ArrayList<String>();//список актеров для первого фильма
        t1Actors.add("Arnold Schwarzenegger");
        t1Actors.add("Michael Biehn");
        t1Actors.add("Linda Hamilton");
        ArrayList<Genre> t1Genre = new ArrayList<Genre>();//список жанров
        t1Genre.add(Genre.FANTASTIC);
        t1Genre.add(Genre.ACTION);
        Film terminator = new Film("Terminator", 1984, t1Actors, t1Genre);
        terminator.printFilmInfo();
        terminator.prtActors();
        terminator.prtGenre();

        ArrayList<String> bttfActors = new ArrayList<String>();
        bttfActors.add("Michael J. Fox");
        bttfActors.add("Christopher Lloyd");
        ArrayList<Genre> bttfGenre = new ArrayList<Genre>();
        bttfGenre.add(Genre.ADVANTURE);
        bttfGenre.add(Genre.COMEDY);
        bttfGenre.add(Genre.FANTASTIC);
        Film backToTheFuture = new Film("Back to the Future", 1985, bttfActors, bttfGenre);
        backToTheFuture.printFilmInfo();
        backToTheFuture.prtActors();
        backToTheFuture.prtGenre();

        ArrayList<String> haActors = new ArrayList<String>();
        haActors.add("Macaulay Culkin");
        haActors.add("Joe Pesci");
        haActors.add("Daniel Stern");
        ArrayList<Genre> haGenre = new ArrayList<Genre>();
        haGenre.add(Genre.COMEDY);
        Film homeAlone = new Film("Home Alone", 1990, haActors, haGenre);
        ArrayList<Film> films19 = new ArrayList<Film>();
        homeAlone.printFilmInfo();
        homeAlone.prtActors();
        homeAlone.prtGenre();

        ArrayList<String> primalFearActors = new ArrayList<String>();
        primalFearActors.add("Richard Gere");
        primalFearActors.add("Edward Norton");
        primalFearActors.add("Laura Linney");
        ArrayList<Genre> primalFearGenre = new ArrayList<Genre>();
        primalFearGenre.add(Genre.DRAMAS);
        primalFearGenre.add(Genre.THRYLLERS);
        primalFearGenre.add(Genre.DETECTIVES);
        Film primalFear = new Film("Primal Fear", 1996, primalFearActors, primalFearGenre);
        primalFear.printFilmInfo();
        primalFear.prtActors();
        primalFear.prtGenre();

        Films films = new Films(films19);
        films19.add(terminator);
        films19.add(backToTheFuture);
        films19.add(homeAlone);
        films19.add(primalFear);

        ArrayList<Film> filmsWithGenre = films.findByGenre(Genre.DETECTIVES);
        System.out.println("Результат поиска фильмов по указаному жанру:");
        films.prtFilms(filmsWithGenre);
        ArrayList<Film> filmsByYears = films.findByYear(1985, 1990);
        System.out.println("Pезультат поиска фильмов, выпущенных в заданном диапазоне лет:");
        films.prtFilms(filmsByYears);
        ArrayList<Film> filmsByActor = films.findByActor("Arnold Schwarzenegger");
        System.out.println("Pезультат поиска фильмов с задаными актерами:");
        films.prtFilms(filmsByActor);
    }
}
