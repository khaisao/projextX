// Generated by Dagger (https://dagger.dev).
package com.example.setting.ui.home;

import com.example.setting.DemoNavigation;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomePageFragment_MembersInjector implements MembersInjector<HomePageFragment> {
  private final Provider<DemoNavigation> appNavigationProvider;

  public HomePageFragment_MembersInjector(Provider<DemoNavigation> appNavigationProvider) {
    this.appNavigationProvider = appNavigationProvider;
  }

  public static MembersInjector<HomePageFragment> create(
      Provider<DemoNavigation> appNavigationProvider) {
    return new HomePageFragment_MembersInjector(appNavigationProvider);
  }

  @Override
  public void injectMembers(HomePageFragment instance) {
    injectAppNavigation(instance, appNavigationProvider.get());
  }

  @InjectedFieldSignature("com.example.setting.ui.home.HomePageFragment.appNavigation")
  public static void injectAppNavigation(HomePageFragment instance, DemoNavigation appNavigation) {
    instance.appNavigation = appNavigation;
  }
}
