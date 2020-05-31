package prateek.gds.daggerexample.di;

import dagger.Component;
import prateek.gds.daggerexample.basic.MainViewModel;

@Component
public interface MainViewModelInjector {
    MainViewModel getMainViewModel();
}