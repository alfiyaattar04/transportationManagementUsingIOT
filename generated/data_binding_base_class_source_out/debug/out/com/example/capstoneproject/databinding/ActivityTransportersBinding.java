// Generated by view binder compiler. Do not edit!
package com.example.capstoneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.capstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTransportersBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView recyclerView1;

  @NonNull
  public final EditText searchingRecyclerview;

  private ActivityTransportersBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView recyclerView1, @NonNull EditText searchingRecyclerview) {
    this.rootView = rootView;
    this.recyclerView1 = recyclerView1;
    this.searchingRecyclerview = searchingRecyclerview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTransportersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTransportersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_transporters, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTransportersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyclerView1;
      RecyclerView recyclerView1 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView1 == null) {
        break missingId;
      }

      id = R.id.searchingRecyclerview;
      EditText searchingRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (searchingRecyclerview == null) {
        break missingId;
      }

      return new ActivityTransportersBinding((RelativeLayout) rootView, recyclerView1,
          searchingRecyclerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
