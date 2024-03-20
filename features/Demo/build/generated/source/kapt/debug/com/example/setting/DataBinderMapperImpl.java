package com.example.setting;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.setting.databinding.AdapterItemTitleSettingBindingImpl;
import com.example.setting.databinding.FragmentDemoBindingImpl;
import com.example.setting.databinding.FragmentDemoViewpagerBindingImpl;
import com.example.setting.databinding.FragmentFavoriteBindingImpl;
import com.example.setting.databinding.FragmentHomePageBindingImpl;
import com.example.setting.databinding.FragmentLoginBindingImpl;
import com.example.setting.databinding.FragmentSettingBindingImpl;
import com.example.setting.databinding.ItemAlbumLayoutBindingImpl;
import com.example.setting.databinding.ItemBannerLayoutBindingImpl;
import com.example.setting.databinding.ItemHomeSlideLayoutBindingImpl;
import com.example.setting.databinding.ItemSongLayoutBindingImpl;
import com.example.setting.databinding.ItemTitleHomeLayoutBindingImpl;
import com.example.setting.databinding.LayoutItemUserBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADAPTERITEMTITLESETTING = 1;

  private static final int LAYOUT_FRAGMENTDEMO = 2;

  private static final int LAYOUT_FRAGMENTDEMOVIEWPAGER = 3;

  private static final int LAYOUT_FRAGMENTFAVORITE = 4;

  private static final int LAYOUT_FRAGMENTHOMEPAGE = 5;

  private static final int LAYOUT_FRAGMENTLOGIN = 6;

  private static final int LAYOUT_FRAGMENTSETTING = 7;

  private static final int LAYOUT_ITEMALBUMLAYOUT = 8;

  private static final int LAYOUT_ITEMBANNERLAYOUT = 9;

  private static final int LAYOUT_ITEMHOMESLIDELAYOUT = 10;

  private static final int LAYOUT_ITEMSONGLAYOUT = 11;

  private static final int LAYOUT_ITEMTITLEHOMELAYOUT = 12;

  private static final int LAYOUT_LAYOUTITEMUSER = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.adapter_item_title_setting, LAYOUT_ADAPTERITEMTITLESETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_demo, LAYOUT_FRAGMENTDEMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_demo_viewpager, LAYOUT_FRAGMENTDEMOVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_home_page, LAYOUT_FRAGMENTHOMEPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.item_album_layout, LAYOUT_ITEMALBUMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.item_banner_layout, LAYOUT_ITEMBANNERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.item_home_slide_layout, LAYOUT_ITEMHOMESLIDELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.item_song_layout, LAYOUT_ITEMSONGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.item_title_home_layout, LAYOUT_ITEMTITLEHOMELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.setting.R.layout.layout_item_user, LAYOUT_LAYOUTITEMUSER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADAPTERITEMTITLESETTING: {
          if ("layout/adapter_item_title_setting_0".equals(tag)) {
            return new AdapterItemTitleSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_item_title_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDEMO: {
          if ("layout/fragment_demo_0".equals(tag)) {
            return new FragmentDemoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_demo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDEMOVIEWPAGER: {
          if ("layout/fragment_demo_viewpager_0".equals(tag)) {
            return new FragmentDemoViewpagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_demo_viewpager is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEPAGE: {
          if ("layout/fragment_home_page_0".equals(tag)) {
            return new FragmentHomePageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMALBUMLAYOUT: {
          if ("layout/item_album_layout_0".equals(tag)) {
            return new ItemAlbumLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_album_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBANNERLAYOUT: {
          if ("layout/item_banner_layout_0".equals(tag)) {
            return new ItemBannerLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_banner_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMESLIDELAYOUT: {
          if ("layout/item_home_slide_layout_0".equals(tag)) {
            return new ItemHomeSlideLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_slide_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSONGLAYOUT: {
          if ("layout/item_song_layout_0".equals(tag)) {
            return new ItemSongLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_song_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTITLEHOMELAYOUT: {
          if ("layout/item_title_home_layout_0".equals(tag)) {
            return new ItemTitleHomeLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_title_home_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTITEMUSER: {
          if ("layout/layout_item_user_0".equals(tag)) {
            return new LayoutItemUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_item_user is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/adapter_item_title_setting_0", com.example.setting.R.layout.adapter_item_title_setting);
      sKeys.put("layout/fragment_demo_0", com.example.setting.R.layout.fragment_demo);
      sKeys.put("layout/fragment_demo_viewpager_0", com.example.setting.R.layout.fragment_demo_viewpager);
      sKeys.put("layout/fragment_favorite_0", com.example.setting.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_home_page_0", com.example.setting.R.layout.fragment_home_page);
      sKeys.put("layout/fragment_login_0", com.example.setting.R.layout.fragment_login);
      sKeys.put("layout/fragment_setting_0", com.example.setting.R.layout.fragment_setting);
      sKeys.put("layout/item_album_layout_0", com.example.setting.R.layout.item_album_layout);
      sKeys.put("layout/item_banner_layout_0", com.example.setting.R.layout.item_banner_layout);
      sKeys.put("layout/item_home_slide_layout_0", com.example.setting.R.layout.item_home_slide_layout);
      sKeys.put("layout/item_song_layout_0", com.example.setting.R.layout.item_song_layout);
      sKeys.put("layout/item_title_home_layout_0", com.example.setting.R.layout.item_title_home_layout);
      sKeys.put("layout/layout_item_user_0", com.example.setting.R.layout.layout_item_user);
    }
  }
}
