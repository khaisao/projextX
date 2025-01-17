// Generated by Dagger (https://dagger.dev).
package com.example.setting.ui.tabFavorite;

import com.example.core.pref.RxPreferences;
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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<RxPreferences> rxPreferencesProvider;

  public FavoriteViewModel_Factory(Provider<RxPreferences> rxPreferencesProvider) {
    this.rxPreferencesProvider = rxPreferencesProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(rxPreferencesProvider.get());
  }

  public static FavoriteViewModel_Factory create(Provider<RxPreferences> rxPreferencesProvider) {
    return new FavoriteViewModel_Factory(rxPreferencesProvider);
  }

  public static FavoriteViewModel newInstance(RxPreferences rxPreferences) {
    return new FavoriteViewModel(rxPreferences);
  }
}
