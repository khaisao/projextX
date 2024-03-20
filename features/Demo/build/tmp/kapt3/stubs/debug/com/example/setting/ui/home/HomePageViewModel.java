package com.example.setting.ui.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/setting/ui/home/HomePageViewModel;", "Lcom/example/core/base/BaseViewModel;", "repository", "Lcom/example/setting/ui/home/HomeRepository;", "(Lcom/example/setting/ui/home/HomeRepository;)V", "listHomePage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/setting/model/HomePageItem;", "getListHomePage", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getListSong", "", "useCase1", "useCase2", "useCase3", "useCase4", "Demo_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomePageViewModel extends com.example.core.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.setting.ui.home.HomeRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.setting.model.HomePageItem>> listHomePage = null;
    
    @javax.inject.Inject
    public HomePageViewModel(@org.jetbrains.annotations.NotNull
    com.example.setting.ui.home.HomeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.setting.model.HomePageItem>> getListHomePage() {
        return null;
    }
    
    private final void getListSong() {
    }
    
    private final void useCase1() {
    }
    
    private final void useCase2() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    private final void useCase3() {
    }
    
    private final void useCase4() {
    }
}