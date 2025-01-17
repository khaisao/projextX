// Generated by data binding compiler. Do not edit!
package com.example.setting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.setting.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterItemTitleSettingBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView btnClear;

  @NonNull
  public final AppCompatCheckBox checkbox;

  @NonNull
  public final AppCompatCheckBox checkboxEnd;

  @NonNull
  public final View lineBottom;

  @NonNull
  public final AppCompatTextView tvTitle;

  protected AdapterItemTitleSettingBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatTextView btnClear, AppCompatCheckBox checkbox,
      AppCompatCheckBox checkboxEnd, View lineBottom, AppCompatTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClear = btnClear;
    this.checkbox = checkbox;
    this.checkboxEnd = checkboxEnd;
    this.lineBottom = lineBottom;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static AdapterItemTitleSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_item_title_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterItemTitleSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterItemTitleSettingBinding>inflateInternal(inflater, R.layout.adapter_item_title_setting, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterItemTitleSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_item_title_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterItemTitleSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterItemTitleSettingBinding>inflateInternal(inflater, R.layout.adapter_item_title_setting, null, false, component);
  }

  public static AdapterItemTitleSettingBinding bind(@NonNull View view) {
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
  public static AdapterItemTitleSettingBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterItemTitleSettingBinding)bind(component, view, R.layout.adapter_item_title_setting);
  }
}
