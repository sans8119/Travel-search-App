package com.uiSearch.utils.bindings;

import com.uiSearch.data.serializer.JsonDataManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FragmentModule_ProvideJsonDataManagerFactory implements Factory<JsonDataManager> {
  private final FragmentModule module;

  public FragmentModule_ProvideJsonDataManagerFactory(FragmentModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public JsonDataManager get() {  
    JsonDataManager provided = module.provideJsonDataManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<JsonDataManager> create(FragmentModule module) {  
    return new FragmentModule_ProvideJsonDataManagerFactory(module);
  }
}

