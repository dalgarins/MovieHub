package com.etiennelawlor.moviehub.data.source.movies;

import com.etiennelawlor.moviehub.data.remote.response.Movie;
import com.etiennelawlor.moviehub.ui.movies.MoviesPresenter;

import java.util.List;

import rx.Observable;

/**
 * Created by etiennelawlor on 2/13/17.
 */

public class MoviesRepository implements MoviesDataSource {

    // region Member Variables
    private MoviesDataSource moviesLocalDataSource;
    private MoviesDataSource moviesRemoteDataSource;
    // endregion

    // region Constructors
    public MoviesRepository(MoviesDataSource moviesLocalDataSource, MoviesDataSource moviesRemoteDataSource) {
        this.moviesLocalDataSource = moviesLocalDataSource;
        this.moviesRemoteDataSource = moviesRemoteDataSource;
    }
    // endregion

    // region MoviesDataSource Methods
//    @Override
//    public void getMovies(int currentPage, GetMoviesCallback callback) {
//        moviesRemoteDataSource.getMovies(currentPage, callback);
//    }

    @Override
    public void getMovies(int currentPage, GetMoviesCallback callback) {
        moviesRemoteDataSource.getMovies(currentPage, callback);
    }

    // endregion
}