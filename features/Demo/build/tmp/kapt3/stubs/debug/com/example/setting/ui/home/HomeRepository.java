package com.example.setting.ui.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/setting/ui/home/HomeRepository;", "Lcom/example/core/base/BaseRepository;", "apiInterface", "Lcom/example/core/network/ApiInterface;", "(Lcom/example/core/network/ApiInterface;)V", "delayFlow", "Lkotlinx/coroutines/flow/Flow;", "", "time", "getDataAsync", "Lcom/example/setting/ui/home/HomeResponse;", "getListImage", "", "", "handleResponse", "Ljava/util/ArrayList;", "Lcom/example/setting/model/HomePageItem;", "Lkotlin/collections/ArrayList;", "response", "Demo_debug"})
public final class HomeRepository extends com.example.core.base.BaseRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.network.ApiInterface apiInterface = null;
    
    @javax.inject.Inject
    public HomeRepository(@org.jetbrains.annotations.NotNull
    com.example.core.network.ApiInterface apiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.setting.ui.home.HomeResponse> getDataAsync() {
        return null;
    }
    
    private final java.util.List<java.lang.String> getListImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> delayFlow(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.setting.model.HomePageItem> handleResponse(@org.jetbrains.annotations.NotNull
    com.example.setting.ui.home.HomeResponse response) {
        return null;
    }
}