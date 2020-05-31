package prateek.gds.daggerexample.di;

import dagger.Component;
import prateek.gds.daggerexample.MainActivity;

@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {
    void injectFields(MainActivity mainActivity);
}