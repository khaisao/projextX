package com.example.setting.adapter;

/**
 * Created by vietbh on 2022-03-17.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/setting/adapter/HomePageAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/setting/model/HomePageItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemClickListener", "Lcom/example/core/adapter/OnItemClickListener;", "(Lcom/example/core/adapter/OnItemClickListener;)V", "numberSong", "", "getNumberSong", "()I", "setNumberSong", "(I)V", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "Demo_debug"})
public final class HomePageAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.setting.model.HomePageItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private final com.example.core.adapter.OnItemClickListener onItemClickListener = null;
    private int numberSong = 0;
    
    public HomePageAdapter(@org.jetbrains.annotations.Nullable
    com.example.core.adapter.OnItemClickListener onItemClickListener) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final int getNumberSong() {
        return 0;
    }
    
    public final void setNumberSong(int p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void onViewRecycled(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    public HomePageAdapter() {
        super(null);
    }
}