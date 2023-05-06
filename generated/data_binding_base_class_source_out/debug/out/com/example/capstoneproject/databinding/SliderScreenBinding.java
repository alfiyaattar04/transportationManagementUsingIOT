// Generated by view binder compiler. Do not edit!
package com.example.capstoneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.capstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SliderScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView sliderDesc;

  @NonNull
  public final ImageView sliderImage;

  @NonNull
  public final TextView sliderTitle;

  private SliderScreenBinding(@NonNull LinearLayout rootView, @NonNull TextView sliderDesc,
      @NonNull ImageView sliderImage, @NonNull TextView sliderTitle) {
    this.rootView = rootView;
    this.sliderDesc = sliderDesc;
    this.sliderImage = sliderImage;
    this.sliderTitle = sliderTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SliderScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SliderScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.slider_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SliderScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sliderDesc;
      TextView sliderDesc = ViewBindings.findChildViewById(rootView, id);
      if (sliderDesc == null) {
        break missingId;
      }

      id = R.id.sliderImage;
      ImageView sliderImage = ViewBindings.findChildViewById(rootView, id);
      if (sliderImage == null) {
        break missingId;
      }

      id = R.id.sliderTitle;
      TextView sliderTitle = ViewBindings.findChildViewById(rootView, id);
      if (sliderTitle == null) {
        break missingId;
      }

      return new SliderScreenBinding((LinearLayout) rootView, sliderDesc, sliderImage, sliderTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
