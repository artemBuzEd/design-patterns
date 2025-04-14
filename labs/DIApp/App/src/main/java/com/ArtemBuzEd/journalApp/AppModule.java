package com.ArtemBuzEd.journalApp;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dagger.Provides;
import dagger.Module;
import javax.inject.Singleton;
import javax.inject.Named;

@Module
public class AppModule {
    @Provides
    @Named("FilePath")
    String provideFilePath() {
        return "user_data.json";
    }

    @Provides
    @Singleton
    ObjectMapper provideObjectMapper() {
        return new ObjectMapper().registerModule(new JavaTimeModule());
    }
}
