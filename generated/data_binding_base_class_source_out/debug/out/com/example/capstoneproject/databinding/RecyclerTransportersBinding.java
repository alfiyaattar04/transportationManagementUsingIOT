// Generated by view binder compiler. Do not edit!
package com.example.capstoneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.capstoneproject.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerTransportersBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView recCard;

  @NonNull
  public final ShapeableImageView recImage;

  @NonNull
  public final TextView recTransporterEmail;

  @NonNull
  public final TextView recTransporterLocation;

  @NonNull
  public final TextView recTransporterName;

  private RecyclerTransportersBinding(@NonNull CardView rootView, @NonNull CardView recCard,
      @NonNull ShapeableImageView recImage, @NonNull TextView recTransporterEmail,
      @NonNull TextView recTransporterLocation, @NonNull TextView recTransporterName) {
    this.rootView = rootView;
    this.recCard = recCard;
    this.recImage = recImage;
    this.recTransporterEmail = recTransporterEmail;
    this.recTransporterLocation = recTransporterLocation;
    this.recTransporterName = recTransporterName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerTransportersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerTransportersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_transporters, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerTransportersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView recCard = (CardView) rootView;

      id = R.id.recImage;
      ShapeableImageView recImage = ViewBindings.findChildViewById(rootView, id);
      if (recImage == null) {
        break missingId;
      }

      id = R.id.recTransporterEmail;
      TextView recTransporterEmail = ViewBindings.findChildViewById(rootView, id);
      if (recTransporterEmail == null) {
        break missingId;
      }

      id = R.id.recTransporterLocation;
      TextView recTransporterLocation = ViewBindings.findChildViewById(rootView, id);
      if (recTransporterLocation == null) {
        break missingId;
      }

      id = R.id.recTransporterName;
      TextView recTransporterName = ViewBindings.findChildViewById(rootView, id);
      if (recTransporterName == null) {
        break missingId;
      }

      return new RecyclerTransportersBinding((CardView) rootView, recCard, recImage,
          recTransporterEmail, recTransporterLocation, recTransporterName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
