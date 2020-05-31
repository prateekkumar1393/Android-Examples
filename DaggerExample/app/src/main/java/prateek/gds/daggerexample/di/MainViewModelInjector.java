package prateek.gds.daggerexample.di;

import dagger.BindsInstance;
import dagger.Component;
import prateek.gds.daggerexample.MainActivity;

@Component(modules = {DataStorageModule.class, RealConnectionModule.class})
public interface MainViewModelInjector {
    void injectFields(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        MainViewModelInjector build();

        @BindsInstance
        Builder setEndpoints(String endpoints);
    }
}