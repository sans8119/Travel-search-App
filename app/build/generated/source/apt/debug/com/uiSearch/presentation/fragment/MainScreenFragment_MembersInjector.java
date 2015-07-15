package com.uiSearch.presentation.fragment;

import android.app.Fragment;
import com.uiSearch.data.network.NetworkConnection;
import com.uiSearch.data.serializer.JsonDataManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainScreenFragment_MembersInjector implements MembersInjector<MainScreenFragment> {
  private final MembersInjector<Fragment> supertypeInjector;
  private final Provider<NetworkConnection> networkConnectionProvider;
  private final Provider<JsonDataManager> jsonDataManagerProvider;

  public MainScreenFragment_MembersInjector(MembersInjector<Fragment> supertypeInjector, Provider<NetworkConnection> networkConnectionProvider, Provider<JsonDataManager> jsonDataManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert networkConnectionProvider != null;
    this.networkConnectionProvider = networkConnectionProvider;
    assert jsonDataManagerProvider != null;
    this.jsonDataManagerProvider = jsonDataManagerProvider;
  }

  @Override
  public void injectMembers(MainScreenFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.networkConnection = networkConnectionProvider.get();
    instance.jsonDataManager = jsonDataManagerProvider.get();
  }

  public static MembersInjector<MainScreenFragment> create(MembersInjector<Fragment> supertypeInjector, Provider<NetworkConnection> networkConnectionProvider, Provider<JsonDataManager> jsonDataManagerProvider) {  
      return new MainScreenFragment_MembersInjector(supertypeInjector, networkConnectionProvider, jsonDataManagerProvider);
  }
}

