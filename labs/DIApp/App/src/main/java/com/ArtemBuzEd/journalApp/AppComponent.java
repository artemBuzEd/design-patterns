package com.ArtemBuzEd.journalApp;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    JournalManager getJournalManager();
}
