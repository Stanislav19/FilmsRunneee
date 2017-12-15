package oop.homeWork5_6.film;

import java.util.ArrayList;

public class Films {
    ArrayList<Film> films = new ArrayList<Film>();

    Films(ArrayList<Film> films) {
        this.films = films;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void addFilm(Film f) {
        films.add(f);
    }

    public ArrayList<Film> findByGenre(Genre genre3) {
        ArrayList<Film> result = new ArrayList<Film>();
        for (int i1 = 0; i1 < films.size(); i1++) {
            Film f = films.get(i1);
            ArrayList<Genre> genres = f.getGenres();
            for (int i2 = 0; i2 < genres.size(); i2++) {
                if (genre3 == genres.get(i2)) {
                    result.add(f);
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Film> findByYear(int minimumYear, int maxYear) {
        ArrayList<Film> result = new ArrayList<Film>();
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            Integer yearOfRelease = film.getYearOfRelease();
            if (yearOfRelease >= minimumYear && yearOfRelease <= maxYear) {
                result.add(film);
            }
        }
        return result;
    }

    public ArrayList<Film> findByActor(String actorToFind) {
        ArrayList<Film> result = new ArrayList<Film>();
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            ArrayList<String> actors = films.get(i).getActors();
            for (int i2 = 0; i2 < actors.size(); i2++) {
                if (actorToFind == actors.get(i2)) {
                    result.add(film);
                    break;
                }
            }
        }
        return result;
    }

    public void prtFilms(ArrayList<Film> f) {
        String prtFilmssss = "Films: ";
        for (int i = 0; i < f.size(); i++) {
            prtFilmssss += f.get(i).getMovieTitle();
            if (i < f.size() - 1) {
                prtFilmssss += ", ";
            } else {
                prtFilmssss += ". ";
            }
        }
        System.out.println(prtFilmssss);
    }
}

