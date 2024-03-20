// Generated by Dagger (https://dagger.dev).
package com.example.setting.ui.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomePageViewModel_Factory implements Factory<HomePageViewModel> {
  private final Provider<HomeRepository> repositoryProvider;

  public HomePageViewModel_Factory(Provider<HomeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomePageViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static HomePageViewModel_Factory create(Provider<HomeRepository> repositoryProvider) {
    return new HomePageViewModel_Factory(repositoryProvider);
  }

  public static HomePageViewModel newInstance(HomeRepository repository) {
    return new HomePageViewModel(repository);
  }
}
