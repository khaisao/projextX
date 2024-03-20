package com.example.setting.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u0016J\u0018\u0010\"\u001a\u00020\n2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$H\u0016R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/example/setting/adapter/SettingAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/setting/model/SettingItem;", "Lcom/example/setting/adapter/SettingHolder;", "context", "Landroid/content/Context;", "onClickListener", "Lkotlin/Function2;", "", "", "", "onClearListener", "Lkotlin/Function1;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "layoutInflater$delegate", "Lkotlin/Lazy;", "getOnClearListener", "()Lkotlin/jvm/functions/Function1;", "getOnClickListener", "()Lkotlin/jvm/functions/Function2;", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "Demo_debug"})
public final class SettingAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.setting.model.SettingItem, com.example.setting.adapter.SettingHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> onClickListener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onClearListener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy layoutInflater$delegate = null;
    
    public SettingAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onClickListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClearListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> getOnClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnClearListener() {
        return null;
    }
    
    private final android.view.LayoutInflater getLayoutInflater() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.setting.adapter.SettingHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.setting.adapter.SettingHolder holder, int position) {
    }
    
    @java.lang.Override
    public void submitList(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.setting.model.SettingItem> list) {
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
}