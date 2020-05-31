package prateek.gds.daggerexample.di;

import dagger.Component;
import prateek.gds.daggerexample.MainActivity;

@Component
public interface MainViewModelInjector {
    void injectFields(MainActivity mainActivity);
}