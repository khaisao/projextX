// Generated by data binding compiler. Do not edit!
package com.example.setting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.setting.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomePageBinding extends ViewDataBinding {
  @NonNull
  public final Button btn;

  @NonNull
  public final Button btnDialog;

  @NonNull
  public final RecyclerView layoutHome;

  protected FragmentHomePageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btn, Button btnDialog, RecyclerView layoutHome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn = btn;
    this.btnDialog = btnDialog;
    this.layoutHome = layoutHome;
  }

  @NonNull
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomePageBinding>inflateInternal(inflater, R.layout.fragment_home_page, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomePageBinding>inflateInternal(inflater, R.layout.fragment_home_page, null, false, component);
  }

  public static FragmentHomePageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHomePageBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomePageBinding)bind(component, view, R.layout.fragment_home_page);
  }
}