package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class Lq {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, @Nullable Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            new AlertDialog.Builder(context).setTitle(JR.A0V(context)).setMessage(JR.A0T(context)).setPositiveButton(JR.A0U(context), new DialogInterface$OnClickListenerC1085Lp(onClickListener)).setNegativeButton(JR.A0S(context), new DialogInterface$OnClickListenerC1084Lo(onClickListener2)).show();
        }
    }
}
