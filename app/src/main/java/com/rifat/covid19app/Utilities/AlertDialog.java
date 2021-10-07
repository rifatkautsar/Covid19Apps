package com.rifat.covid19app.Utilities;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ProgressBar;

import com.rifat.covid19app.R;

/**
 * Created by Rifat on 10/7/21.
 */
public class AlertDialog {

    private Dialog progressDialog = null;
    private ProgressBar progressBar;


    public void showPopupProgressSpinner(Boolean isShowing) {
        if (isShowing == true) {
            progressDialog = new Dialog(progressBar.getContext());
            progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            progressDialog.setContentView(R.layout.item_loadingbar);
            progressDialog.setCancelable(false);
            progressDialog.getWindow().setBackgroundDrawable(
                    new ColorDrawable(Color.TRANSPARENT));

            progressBar = (ProgressBar) progressDialog
                    .findViewById(R.id.progresBarLoad);
            progressBar.getIndeterminateDrawable().setColorFilter(
                    Color.parseColor("#ff6700"),
                    android.graphics.PorterDuff.Mode.MULTIPLY);
            progressDialog.show();
        } else if (isShowing == false) {
            progressDialog.dismiss();
        }
    }
}
