package com.dark.moviesbd.utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.dark.moviesbd.R;

public class Loading {
    Context context;
    Dialog dialog;

    public Loading(Context context) {
        this.context = context;
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.loading_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
    }

    public void animate(boolean bool) {
        if(bool) {
            dialog.show();
        } else {
            dialog.dismiss();
        }
    }
}
