package prateek.gds.daggerexample.di;

import javax.inject.Named;

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
        Builder setEndpoints(@Named("endpoints") String endpoints);

        @BindsInstance
        Builder setUsername(@Named("username") String username);

        @BindsInstance
        Builder setPassword(@Named("password") String password);
    }
}