package com.example.setting.ui.home;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0017\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eJ\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/example/setting/ui/home/HomePageFragment;", "Lcom/example/core/base/fragment/BaseFragment;", "Lcom/example/setting/databinding/FragmentHomePageBinding;", "Lcom/example/setting/ui/home/HomePageViewModel;", "Lcom/example/core/base/dialog/ConfirmDialogListener;", "Lcom/example/core/base/dialog/NoticeDialogListener;", "()V", "adapterHomePage", "Lcom/example/setting/adapter/HomePageAdapter;", "appNavigation", "Lcom/example/setting/DemoNavigation;", "getAppNavigation", "()Lcom/example/setting/DemoNavigation;", "setAppNavigation", "(Lcom/example/setting/DemoNavigation;)V", "viewModel", "getViewModel", "()Lcom/example/setting/ui/home/HomePageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindingStateView", "", "getVM", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "onClickCancel", "type", "", "(Ljava/lang/Integer;)V", "onClickOk", "onDestroyView", "setOnClick", "Demo_debug"})
public final class HomePageFragment extends com.example.core.base.fragment.BaseFragment<com.example.setting.databinding.FragmentHomePageBinding, com.example.setting.ui.home.HomePageViewModel> implements com.example.core.base.dialog.ConfirmDialogListener, com.example.core.base.dialog.NoticeDialogListener {
    @javax.inject.Inject
    public com.example.setting.DemoNavigation appNavigation;
    @org.jetbrains.annotations.Nullable
    private com.example.setting.adapter.HomePageAdapter adapterHomePage;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HomePageFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.setting.DemoNavigation getAppNavigation() {
        return null;
    }
    
    public final void setAppNavigation(@org.jetbrains.annotations.NotNull
    com.example.setting.DemoNavigation p0) {
    }
    
    private final com.example.setting.ui.home.HomePageViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.setting.ui.home.HomePageViewModel getVM() {
        return null;
    }
    
    @java.lang.Override
    public void initView(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapter() {
    }
    
    @java.lang.Override
    public void bindingStateView() {
    }
    
    @java.lang.Override
    public void setOnClick() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onClickOk(@org.jetbrains.annotations.Nullable
    java.lang.Integer type) {
    }
    
    @java.lang.Override
    public void onClickCancel(@org.jetbrains.annotations.Nullable
    java.lang.Integer type) {
    }
}