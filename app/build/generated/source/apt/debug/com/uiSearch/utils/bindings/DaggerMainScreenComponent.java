package com.uiSearch.utils.bindings;

import com.uiSearch.data.network.NetworkConnection;
import com.uiSearch.data.serializer.JsonDataManager;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMainScreenComponent implements MainScreenComponent {
  private Provider<NetworkConnection> provideNetworkConnectionProvider;
  private Provider<JsonDataManager> provideJsonDataManagerProvider;

  private DaggerMainScreenComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static MainScreenComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideNetworkConnectionProvider = FragmentModule_ProvideNetworkConnectionFactory.create(builder.fragmentModule);
    this.provideJsonDataManagerProvider = FragmentModule_ProvideJsonDataManagerFactory.create(builder.fragmentModule);
  }

  @Override
  public NetworkConnection provideNetworkConnection() {  
    return provideNetworkConnectionProvider.get();
  }

  @Override
  public JsonDataManager provideJsonDataManager() {  
    return provideJsonDataManagerProvider.get();
  }

  public static final class Builder {
    private FragmentModule fragmentModule;
  
    private Builder() {  
    }
  
    public MainScreenComponent build() {  
      if (fragmentModule == null) {
        this.fragmentModule = new FragmentModule();
      }
      return new DaggerMainScreenComponent(this);
    }
  
    public Builder fragmentModule(FragmentModule fragmentModule) {  
      if (fragmentModule == null) {
        throw new NullPointerException("fragmentModule");
      }
      this.fragmentModule = fragmentModule;
      return this;
    }
  }
}

