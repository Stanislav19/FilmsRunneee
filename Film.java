package oop.homeWork5_6.film;

import java.util.ArrayList;
import java.util.List;

//Лекция 6.
//Enum:
//Film. Сложность: *. Приоритет: ***.
//Создать классы:
//1. Film: название, год выпуска, список имен актеров, список жанров.
//2. Films: ArrayList<Film> films. Позволяет выполнить поиск:
//a) список фильмов с заданными жанрами (например, HORROR и THRILLER).
//b) список фильмов, выпущенных в заданные года (например, в диапазоне 1990-2000 rr.)
//c) список фильмов, в которых снимаются заданные актеры.
//3. Клиентский класс FilmsRunner, демонстрирующий работу предыдущих классов.

public class Film {

    private String movieTitle;
    private int yearOfRelease;
    private ArrayList<String> actors;
    private ArrayList<Genre> genre;

    public Film(String movieTitle, int yearOfRelease, ArrayList<String> actors, ArrayList<Genre> genre) {
        this.movieTitle = movieTitle;
        this.yearOfRelease = yearOfRelease;
        this.actors = actors;
        this.genre = genre;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public ArrayList<Genre> getGenres() {
        return genre;
    }

    public void printFilmInfo() {
        System.out.println("Title: " + movieTitle + ".");
        System.out.println("Year of release: " + yearOfRelease + ".");

    }

    public void prtActors() {
        int i = 0;
        String prtActors = "Actors: ";
        for (i = 0; i < actors.size(); i++) {
            prtActors += actors.get(i);
            if (i < actors.size() - 1)
                prtActors += ", ";
            else
                prtActors += ".";
        }
        System.out.println(prtActors);
    }

    public void prtGenre() {
        int i = 0;
        String prtGenre = "Genre: ";
        for (i = 0; i < genre.size(); i++) {
            prtGenre += genre.get(i);
            if (i < genre.size() - 1) {
                prtGenre += ", ";
            } else {
                prtGenre += ". ";
            }
        }
        System.out.println(prtGenre);
        System.out.println("_________________________");/*чтоб в глазах меньше рябило*/
    }
}
