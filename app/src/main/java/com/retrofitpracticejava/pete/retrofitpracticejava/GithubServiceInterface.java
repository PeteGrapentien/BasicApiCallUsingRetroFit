package com.retrofitpracticejava.pete.retrofitpracticejava;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pete on 1/20/18.
 */

public interface GithubServiceInterface {
    @GET("users/{user}/repos")
    public Call<List<Repo>> listRepos(@Path("user") String user);
}
