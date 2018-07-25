package com.udacity.gradle.builditbigger.backend;

import com.furkansalihege.android.jokejavalib.jokeJavaLibClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    private final jokeJavaLibClass jokeProvider = new jokeJavaLibClass();


    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();
        response.setData(jokeProvider.getJoke());
        return response;
    }

}
