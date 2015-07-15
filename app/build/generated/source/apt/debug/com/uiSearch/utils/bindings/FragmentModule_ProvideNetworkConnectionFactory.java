package com.uiSearch.utils.bindings;

import com.uiSearch.data.network.NetworkConnection;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FragmentModule_ProvideNetworkConnectionFactory implements Factory<NetworkConnection> {
  private final FragmentModule module;

  public FragmentModule_ProvideNetworkConnectionFactory(FragmentModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public NetworkConnection get() {  
    NetworkConnection provided = module.provideNetworkConnection();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<NetworkConnection> create(FragmentModule module) {  
    return new FragmentModule_ProvideNetworkConnectionFactory(module);
  }
}

